/**
 * SICS TAC Server - InfoServer
 * http://www.sics.se/tac/	  tac-dev@sics.se
 *
 * Copyright (c) 2001-2005 SICS AB. All rights reserved.
 *
 * SICS grants you the right to use, modify, and redistribute this
 * software for noncommercial purposes, on the conditions that you:
 * (1) retain the original headers, including the copyright notice and
 * this text, (2) clearly document the difference between any derived
 * software and the original, and (3) acknowledge your use of this
 * software in pertaining publications and reports.  SICS provides
 * this software "as is", without any warranty of any kind.  IN NO
 * EVENT SHALL SICS BE LIABLE FOR ANY DIRECT, SPECIAL OR INDIRECT,
 * PUNITIVE, INCIDENTAL OR CONSEQUENTIAL LOSSES OR DAMAGES ARISING OUT
 * OF THE USE OF THE SOFTWARE.
 *
 * -----------------------------------------------------------------
 *
 * LogFormatter
 *
 * Author  : Joakim Eriksson, Niclas Finne, Sverker Janson
 * Created : 19 April, 2002
 * Updated : $Date: 2005/06/07 19:06:17 $
 *	     $Revision: 1.1 $
 */

package se.sics.tac.util;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.File;
import java.util.logging.*;
import java.util.Date;
import java.util.Hashtable;
import java.text.SimpleDateFormat;

public class LogFormatter extends Formatter {

  final static String EOL = System.getProperty("line.separator", "\r\n");

  private Hashtable aliasTable;
  private int aliasLevel = 0;

  private SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM HH:mm:ss");
  private Date date = new Date(0L);
  private boolean isUTC = false;
  private long timeDiff = 0L;

  public synchronized String format(LogRecord record) {
    StringBuffer sb = new StringBuffer();
    date.setTime(record.getMillis() + timeDiff);
    sb.append(dFormat.format(date)).append(' ')
      .append(record.getLevel()).append(' ')
      .append(getAliasFor(record.getLoggerName())).append('|')
      .append(record.getMessage())
      .append(EOL);

    if (record.getThrown() != null) {
      try {
	StringWriter out = new StringWriter();
	PrintWriter pout = new PrintWriter(out);
	record.getThrown().printStackTrace(pout);
	pout.close();
	sb.append(out.toString());
      } catch (Exception e) {
      }
    }

    return sb.toString();
  }

  public synchronized void setTimeDiff(long timeDiff) {
    this.timeDiff = timeDiff;
    // Make sure the date formatter is set to timezone UTC (0)
    if (!isUTC) {
      isUTC = true;
      dFormat.setTimeZone(new java.util.SimpleTimeZone(0, "UTC"));
    }
  }

  private String getAliasFor(String name) {
    Hashtable aliases = this.aliasTable;
    if (aliases == null) {
      return name;
    }

    String value = (String) aliases.get(name);
    if (value != null) {
      return value;
    }
    // Alias not already in table.  Time to insert it.
    int level = this.aliasLevel;
    if (level > 0) {
      String a;
      if (level == 1) {
	// Special case for optimization
	int index = name.lastIndexOf('.');
	a = (index >= 0 && index < (name.length() - 1))
	  ? name.substring(index + 1)
	  : name;
      } else {
	int index = name.length() - 2;
	while (index >= 0) {
	  if (name.charAt(index) == '.') {
	    level--;
	    if (level == 0) {
	      break;
	    }
	  }
	  index--;
	}
	if (index >= 0) {
	  a = name.substring(index + 1);
	} else {
	  a = name;
	}
      }
      aliases.put(name, a);
      return a;

    } else {
      this.aliasTable = null;
      return name;
    }
  }

  public synchronized void setAliasLevel(int aliasLevel) {
    if (this.aliasLevel != aliasLevel) {
      this.aliasLevel = aliasLevel;
      this.aliasTable = (aliasLevel > 0) ? new Hashtable() : null;
    }
  }



  // -------------------------------------------------------------------
  //
  // -------------------------------------------------------------------

  /**
   * Sets alias for the log output.
   *
   * @param aliasMap in the form name1, alias1, name2, alias2, etc
   * @deprectated use setAliasLevel instead
   */
  public static void setAlias(String[] aliasMap) {
  }

  /**
   * @deprectated use setAliasLevel instead
   */
  public static void setAlias(String name, String alias) {
  }

  public static void separator(Logger log, Level level, String title) {
    separator(log, level, title, title);
  }

  public static void separator(Logger log, Level level, String title,
			       String message) {
    log.log(level, title + EOL
	    + "************************************************************"
	    + EOL
	    + "* " + message + EOL
	    + "************************************************************"
	    + EOL + EOL);
  }

  public static void setFormatterForAllHandlers(Formatter formatter) {
    Handler[] logHandlers = Logger.getLogger("").getHandlers();
    if (logHandlers != null) {
      for (int i = 0, n = logHandlers.length; i < n; i++) {
	logHandlers[i].setFormatter(formatter);
      }
    }
  }

  public static void setConsoleLevel(Level level) {
    Handler[] logHandlers = Logger.getLogger("").getHandlers();
    if (logHandlers != null) {
      for (int i = 0, n = logHandlers.length; i < n; i++) {
	if (logHandlers[i] instanceof ConsoleHandler) {
	  // Perhaps should break here because there should never be
	  // two console handlers? FIX THIS!
	  logHandlers[i].setLevel(level);
	}
      }
    }
  }

  public static Level getLogLevel(int level) {
    if (level <= 0) {
      return Level.ALL;
    } else {
      switch (level) {
      case 1:
	return Level.FINEST;
      case 2:
	return Level.FINER;
      case 3:
	return Level.FINE;
      case 4:
	return Level.WARNING;
      case 5:
	return Level.SEVERE;
      default:
	return Level.OFF;
      }
    }
  }

  public static void setFileLevel(Level level) {
    Handler[] logHandlers = Logger.getLogger("").getHandlers();
    if (logHandlers != null) {
      for (int i = 0, n = logHandlers.length; i < n; i++) {
	if (logHandlers[i] instanceof FileHandler) {
	  logHandlers[i].setLevel(level);
	}
      }
    }
  }

  public static void setLevelForAllHandlers(Level level) {
    Handler[] logHandlers = Logger.getLogger("").getHandlers();
    if (logHandlers != null) {
      for (int i = 0, n = logHandlers.length; i < n; i++) {
	logHandlers[i].setLevel(level);
      }
    }
  }

  public static void warnAboutLocks(String base) {
    warnAboutLocks(base, false);
  }

  public static void warnAboutLocks(String base, boolean forceRemove) {
    File currentDir = new File(".");
    File[] childs = currentDir.listFiles();
    for (int i = 0, n = childs.length; i < n; i++) {
      if (childs[i].isFile() && matchName(childs[i].getName(), base)) {
	if (forceRemove) {
	  removeLockFile(childs[i], false);
	} else {
	  boolean notDone = true;
	  int c;
	  // Lock detected
	  do {
	    System.err.print("Remove log lock file '" + childs[i].getName()
			     + "' (Y/N)? ");
	    c = readToEOL();
	    if (c == 'Y' || c == 'y') {
	      notDone = false;
	      removeLockFile(childs[i], true);
	    } else if (c == 'N' || c == 'n') {
	      notDone = false;
	    }
	  } while (notDone);
	}
      }
    }
  }

  public static String toString(double d) {
    int i = (int) d;
    if (d < 0) {
      d = -d;
    }
    int dec = ((int) (0.5 + d * 100)) % 100;
    return "" + i + '.' + (dec < 10 ? "0" : "") + dec;
  }

  private static void removeLockFile(File fp, boolean waitForEOL) {
    if (!fp.delete()) {
      System.err.println("could not remove log lock file '"
			 + fp.getAbsolutePath() + '\'');
      if (waitForEOL) {
	System.out.println("[PRESS ENTER TO CONTINUE]");
	readToEOL();
      }
    } else {
      System.err.println("removed log lock file '" + fp.getName() + '\'');
    }
  }

  private static boolean matchName(String name, String base) {
    return name.startsWith(base) && name.endsWith(".log.lck");
  }

  private static int readToEOL() {
    try {
      int c = System.in.read();
      if (c != 10) {
	while (System.in.read() != 10);
      }
      return c;
    } catch (Exception e) {
      e.printStackTrace();
      return 0;
    }
  }

} // LogFormatter

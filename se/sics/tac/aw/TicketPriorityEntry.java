/**
 * 
 */
package se.sics.tac.aw;


/**
 * @author Lee Stone
 *
 */
public class TicketPriorityEntry implements Comparable<TicketPriorityEntry>{
	
	private int client;
	private int eType;
	private int funBonus;
	private int dayAssigned;
	
	/**
	 * @param client
	 * @param eType
	 * @param funBonus
	 * @param dayAssigned
	 */
	public TicketPriorityEntry(int client, int eType, int funBonus,
			int dayAssigned) {
		this.client = client;
		this.eType = eType;
		this.funBonus = funBonus;
		this.dayAssigned = dayAssigned;
	}

	/**
	 * @return the client
	 */
	public int getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(int client) {
		this.client = client;
	}

	/**
	 * @return the eType
	 */
	public int geteType() {
		return eType;
	}

	/**
	 * @param eType the eType to set
	 */
	public void seteType(int eType) {
		this.eType = eType;
	}

	/**
	 * @return the funBonus
	 */
	public int getFunBonus() {
		return funBonus;
	}

	/**
	 * @param funBonus the funBonus to set
	 */
	public void setFunBonus(int funBonus) {
		this.funBonus = funBonus;
	}

	/**
	 * @return the dayAssigned
	 */
	public int getDayAssigned() {
		return dayAssigned;
	}

	/**
	 * @param dayAssigned the dayAssigned to set
	 */
	public void setDayAssigned(int dayAssigned) {
		this.dayAssigned = dayAssigned;
	}

	/**
	 * 
	 * @param tpe
	 * @return
	 */
	@Override
	public int compareTo(TicketPriorityEntry tpe) {
		return this.funBonus - tpe.funBonus;
	}
	
	

}

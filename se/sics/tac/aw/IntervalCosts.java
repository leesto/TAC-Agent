/**
 * 
 */
package se.sics.tac.aw;

import java.util.ArrayList;

/**
 * @author Lee Stone
 *
 */
public class IntervalCosts {

	private ArrayList<Float> interval0;
	private ArrayList<Float> interval1;
	private ArrayList<Float> interval2;
	private ArrayList<Float> interval3;
	private ArrayList<Float> interval4;
	private ArrayList<Float> interval5;
	private ArrayList<Float> interval6;
	private ArrayList<Float> interval7;
	private ArrayList<Float> interval8;
	private ArrayList<Float> interval9;
	private ArrayList<Float> interval10;
	private ArrayList<Float> interval11;
	private ArrayList<Float> interval12;
	private ArrayList<Float> interval13;
	private ArrayList<Float> interval14;
	private ArrayList<Float> interval15;
	private ArrayList<Float> interval16;
	private ArrayList<Float> interval17;
	
	/**
	 * 
	 */
	public IntervalCosts(){
		interval0 = new ArrayList<Float>();
		interval1 = new ArrayList<Float>();
		interval2 = new ArrayList<Float>();
		interval3 = new ArrayList<Float>();
		interval4 = new ArrayList<Float>();
		interval5 = new ArrayList<Float>();
		interval6 = new ArrayList<Float>();
		interval7 = new ArrayList<Float>();
		interval8 = new ArrayList<Float>();
		interval9 = new ArrayList<Float>();
		interval10 = new ArrayList<Float>();
		interval11 = new ArrayList<Float>();
		interval12 = new ArrayList<Float>();
		interval13 = new ArrayList<Float>();
		interval14 = new ArrayList<Float>();
		interval15 = new ArrayList<Float>();
		interval16 = new ArrayList<Float>();
		interval17 = new ArrayList<Float>();
	}
	
	/**
	 * 
	 * @param interval
	 * @param cost
	 */
	public void addCost(int interval, float cost){
		switch (interval){
			case 0:
				interval0.add(cost);
				break;
			case 1:
				interval1.add(cost);
				break;
			case 2:
				interval2.add(cost);
				break;
			case 3:
				interval3.add(cost);
				break;
			case 4:
				interval4.add(cost);
				break;
			case 5:
				interval5.add(cost);
				break;
			case 6:
				interval6.add(cost);
				break;
			case 7:
				interval7.add(cost);
				break;
			case 8:
				interval8.add(cost);
				break;
			case 9:
				interval9.add(cost);
				break;
			case 10:
				interval10.add(cost);
				break;
			case 11:
				interval11.add(cost);
				break;
			case 12:
				interval12.add(cost);
				break;
			case 13:
				interval13.add(cost);
				break;
			case 14:
				interval14.add(cost);
				break;
			case 15:
				interval15.add(cost);
				break;
			case 16:
				interval16.add(cost);
				break;
			case 17:
				interval17.add(cost);
				break;
			default:
				//Should NEVER reach here
				break;
		}
	}
	
	/**
	 * Returns how many games we have records for
	 * @return int - the number of games we have records for
	 */
	public int getRecordNumbers(){
		return interval0.size();
	}
	
	/**
	 * When given an interval ID, it returns the list of costs which have been stored
	 * @param interval - the int of the interval to return
	 * @return ArrayList<Float> - Contains all of the costs which have been loaded from the CML File
	 */
	public ArrayList<Float> getIntervalEntries(int interval){
		switch (interval){
		case 0:
			return interval0;
		case 1:
			return interval1;
		case 2:
			return interval2;
		case 3:
			return interval3;
		case 4:
			return interval4;
		case 5:
			return interval5;
		case 6:
			return interval6;
		case 7:
			return interval7;
		case 8:
			return interval8;
		case 9:
			return interval9;
		case 10:
			return interval10;
		case 11:
			return interval11;
		case 12:
			return interval12;
		case 13:
			return interval13;
		case 14:
			return interval14;
		case 15:
			return interval15;
		case 16:
			return interval16;
		case 17:
			return interval17;
		default:
			//Should NEVER reach here
			return null;
		}
	}
}

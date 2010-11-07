/**
 * 
 */
package se.sics.tac.aw;

import java.util.ArrayList;

/**
 * @author Lee Stone
 *
 */
public class ReadCosts {

	private IntervalCosts in_1;
	private IntervalCosts in_2;
	private IntervalCosts in_3;
	private IntervalCosts in_4;
	private IntervalCosts out_2;
	private IntervalCosts out_3;
	private IntervalCosts out_4;
	private IntervalCosts out_5;
	
	public ReadCosts(){
		in_1 = new IntervalCosts();
		in_2 =  new IntervalCosts();
		in_3 = new IntervalCosts();
		in_4 = new IntervalCosts();
		out_2 = new IntervalCosts();
		out_3 = new IntervalCosts();
		out_4 = new IntervalCosts();
		out_5 = new IntervalCosts();
	}
	
	/**
	 * Adds the cost to the record
	 * @param dir
	 * @param day
	 * @param interval
	 * @param cost
	 */
	public void addCost(FlightDirection dir, int day, int interval, float cost){
		if(dir==FlightDirection.In){
			if(day==1){
				in_1.addCost(interval, cost);
			}else if(day==2){
				in_2.addCost(interval, cost);
			}else if(day==3){
				in_3.addCost(interval, cost);
			}else if(day==4){
				in_4.addCost(interval, cost);
			}else{
				//Shouldn't reach here
			}
		}else if(dir==FlightDirection.Out){
			if(day==5){
				out_5.addCost(interval, cost);
			}else if(day==2){
				out_2.addCost(interval, cost);
			}else if(day==3){
				out_3.addCost(interval, cost);
			}else if(day==4){
				out_4.addCost(interval, cost);
			}else{
				//Shouldn't reach here
			}
		}else{
			//Shouldn't reach here
		}
	}
	
	/**
	 * 
	 * @return int - the number of games we have records for
	 */
	public int getRecordNumbers(){
		return in_1.getRecordNumbers();
	}
	
	/**
	 * Returns an array containing all of the costs
	 * @return
	 */
	public ArrayList<IntervalCosts> getAllReadCosts(){
		ArrayList<IntervalCosts> allCosts = new ArrayList<IntervalCosts>();
		
		allCosts.add(in_1);
		allCosts.add(in_2);
		allCosts.add(in_3);
		allCosts.add(in_4);
		allCosts.add(out_2);
		allCosts.add(out_3);
		allCosts.add(out_4);
		allCosts.add(out_5);
		
		return allCosts;
	}

}

/**
 * 
 */
package se.sics.tac.aw;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.lang.Float;

/**
 * @author Lee Stone
 *
 */
public class LoggedCosts {

	private ArrayList<Float> in_1;
	private ArrayList<Float> in_2;
	private ArrayList<Float> in_3;
	private ArrayList<Float> in_4;
	private ArrayList<Float> out_2;
	private ArrayList<Float> out_3;
	private ArrayList<Float> out_4;
	private ArrayList<Float> out_5;
	
	/**
	 * Constructor initialises all the arrays to have 17 slots, all set to false
	 */
	public LoggedCosts() {
		in_1 = initialiseArray();
		in_2 = initialiseArray();
		in_3 = initialiseArray();
		in_4 = initialiseArray();
		out_2 = initialiseArray();
		out_3 = initialiseArray();
		out_4 = initialiseArray();
		out_5 = initialiseArray();
	}
	
	/**
	 * 
	 * @param arrayList
	 */
	private ArrayList<Float> initialiseArray(){
		ArrayList<Float> tempList = new ArrayList<Float>();
		for(int i=0; i<18; i++){
			tempList.add(new Float(0));
		}
		return tempList;
	}
	
	/**
	 * 
	 * @param dir - FlightDirection to indicate the direction of the flight
	 * @param day - int to indicate the day which the flight is taking place
	 * @param time - int the integer to represent the time code (0-17, representing 30 second intervals)
	 * @return cost - the logged cost
	 */
	public float getLoggedCost(FlightDirection dir, int day, int time){
		if(dir==FlightDirection.In){
			if(day==1){
				return in_1.get(time);
			}else if(day==2){
				return in_2.get(time);
			}else if(day==3){
				return in_3.get(time);
			}else if(day==4){
				return in_4.get(time);
			}else{
				//Shouldn't reach here
				return 0;
			}
		}else if(dir==FlightDirection.Out){
			if(day==5){
				return out_5.get(time);
			}else if(day==2){
				return out_2.get(time);
			}else if(day==3){
				return out_3.get(time);
			}else if(day==4){
				return out_4.get(time);
			}else{
				//Shouldn't reach here
				return 0;
			}
		}else{
			//Shouldn't reach here
			return 0;
		}
		
	}
	
	/**
	 * 
	 * @param dir
	 * @param day
	 * @param time
	 * @param cost
	 */
	public void setLoggedCost(FlightDirection dir, int day, int time, float cost){
		if(dir==FlightDirection.In){
			if(day==1){
				in_1.set(time, cost);
			}else if(day==2){
				in_2.set(time, cost);
			}else if(day==3){
				in_3.set(time, cost);
			}else if(day==4){
				in_4.set(time, cost);
			}else{
				//Shouldn't reach here
			}
		}else if(dir==FlightDirection.Out){
			if(day==5){
				out_5.set(time, cost);
			}else if(day==2){
				out_2.set(time, cost);
			}else if(day==3){
				out_3.set(time, cost);
			}else if(day==4){
				out_4.set(time, cost);
			}else{
				//Shouldn't reach here
			}
		}else{
			//Shouldn't reach here
		}
		
	}
	
	/**
	 * Prints the storred arrays out in the log for easy debugging
	 * @param log
	 */
	public void printToLog(Logger log){
		for(int day=1; day<5; day++){
			for(int costSlot=0; costSlot<18; costSlot++){
				log.finest("Direction: In Day: " + day + " Cost: "+ getLoggedCost(FlightDirection.In, day, costSlot));
			}
		}
		for(int day=2; day<6; day++){
			for(int costSlot=0; costSlot<18; costSlot++){
				log.finest("Direction: Out Day: " + day + " Cost: "+ getLoggedCost(FlightDirection.Out, day, costSlot));
			}
		}
		
	}
}

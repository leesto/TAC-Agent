/**
 * 
 */
package se.sics.tac.aw;

import java.util.ArrayList;

/**
 * @author Lee Stone
 *
 */
public class FlightsLogged {
	private ArrayList<Boolean> in_1;
	private ArrayList<Boolean> in_2;
	private ArrayList<Boolean> in_3;
	private ArrayList<Boolean> in_4;
	private ArrayList<Boolean> out_2;
	private ArrayList<Boolean> out_3;
	private ArrayList<Boolean> out_4;
	private ArrayList<Boolean> out_5;
	
	/**
	 * Constructor initialises all the arrays to have 17 slots, all set to false
	 */
	public FlightsLogged() {
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
	private ArrayList<Boolean> initialiseArray(){
		ArrayList<Boolean> tempList = new ArrayList<Boolean>();
		for(int i=0; i<19; i++){
			tempList.add(false);
		}
		return tempList;
	}
	
	/**
	 * 
	 * @param dir - FlightDirection to indicate the direction of the flight
	 * @param day - int to indicate the day which the flight is taking place
	 * @param time - int the integer to represent the time code (0-17, representing 30 second intervals)
	 * @return
	 */
	public boolean checkIfLogged(FlightDirection dir, int day, int time){
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
				return false;
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
				return false;
			}
		}else{
			//Shouldn't reach here
			return false;
		}
		
	}
	
	public void loggedFlight(FlightDirection dir, int day, int time){
		if(dir==FlightDirection.In){
			if(day==1){
				in_1.set(time, true);
			}else if(day==2){
				in_2.set(time, true);
			}else if(day==3){
				in_3.set(time, true);
			}else if(day==4){
				in_4.set(time, true);
			}else{
				//Shouldn't reach here
			}
		}else if(dir==FlightDirection.Out){
			if(day==5){
				out_5.set(time, true);
			}else if(day==2){
				out_2.set(time, true);
			}else if(day==3){
				out_3.set(time, true);
			}else if(day==4){
				out_4.set(time, true);
			}else{
				//Shouldn't reach here
			}
		}else{
			//Shouldn't reach here
		}
		
	}
}

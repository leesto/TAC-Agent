/**
 * 
 */
package se.sics.tac.aw;

/**
 * @author Lee Stone
 *
 */
public class ClientEntertainmentAlloc {

	private EntertainmentAllocation e1;
	private EntertainmentAllocation e2;
	private EntertainmentAllocation e3;
	private int daysAssigned = 0;
	private int daysPossible;
	private int client;
	
	/**
	 * @param e1
	 * @param e2
	 * @param e3
	 * @param daysPossible
	 */
	public ClientEntertainmentAlloc(EntertainmentAllocation e1,
			EntertainmentAllocation e2, EntertainmentAllocation e3,
			int daysPossible, int client) {
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
		this.daysPossible = daysPossible;
		this.client = client;
	}

	/**
	 * @return the e1
	 */
	public EntertainmentAllocation getE1() {
		return e1;
	}

	/**
	 * @param e1 the e1 to set
	 */
	public void setE1(EntertainmentAllocation e1) {
		this.e1 = e1;
	}

	/**
	 * @return the e2
	 */
	public EntertainmentAllocation getE2() {
		return e2;
	}

	/**
	 * @param e2 the e2 to set
	 */
	public void setE2(EntertainmentAllocation e2) {
		this.e2 = e2;
	}

	/**
	 * @return the e3
	 */
	public EntertainmentAllocation getE3() {
		return e3;
	}

	/**
	 * @param e3 the e3 to set
	 */
	public void setE3(EntertainmentAllocation e3) {
		this.e3 = e3;
	}

	/**
	 * @return the daysAssigned
	 */
	public int getDaysAssigned() {
		return daysAssigned;
	}

	/**
	 * @param daysAssigned the daysAssigned to set
	 */
	public void setDaysAssigned(int daysAssigned) {
		this.daysAssigned = daysAssigned;
	}

	/**
	 * @return the daysPossible
	 */
	public int getDaysPossible() {
		return daysPossible;
	}

	/**
	 * @param daysPossible the daysPossible to set
	 */
	public void setDaysPossible(int daysPossible) {
		this.daysPossible = daysPossible;
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

	public boolean dayAvailable(int day){
		return (e1.getAssignedDay()!=day && e2.getAssignedDay()!=day && e3.getAssignedDay()!=day);
	}
	
	/**
	 * When provided with the interger of the Entertainment type, it returns the allocation details for this client
	 * @param eType
	 * @return
	 */
	public EntertainmentAllocation getEntertainmentAllocation(int eType){
		if(eType==1){
			return getE1();
		}else if(eType==2){
			return getE2();
		}else if(eType==3){
			return getE3();
		}else{
			return null;
		}
	}
	
	/**
	 * When provided with the interger of the Entertainment type, it sets the allocation details for this client
	 * @param eType
	 * @param entAlloc
	 */
	public void setEntertainmentAllocation(int eType, EntertainmentAllocation entAlloc){
		if(eType==1){
			setE1(entAlloc);
		}else if(eType==2){
			setE2(entAlloc);
		}else if(eType==3){
			setE3(entAlloc);
		}
	}
	
	/**
	 * Updates the Entertainment Allocation with the assigned day when given an eType and day
	 * @param eType
	 * @param day
	 */
	public void updateEntertainmentAllocation(int eType, int day){
		EntertainmentAllocation ea = this.getEntertainmentAllocation(eType);
		ea.setAssignedDay(day);
		setEntertainmentAllocation(eType, ea);
		
	}

}

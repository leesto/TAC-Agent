/**
 * 
 */
package se.sics.tac.aw;

/**
 * @author Lee Stone
 *
 */
public class AllocationsChecked {

	private int client=-1;
	private int day =-1;
	
	/**
	 * @param client
	 * @param day
	 */
	public AllocationsChecked(int client, int day) {
		this.client = client;
		this.day = day;
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
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
}

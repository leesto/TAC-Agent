/**
 * 
 */
package se.sics.tac.aw;

/**
 * @author Lee Stone
 *
 */
public class AllocateTicketResult {

	private boolean success;
	private int client;
	private int day;
	private int eType;
	private int value;
	private int priorityPosition;
	
	/**
	 * Constructs a result which is used when unsuccessul - we then don't care about the other fields
	 * @param success
	 */
	public AllocateTicketResult(boolean success) {
		this.success = success;
	}

	/**
	 * @param success
	 * @param client
	 * @param day
	 * @param eType
	 * @param value
	 * @param priorityPosition
	 */
	public AllocateTicketResult(boolean success, int client, int day,
			int eType, int value, int priorityPosition) {
		this.success = success;
		this.client = client;
		this.day = day;
		this.eType = eType;
		this.value = value;
		this.priorityPosition = priorityPosition;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
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
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the priorityPosition
	 */
	public int getPriorityPosition() {
		return priorityPosition;
	}

	/**
	 * @param priorityPosition the priorityPosition to set
	 */
	public void setPriorityPosition(int priorityPosition) {
		this.priorityPosition = priorityPosition;
	}
	
	
}

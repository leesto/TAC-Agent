/**
 * 
 */
package se.sics.tac.aw;

/**
 * @author Lee Stone
 *
 */
public class TicketBid {

	private int auctionId;
	private int clientId;
	private int eType;
	private int currentSalePrice;
	private int startingSalePrice;
	private int value;
	
	/**
	 * @param auctionId
	 * @param clientId
	 * @param eType
	 * @param currentSalePrice
	 * @param startingSalePrice
	 * @param value
	 */
	public TicketBid(int auctionId, int clientId, int eType, int currentSalePrice,
			int startingSalePrice,int value) {
		this.auctionId = auctionId;
		this.clientId = clientId;
		this.eType = eType;
		this.currentSalePrice = currentSalePrice;
		this.startingSalePrice = startingSalePrice;
		this.value = value;
	}
	/**
	 * @return the auctionId
	 */
	public int getAuctionId() {
		return auctionId;
	}
	/**
	 * @param auctionId the auctionId to set
	 */
	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}
	/**
	 * @return the clientId
	 */
	public int getClientId() {
		return clientId;
	}
	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(int clientId) {
		this.clientId = clientId;
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
	 * @return the currentSalePrice
	 */
	public int getCurrentSalePrice() {
		return currentSalePrice;
	}
	/**
	 * @param currentSalePrice the currentSalePrice to set
	 */
	public void setCurrentSalePrice(int salePrice) {
		this.currentSalePrice = salePrice;
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
	 * @return the startingSalePrice
	 */
	public int getStartingSalePrice() {
		return startingSalePrice;
	}
	/**
	 * @param startingSalePrice the startingSalePrice to set
	 */
	public void setStartingSalePrice(int startingSalePrice) {
		this.startingSalePrice = startingSalePrice;
	}
	
}

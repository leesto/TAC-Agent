/**
 * 
 */
package se.sics.tac.aw;

/**
 * @author Lee Stone
 *
 */
public class TicketSale {

	private int auctionId;
	private int clientId;
	private int eType;
	private int salePrice;
	private int value;
	private SalePurpose salePurpose;
	
	/**
	 * @param auctionId
	 * @param clientId
	 * @param eType
	 * @param salePrice
	 * @param value
	 * @param salePurpose
	 */
	public TicketSale(int auctionId, int clientId, int eType, int salePrice,
			int value, SalePurpose salePurpose) {
		this.auctionId = auctionId;
		this.clientId = clientId;
		this.eType = eType;
		this.salePrice = salePrice;
		this.value = value;
		this.salePurpose = salePurpose;
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
	 * @return the salePrice
	 */
	public int getSalePrice() {
		return salePrice;
	}

	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
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
	 * @return the salePurpose
	 */
	public SalePurpose getSalePurpose() {
		return salePurpose;
	}

	/**
	 * @param salePurpose the salePurpose to set
	 */
	public void setSalePurpose(SalePurpose salePurpose) {
		this.salePurpose = salePurpose;
	}
	
}

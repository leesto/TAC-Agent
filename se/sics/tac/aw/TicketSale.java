/**
 * 
 */
package se.sics.tac.aw;


/**
 * @author Lee Stone
 *
 */
public class TicketSale extends TicketBid{

	private SalePurpose salePurpose;
	
	/**
	 * 
	 * @param auctionId
	 * @param clientId
	 * @param eType
	 * @param currentSalePrice
	 * @param startingSalePrice
	 * @param value
	 */
	public TicketSale(int auctionId, int clientId, int eType,
			int currentSalePrice, int startingSalePrice, int value) {
		super(auctionId, clientId, eType, currentSalePrice, startingSalePrice, value);
	}
	
	/**
	 * @param auctionId
	 * @param clientId
	 * @param eType
	 * @param currentSalePrice
	 * @param startingSalePrice
	 * @param value
	 * @param salePurpose
	 */
	public TicketSale(int auctionId, int clientId, int eType,
			int currentSalePrice, int startingSalePrice, int value, SalePurpose salePurpose) {
		super(auctionId, clientId, eType, currentSalePrice, startingSalePrice, value);
		this.salePurpose = salePurpose;
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

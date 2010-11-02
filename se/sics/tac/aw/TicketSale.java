/**
 * 
 */
package se.sics.tac.aw;

import java.util.logging.Logger;

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
	 * @param salePrice
	 * @param value
	 */
	public TicketSale(int auctionId, int clientId, int eType, int salePrice,
			int value) {
		super(auctionId, clientId, eType, salePrice, value);
	}
	
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
		super(auctionId, clientId, eType, salePrice, value);
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

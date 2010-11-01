package se.sics.tac.aw;

public class TicketPurchase extends TicketBid{

	/**
	 * 
	 * @param auctionId
	 * @param clientId
	 * @param eType
	 * @param salePrice
	 * @param value
	 */
	public TicketPurchase(int auctionId, int clientId, int eType,
			int salePrice, int value) {
		super(auctionId, clientId, eType, salePrice, value);
	}

}

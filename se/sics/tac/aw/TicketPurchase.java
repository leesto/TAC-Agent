package se.sics.tac.aw;

public class TicketPurchase extends TicketBid{

	/**
	 * 
	 * @param auctionId
	 * @param clientId
	 * @param eType
	 * @param currentSalePrice
	 * @param startingSalePrice
	 * @param value
	 */
	public TicketPurchase(int auctionId, int clientId, int eType,
			int currentSalePrice, int startingSalePrice, int value) {
		super(auctionId, clientId, eType, currentSalePrice, startingSalePrice, value);
	}

}

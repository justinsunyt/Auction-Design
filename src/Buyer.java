
public class Buyer {
	private String buyerName;
	private int buyerID;
	private double balance;
	
	public Buyer (int buyerID, String buyerName)
	{
		this.buyerName = buyerName;
		this.buyerID = buyerID;
	}
	
	public void bid (int auctionID, double amount) throws Exception
	{
		Auction thisAuction = Admin.getAuction(auctionID);
		thisAuction.receiveBid (buyerID, amount);
	}
	
	public int getBuyerID()
	{
		return buyerID;
	}
	
	public void subtractBalance(double difference)
	{
		balance-= difference;
	}


	
}

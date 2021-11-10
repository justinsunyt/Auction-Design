
public class Seller {
	private String sellerName;
	private int sellerID;
	private Auction currentAuction;
	private double balance;
	
	public Seller (String sellerName, int sellerID)
	{
		this.sellerName = sellerName;
		this.sellerID = sellerID;
	}
	
	public void createAuction (int timeLimit, String auctionName)
	{
		currentAuction = new Auction (this, "tempfilename", auctionName, timeLimit);
	}
	
	public void startAuction()
	{
		currentAuction.startAuction();
	}
	
	public void endAuction()
	{
		currentAuction.closeAuction();
	}
	
	public void changeBalance (double amount)
	{
		balance += amount;
	}
	
	public int getSellerID()
	{
		return sellerID;
	}
}

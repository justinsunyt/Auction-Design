import java.io.File;
import java.util.Timer; 
import java.util.TimerTask;
import java.io.FileReader;
import java.util.ArrayList;

public class Auction {
	
	private String auctionName;
//	private File image;
	private int timeLimit;
	private static int auctionCount = 0;
	private int auctionID;
	private Seller seller;
	private Buyer highestBidder;
	private double highestBidAmount;
	private ArrayList<Buyer> pastBidderList;
	public boolean isOpen;

	
	
	public Auction (Seller seller, String fileName, String auctionName, int timeLimit)
	{
		this.seller = seller;
		this.auctionName = auctionName;
		this.timeLimit = timeLimit;
		this.isOpen = true;
		highestBidder = null;
		highestBidAmount = 0.0;
		pastBidderList = new ArrayList<Buyer>();
//		close = new endAuction();
		
		auctionID = auctionCount;
		auctionCount++;
	}
	
	
	public void startAuction()
	{
		isOpen = true;
	}
	
	public void closeAuction()
	{
		isOpen = false;
		((Buyer) highestBidder).subtractBalance (highestBidAmount);
		seller.changeBalance (highestBidAmount);
	}
	public int getID()
	{
		return auctionID;
	}
	
	public void receiveBid(int newBidderID, double amount) throws Exception
	{
		Buyer newBidder = Admin.getBuyer(newBidderID);
		if (isOpen)
		{ 
			updateHighestBidder(newBidder);
			pastBidderList.add(newBidder);

		}
		else
		{
			throw new Exception ("Bid is closed");
		}
		
	}
	
	public void updateHighestBidder(Buyer newBidder)
	{
		highestBidder= newBidder;
		
	}
	
	public void updateHighestBid (double amount)
	{
		highestBidAmount = amount;
	}
//
//class endAuction extends TimerTask {
//	private int isClosed = false; 
//    public void run() {
//    	isClosed = true;
//        timer.cancel(); //Terminate the timer thread
//    }
}
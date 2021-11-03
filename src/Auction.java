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
	
	
	public Auction (Seller seller, String fileName, String auctionName, int timeLimit)
	{
		this.seller = seller;
		this.auctionName = auctionName;
		this.timeLimit = timeLimit;
		
		highestBidder = null;
		highestBidAmount = 0.0;
		pastBidderList = new ArrayList<Buyer>();
		
		
		auctionID = auctionCount;
		auctionCount++;
	}
	
	
	public void startAuction()
	{
		t
	}
}

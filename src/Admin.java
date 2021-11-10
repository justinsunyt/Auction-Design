import java.util.HashMap;

public class Admin {
	private static int auctionCount;
	private static HashMap<Integer, Auction> allAuctions;
	private static HashMap<Integer, Buyer> allBuyers;
	private static HashMap <Integer, Seller> allSellers;

	
	public Admin ()
	{
		auctionCount= 0;
		allAuctions = new HashMap<Integer, Auction>();
		allBuyers = new HashMap<Integer, Buyer>();
		allSellers = new HashMap<Integer, Seller>();
	}
	
	public static int getAuctionCount()
	{
		auctionCount++;
		return auctionCount;
	}
	
	public static Auction getAuction(int ID)
	{
		return allAuctions.get(ID);
	}
	
	public static void addAuction(Auction auction)
	{
		allAuctions.put (auction.getID(), auction);
	}
	
	public static void addBuyer(Buyer buyer)
	{
		allBuyers.put (buyer.getBuyerID(), buyer);
	}
	public static void addSeller(Seller seller)
	{
		allSellers.put (seller.getSellerID(), seller);
	}
	
	public static Buyer getBuyer(int ID)
	{
		return allBuyers.get(ID);
	}
	
	public static Seller getSeller(int ID)
	{
		return allSellers.get(ID);
	}
	
}

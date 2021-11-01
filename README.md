# Auction Design


Classes:
    - Auction (File prize, int auctionID, File pic, int timeLimit)
        - Variables:
            - File prize
                -The item being auctioned for
            - auctionName (String)
                - The name of the object set by a Seller. 
                - The length of the String must a min of 1 and a max of 100
            - File pic
                - The image for the auction. 
            - int timeLimit
                - timeLimit of auction
            - int auctionID
                - constructor will generate a unique auction ID for every Auction object
            - Seller seller 
            - Buyer highestBidder
                - constantly updates for the current highest bidder of auction
            - double highestBidAmount
                - constantly updates for the monetary amount of the highest bid
            - ArrayList<Buyer> pastBidderList
                - Keeps track of every past bidder of the auction
                - Does not include highestBidder (the current highest bidder)
        - Methods:
            - startAuction (): begins the auction
                - starts timer at initial time, timeLimit.
                - makes auction visible to all bidders
            - updateHighestBidder (Seller newBidder)
                - updates the variable highestBidder to the new higghest bidder and subtracts amount from highestBidder's wallet
                - refunds the money of the last highestBidder
            - endAuction (): ends the auction
                - gives item to highestBidder
                - randomly selects someone from pastBidderList and gives 50% of highestBidAmount to the selected Buyder
                - distributes the other 50% of highestBidAmount to the CS class
            
    - Seller (String name, int sellerID)
        - Variables:
            - sellerName (String)
            - sellerID (int)
            - currentAuction (Auction)
        - Methods:
            - createAuction (File prize, int auctionID, File pic, int timeLimit)
                - creates a new Auction (prize, auctionID, fileName, timeLimit) and stores the Auction in currentAuction
            - sets instance variable currentAuction to a new Auction object with the above parameters
            - startAuction (): calls currentAuction's startAuction method
            - endAuction (): calls currentAuction's endAuction method
    - Buyer (String name, String buyerID)
        - Variables:
            - buyerName (String)
            - buyerID (int)
                - the wallet ID of the buyer
        - Methods:
            - bid (int auctionID, double amount)
                - parameters
                    - auctionID (int) is the ID of the auction that the bid is being placed to
                    - amount (double) is the value of the bid being placed
                - behavior
                    - bids double amount to the auction with the corresponding auction ID
            





Priority List (IDK everything seems close to equally important for this):
    1. Auction class
    2. Buyer & Seller class


- All auctions must have a title and an image
    - Title should be 100 character max
    - Image can be png or jpeg
- All auctions have to have a set duration between 1 to 10 days
- When auction ends:
    - NFT goes to highest bidder
    - Highest bid goes towards creator of NFT
    - A random person is chosen from rest of bidders to receive 50% of bids (not including highest bid)
        - The other 50% is distributed to Honors Topics in CS class
    - If there are no bids, the creator receives 0.42069 WVC
- Only connected users can create and join auction
    - One auction at a time
- All users can view all auction listings
    - Tabs for past and ongoing auctions


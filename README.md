# Auction Design


Classes:
    - Auction
        - Variables:
            - String auctionName
                - The name of the object set by a Seller. 
                - The length of the String must a min of 1 and a max of 100
            - File image
                - The image for the auction. 
                - Use FileReader to read file specified by the String fileName entered by the seller.
            - int timeLimit
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
                - starts timer
                - makes auction visible to all bidders
            - endAuction (): ends the auction
                - subtracts highestBidAmount from highestBidder's wallet
                - gives item to highestBidder
                - randomly selects someone from pastBidderList and gives 50% of highestBidAmount to the selected Buyder
                - distributes the other 50% of highestBidAmount to the CS class
    - Seller (String name, int sellerID)
        - Variables:
            - String sellerName
            - int sellerID
        - Methods:
            - createAuction (string auctionName, String fileName, int timeLimit)
            - startAuction (): calls Auction's startAuction method
            - endAuction (): calls Auction's endAuction method
    - Buyer (String name, String buyerID)
        - Variables:
            - String buyerName
            - String buyerID
                - the wallet ID of the buyer
        - Methods:
            - bid (int auctionID, double amount)
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


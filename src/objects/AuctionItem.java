package objects;

public class AuctionItem {

	private String itemName;
	
	private int currentBid;
	
	private final int minimumBid;
	
	private String imageUrl;
	
	private String category;
	
	public AuctionItem(String newName, int newMin, String newCat) {
		itemName = newName;
		minimumBid = newMin;
		currentBid = minimumBid;
		imageUrl = null;
		category = newCat;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getCurrentBid() {
		return currentBid;
	}

	public void setCurrentBid(int currentBid) {
		this.currentBid = currentBid;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getMinimumBid() {
		return minimumBid;
	}
	

}

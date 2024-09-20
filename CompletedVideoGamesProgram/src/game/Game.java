/**
 * 
 */
package game;

/**
 * 
 */
public class Game {
	
	private String platform; // Platform of game
	
	private int rating; // Rating the user gives the game
	
	private String review; // Review the user gives the game
	
	private String endStatus; // Status of whether the user completed or dropped the game
	
	public Game(String platform, int rating, String review, String endStatus) {
		setPlatform(platform);
		setRating(rating);
		setReview(review);
		setEndStatus(endStatus);
	}
	
	public String getPlatform() {
		return platform;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getReview() {
		return review;
	}
	
	public void setReview(String review) {
		this.review = review;
	}
	
	public String getEndStatus() {
		return endStatus;
	}
	
	public void setEndStatus(String endStatus) {
		this.endStatus = endStatus;
	}
	
	
	
}

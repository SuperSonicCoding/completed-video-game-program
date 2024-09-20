/**
 * 
 */
package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class GameTest {
	
	Game game;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		game = new Game("PlayStation", 8, "Game was good.", "Completed");
	}

	/**
	 * Test method for {@link game.Game#getPlatform()}.
	 */
	@Test
	void testGetPlatform() {
		assertEquals("PlayStation", game.getPlatform());
	}

	/**
	 * Test method for {@link game.Game#setPlatform(java.lang.String)}.
	 */
	@Test
	void testSetPlatform() {
		game.setPlatform("Xbox");
		assertEquals("Xbox", game.getPlatform());
	}

	/**
	 * Test method for {@link game.Game#getRating()}.
	 */
	@Test
	void testGetRating() {
		assertEquals(8, game.getRating());
	}

	/**
	 * Test method for {@link game.Game#setRating(int)}.
	 */
	@Test
	void testSetRating() {
		game.setRating(3);
		assertEquals(3, game.getRating());
	}

	/**
	 * Test method for {@link game.Game#getReview()}.
	 */
	@Test
	void testGetReview() {
		assertEquals("Game was good.", game.getReview());
	}

	/**
	 * Test method for {@link game.Game#setReview(java.lang.String)}.
	 */
	@Test
	void testSetReview() {
		game.setReview("Game was bad.");
		assertEquals("Game was bad.", game.getReview());
	}

	/**
	 * Test method for {@link game.Game#getEndStatus()}.
	 */
	@Test
	void testGetEndStatus() {
		assertEquals("Completed", game.getEndStatus());
	}

	/**
	 * Test method for {@link game.Game#setEndStatus(boolean)}.
	 */
	@Test
	void testSetEndStatus() {
		game.setEndStatus("Dropped");
		assertEquals("Dropped", game.getEndStatus());
	}

}

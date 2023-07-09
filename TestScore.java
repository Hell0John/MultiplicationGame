package multiplicationgame;



import junit.framework.TestCase;

public class TestScore extends TestCase{
	private Score score;

	protected void setUp() {
		score = new Score("user1","95","2012.10.09");
	}
	public void testGetUser() {
		String user=score.getUser();
		assertEquals("user1", user);
	}
	public void testGetPoint() {
		String point=score.getPoint();
		assertEquals("95", point);
	}
	public void testGetDate() {
		String date=score.getDate();
		assertEquals("2012.10.09", date);
	}
	public void testSetUser() {
		score.setUser("Hamza");
		assertEquals("Hamza", score.getUser());
	}
	public void testSetPoint() {
		score.setPoint("50");
		assertEquals("50", score.getPoint());
	}
	

	

}

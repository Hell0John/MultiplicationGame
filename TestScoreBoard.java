package multiplicationgame;

import junit.framework.TestCase;

public class TestScoreBoard extends TestCase{
	private ScoreBoard scoreboard;
	private Score score1;
	private Score score2;
	private Score score3;
	
	
	protected void setUp() {
		score1=new Score("Ali", "10");
		score2=new Score("Hamza", "50");
		score3=new Score("Yavuz", "140");
		scoreboard=new ScoreBoard(score1,score2,score3);
		
	}
	
	public void testSortScoreBoard() {
		scoreboard.sortScoreboard();
		String first_place=scoreboard.getScoreboard().get(0).getPoint();
		String second_place=scoreboard.getScoreboard().get(1).getPoint();
		String third_place=scoreboard.getScoreboard().get(2).getPoint();
		assertEquals("140", first_place);
		assertEquals("50", second_place);
		assertEquals("10", third_place);
	}

}

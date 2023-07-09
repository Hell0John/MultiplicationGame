package multiplicationgame;


import junit.framework.TestCase;

public class TestCountUpTimer extends TestCase{
	private CountUpTimer timer;
	
	protected void setUp() {
		timer=new CountUpTimer();
	}
	
	public void testGetSeconds() {
		int i=timer.getSeconds();
		assertEquals(0, i);
	}
	
	public void testSetSeconds() {
		timer.setSeconds(50);
		int i=timer.getSeconds();
		assertEquals(50, i);
	}
	
	
	
	public void testResetTimer() {
		timer.setSeconds(50);
		timer.resetTimer();		
		int i=timer.getSeconds();
		assertEquals(0, i);
	}



}

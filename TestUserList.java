package multiplicationgame;

import junit.framework.TestCase;

public class TestUserList extends TestCase{
	private UserList userlist;
	private User user1;
	private User user2;
	
	protected void setUp() {
		user1=new User();
		user2=new User();
		
		user1.setUsername("Yavuz");
		user1.setAdmin("1");
		user1.setPassword("123");
		user2.setUsername("Ali");
		user2.setAdmin("0");
		user2.setPassword("532");
		userlist=new UserList(user1,user2);
		

		
	}
	
	public void testContainsUser() {
		boolean con=userlist.containsUser("Ali");
		assertEquals(true,con);
	}
	
	public void testContainsUsernameAndPass() {
		boolean con=userlist.containsUsernameandPass("Yavuz","111");
		assertEquals(false, con);
	}
	
	public void testIsAdmin() {
		boolean con=userlist.isAdmin("Yavuz", "123", "1");
		assertEquals(true, con);
	}

}

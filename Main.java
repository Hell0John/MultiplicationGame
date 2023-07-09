package multiplicationgame;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserList userlist= new UserList();
	   // User newUser = new User("Admin", "Admin", "1");
	    //User newUser2 = new User("user1", "user1", "0");
	    //User newUser3 = new User("user2", "user2", "0");
	    //userlist.addUser(newUser);
	    //userlist.addUser(newUser2);
	    //userlist.addUser(newUser3);
		
		LoginPage loginpage=new LoginPage(userlist);
		loginpage.showFrame();
		
	}

}

package multiplicationgame;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {
	private String username;
	private String password;
	private String admin;
	public User(String username, String password, String admin) {
		super();
		this.username = username;
		this.password = password;
		this.admin = admin;
	}
	
	public User() {
		
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}



}

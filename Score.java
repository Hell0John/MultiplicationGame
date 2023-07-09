package multiplicationgame;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Score implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user;
	private String point;
	private String date;
	
	
	public Score(String user, String point,String date) {
		super();
		this.user = user;
		this.point = point;
		this.date = date;
	}
	public Score(String user, String point) {
		super();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = currentDateTime.format(formatter);
        

		this.user = user;
		this.point = point;
		this.date = formattedDateTime;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getDate() {
		return date;
	}

	

}

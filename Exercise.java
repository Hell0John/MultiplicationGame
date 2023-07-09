package multiplicationgame;

import java.io.Serializable;

public class Exercise implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String A_upper;
	private String B_upper;
	private String A_downer;
	private String B_downer;
	private String N;
	
	public Exercise(String a_downer,String a_upper, String b_downer, String b_upper,   String n) {
		super();
		A_upper = a_upper;
		B_upper = b_upper;
		A_downer = a_downer;
		B_downer = b_downer;
		N = n;
	}
	
	public Exercise() {
		super();
	}
	public String getA_upper() {
        return A_upper;
    }

    public void setA_upper(String a_upper) {
        A_upper = a_upper;
    }

    public String getB_upper() {
        return B_upper;
    }

    public void setB_upper(String b_upper) {
        B_upper = b_upper;
    }

    public String getA_downer() {
        return A_downer;
    }

    public void setA_downer(String a_downer) {
        A_downer = a_downer;
    }

    public String getB_downer() {
        return B_downer;
    }

    public void setB_downer(String b_downer) {
        B_downer = b_downer;
    }

    public String getN() {
        return N;
    }

    public void setN(String n) {
        N = n;
    }

}

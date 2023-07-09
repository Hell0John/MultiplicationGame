package multiplicationgame;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ScoreBoard {
	private ArrayList<Score> scoreboard;

	public ArrayList<Score> getScoreboard() {
		return scoreboard;
	}
	
	   public ScoreBoard() {
	        scoreboard = new ArrayList<>();
	        readScoreboardFromFile("rsc/scoreboard.ser");
	    }
	   public ScoreBoard(Score score1,Score score2,Score score3) {
		   scoreboard=new ArrayList<>();
		   scoreboard.add(score1);
		   scoreboard.add(score2);
		   scoreboard.add(score3);
	   }
	public ScoreBoard(String wantedUser) {
	    scoreboard = new ArrayList<>();
	    String filePath = "rsc/scoreboard.ser";
	    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
	        @SuppressWarnings("unchecked")
			ArrayList<Score> scores = (ArrayList<Score>) ois.readObject();

	        for (Score score : scores) {
	            if (score.getUser().equals(wantedUser)) {
	                scoreboard.add(score);
	            }
	        }
	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	}
    public void writeToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("rsc/scoreboard.ser"))) {
            oos.writeObject(scoreboard);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
	public void readScoreboardFromFile(String fileName) {
    	
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            scoreboard = (ArrayList<Score>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void sortScoreboard() {
        Collections.sort(scoreboard, new Comparator<Score>() {
            @Override
            public int compare(Score score1, Score score2) {
                int point1 = Integer.parseInt(score1.getPoint());
                int point2 = Integer.parseInt(score2.getPoint());

                return Integer.compare(point2, point1);
            }
        });
    }
    public void cleanScoreboardFile() {
    	 ArrayList<Score> scoreboard_2 = new ArrayList<>();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("rsc/scoreboard.ser"))) {
            oos.writeObject(scoreboard_2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

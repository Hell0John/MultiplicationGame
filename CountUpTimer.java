package multiplicationgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountUpTimer extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int seconds;
    private JLabel jLabel;
    private Timer timer;

    public CountUpTimer() {
        setLayout(new FlowLayout());
        jLabel = new JLabel();
        add(jLabel);

        int delay = 1000;
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seconds++;
                int minutes = seconds / 60;
                int remainingSeconds = seconds % 60;
                jLabel.setText(String.format("Time elapsed: %02d:%02d", minutes, remainingSeconds));
            }
        };
        timer = new Timer(delay, taskPerformer);
        timer.start();
    }

    public void resetTimer() {
        timer.stop();
        seconds = 0;
        jLabel.setText("Time elapsed: 00:00");
        timer.start();
    }
    public void pauseTimer() {
    	timer.stop();
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
    	this.seconds=seconds;
    }
}
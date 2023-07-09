package multiplicationgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;



public class StatisticsPage {

	private JFrame frame;
	private static int i;
	private static int j;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatisticsPage window = new StatisticsPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StatisticsPage() {
		i=0;
		j=0;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Statistics");
		frame.setBounds(100, 100, 818, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(55, 130, 452, 24);
		frame.getContentPane().add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(55, 152, 422, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(55, 178, 422, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(55, 200, 422, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setVisible(false);
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setBounds(474, 152, 66, 157);
		frame.getContentPane().add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setVisible(false);
		progressBar_1.setOrientation(SwingConstants.VERTICAL);
		progressBar_1.setBounds(540, 152, 66, 157);
		frame.getContentPane().add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setVisible(false);
		progressBar_2.setOrientation(SwingConstants.VERTICAL);
		progressBar_2.setBounds(603, 152, 66, 157);
		frame.getContentPane().add(progressBar_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setVisible(false);
		progressBar_3.setOrientation(SwingConstants.VERTICAL);
		progressBar_3.setBounds(664, 152, 66, 157);
		frame.getContentPane().add(progressBar_3);
		
		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setVisible(false);
		progressBar_4.setOrientation(SwingConstants.VERTICAL);
		progressBar_4.setBounds(726, 152, 66, 157);
		frame.getContentPane().add(progressBar_4);
		

		

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(55, 225, 422, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(55, 249, 422, 24);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(55, 274, 422, 24);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(55, 301, 422, 24);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(55, 322, 429, 24);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(55, 351, 429, 24);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setVisible(false);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(474, 117, 66, 24);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("");
		lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1.setVisible(false);
		lblNewLabel_10_1.setBounds(540, 117, 66, 24);
		frame.getContentPane().add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("");
		lblNewLabel_10_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_2.setVisible(false);
		lblNewLabel_10_2.setBounds(603, 117, 66, 24);
		frame.getContentPane().add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_3 = new JLabel("");
		lblNewLabel_10_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_3.setVisible(false);
		lblNewLabel_10_3.setBounds(664, 117, 66, 24);
		frame.getContentPane().add(lblNewLabel_10_3);
		
		JLabel lblNewLabel_10_4 = new JLabel("");
		lblNewLabel_10_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_4.setVisible(false);
		lblNewLabel_10_4.setBounds(726, 117, 66, 24);
		frame.getContentPane().add(lblNewLabel_10_4);
		
		JToggleButton tglbtnUser1 = new JToggleButton("User1");
		tglbtnUser1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
			    List<JLabel> labels = new ArrayList<>();
			    labels.add(lblNewLabel);
			    labels.add(lblNewLabel_1);
			    labels.add(lblNewLabel_2);
			    labels.add(lblNewLabel_3);
			    labels.add(lblNewLabel_4);
			    labels.add(lblNewLabel_5);
			    labels.add(lblNewLabel_6);
			    labels.add(lblNewLabel_7);
			    labels.add(lblNewLabel_8);
			    labels.add(lblNewLabel_9);
			    lblNewLabel_10_4.setText("");
		    	lblNewLabel_10_3.setText("");
		    	lblNewLabel_10_2.setText("");
		    	lblNewLabel_10_1.setText("");
		    	lblNewLabel_10.setText("");
			    if(i%2==1) {
			    	progressBar_1.setVisible(true);
			    	progressBar_2.setVisible(true);
			    	progressBar_3.setVisible(true);
			    	progressBar_4.setVisible(true);
			    	progressBar.setVisible(true);
			    	progressBar_1.setValue(0);
			    	progressBar_2.setValue(0);
			    	progressBar_3.setValue(0);
			    	progressBar_4.setValue(0);
			    	progressBar.setValue(0);
			    	List<JProgressBar> progress=new ArrayList<>();
			    	List<JLabel> label_value=new ArrayList<>();
			    	progress.add(progressBar);
			    	progress.add(progressBar_1);
			    	progress.add(progressBar_2);
			    	progress.add(progressBar_3);
			    	progress.add(progressBar_4);
			    	label_value.add(lblNewLabel_10);
			    	label_value.add(lblNewLabel_10_1);
			    	label_value.add(lblNewLabel_10_2);
			    	label_value.add(lblNewLabel_10_3);
			    	label_value.add(lblNewLabel_10_4);
				ScoreBoard scoreb=new ScoreBoard("user1");
				

			    int k = 0;
			    

			    for (Score score : scoreb.getScoreboard()) {
			        if (k < labels.size()) {
			            labels.get(k).setText(score.getUser() + " Score:" + score.getPoint() + " Date:" + score.getDate());
			            
			        }
			        k++;
			        
			    }

			    k=0;
			    Collections.reverse(scoreb.getScoreboard());
			    for(Score score:scoreb.getScoreboard()  ) {
			    	
			    		if(k<5) {	    	
			    	progress.get(k).setValue(Integer.parseInt(score.getPoint()));
			    	label_value.get(k).setText(score.getPoint());
			    	label_value.get(k).setVisible(true);
			    		}
                     k++;
			    }
			    }else {
			    	progressBar_1.setVisible(false);
			    	progressBar_2.setVisible(false);
			    	progressBar_3.setVisible(false);
			    	progressBar_4.setVisible(false);
			    	progressBar.setVisible(false);
			    	lblNewLabel_10_4.setText("");
			    	lblNewLabel_10_3.setText("");
			    	lblNewLabel_10_2.setText("");
			    	lblNewLabel_10_1.setText("");
			    	lblNewLabel_10.setText("");
					int b;
					for(b=0;b<10;b++) {
						labels.get(b).setText("");
					}
			    }
			}
		});
		tglbtnUser1.setFocusable(false);
		tglbtnUser1.setBounds(38, 33, 112, 35);
		frame.getContentPane().add(tglbtnUser1);
		
		JToggleButton tglbtnUser2 = new JToggleButton("User2");
		tglbtnUser2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j++;
			    List<JLabel> labels = new ArrayList<>();
			    labels.add(lblNewLabel);
			    labels.add(lblNewLabel_1);
			    labels.add(lblNewLabel_2);
			    labels.add(lblNewLabel_3);
			    labels.add(lblNewLabel_4);
			    labels.add(lblNewLabel_5);
			    labels.add(lblNewLabel_6);
			    labels.add(lblNewLabel_7);
			    labels.add(lblNewLabel_8);
			    labels.add(lblNewLabel_9);
			    lblNewLabel_10_4.setText("");
		    	lblNewLabel_10_3.setText("");
		    	lblNewLabel_10_2.setText("");
		    	lblNewLabel_10_1.setText("");
		    	lblNewLabel_10.setText("");
			    if(j%2==1) {
			    	progressBar_1.setVisible(true);
			    	progressBar_2.setVisible(true);
			    	progressBar_3.setVisible(true);
			    	progressBar_4.setVisible(true);
			    	progressBar.setVisible(true);
			    	progressBar_1.setValue(0);
			    	progressBar_2.setValue(0);
			    	progressBar_3.setValue(0);
			    	progressBar_4.setValue(0);
			    	progressBar.setValue(0);
			    	List<JProgressBar> progress=new ArrayList<>();
			    	List<JLabel> label_value=new ArrayList<>();
			    	progress.add(progressBar);
			    	progress.add(progressBar_1);
			    	progress.add(progressBar_2);
			    	progress.add(progressBar_3);
			    	progress.add(progressBar_4);
			    	label_value.add(lblNewLabel_10);
			    	label_value.add(lblNewLabel_10_1);
			    	label_value.add(lblNewLabel_10_2);
			    	label_value.add(lblNewLabel_10_3);
			    	label_value.add(lblNewLabel_10_4);
				ScoreBoard scoreb=new ScoreBoard("user2");
				

			    int k = 0;

			    for (Score score : scoreb.getScoreboard()) {
			        if (k < labels.size()) {
			            labels.get(k).setText(score.getUser() + " Score:" + score.getPoint() + " Date:" + score.getDate());
			            
			        }
			        k++;
			    }

			    
 
			    k=0;
			    Collections.reverse(scoreb.getScoreboard());
			    for(Score score:scoreb.getScoreboard()  ) {
			    	
			    		if(k<5) {	    	
			    	progress.get(k).setValue(Integer.parseInt(score.getPoint()));
			    	label_value.get(k).setText(score.getPoint());
			    	label_value.get(k).setVisible(true);
			    		}
                     k++;
			    }
			    }else {
			    	progressBar_1.setVisible(false);
			    	progressBar_2.setVisible(false);
			    	progressBar_3.setVisible(false);
			    	progressBar_4.setVisible(false);
			    	progressBar.setVisible(false);
			    	lblNewLabel_10_4.setText("");
			    	lblNewLabel_10_3.setText("");
			    	lblNewLabel_10_2.setText("");
			    	lblNewLabel_10_1.setText("");
			    	lblNewLabel_10.setText("");
					int b;
					for(b=0;b<10;b++) {
						labels.get(b).setText("");
					}
			    }
			}
		});
		tglbtnUser2.setFocusable(false);
		tglbtnUser2.setBounds(177, 33, 112, 35);
		frame.getContentPane().add(tglbtnUser2);
		

		

		

		

		
	}
	public void showFrame() {
		frame.setVisible(true);
	}
}

package multiplicationgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;




import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class AdminPage{

	private JFrame frame;
	private JTextField A_bottom;
	private JTextField A_up;
	private JTextField B_bottom;
	private JTextField B_up;
	private JTextField N_value;
	private JToggleButton tglbtnStatistics;
	private JToggleButton tglbtnScoreboard;
	private static int i;
	private static int j;
	private static int m;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
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
	public AdminPage() {
		i=0;
		j=0;
		m=0;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Admin Page");
		frame.setBounds(100, 100, 625, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Page");
		lblNewLabel.setBounds(200, 9, 152, 37);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(lblNewLabel);
		
		A_bottom = new JTextField();
		A_bottom.setBounds(111, 173, 40, 20);
		frame.getContentPane().add(A_bottom);
		A_bottom.setColumns(10);
		A_bottom.setVisible(false);
		
		A_up = new JTextField();
		A_up.setColumns(10);
		A_up.setBounds(161, 173, 40, 20);
		frame.getContentPane().add(A_up);
		A_up.setVisible(false);
		
		B_bottom = new JTextField();
		B_bottom.setBounds(111, 213, 40, 20);
		frame.getContentPane().add(B_bottom);
		B_bottom.setColumns(10);
		B_bottom.setVisible(false);
		
		B_up = new JTextField();
		B_up.setColumns(10);
		B_up.setBounds(161, 213, 40, 20);
		frame.getContentPane().add(B_up);
		B_up.setVisible(false);
		
		JLabel A_Label = new JLabel("A = ");
		A_Label.setFont(new Font("Tahoma", Font.PLAIN, 26));
		A_Label.setForeground(Color.BLACK);
		A_Label.setBounds(51, 173, 51, 20);
		frame.getContentPane().add(A_Label);
		
		JLabel B_Label = new JLabel("B = ");
		B_Label.setForeground(Color.BLACK);
		B_Label.setFont(new Font("Tahoma", Font.PLAIN, 26));
		B_Label.setBounds(50, 213, 51, 20);
		frame.getContentPane().add(B_Label);
		
		N_value = new JTextField();
		N_value.setBounds(111, 252, 40, 20);
		frame.getContentPane().add(N_value);
		N_value.setColumns(10);
		N_value.setVisible(false);
		
		JLabel N_Label = new JLabel("N = ");
		N_Label.setForeground(Color.BLACK);
		N_Label.setFont(new Font("Tahoma", Font.PLAIN, 26));
		N_Label.setBounds(51, 252, 64, 20);
		frame.getContentPane().add(N_Label);
		
		A_Label.setVisible(false);
		B_Label.setVisible(false);
		N_Label.setVisible(false);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New Exercise");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				if(i%2==1) {
				B_up.setVisible(true);
				B_bottom.setVisible(true);
				A_up.setVisible(true);
				N_value.setVisible(true);
				A_bottom.setVisible(true);
				A_Label.setVisible(true);
				B_Label.setVisible(true);
				N_Label.setVisible(true);
				btnNewButton.setVisible(true);
				btnNewButton_1.setVisible(true);
				btnNewButton_2.setVisible(true);
				}else {
					B_up.setVisible(false);
					B_bottom.setVisible(false);
					A_up.setVisible(false);
					N_value.setVisible(false);
					A_bottom.setVisible(false);
					A_Label.setVisible(false);
					B_Label.setVisible(false);
					N_Label.setVisible(false);
					btnNewButton.setVisible(false);
					btnNewButton_1.setVisible(false);
					btnNewButton_2.setVisible(false);
				}
				
			}
		});
		tglbtnNewToggleButton.setForeground(Color.BLUE);
		tglbtnNewToggleButton.setFocusable(false);
		tglbtnNewToggleButton.setBounds(38, 70, 113, 37);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		tglbtnStatistics = new JToggleButton("Statistics");
		tglbtnStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(j%2==0) {
					StatisticsPage sts=new StatisticsPage();
					sts.showFrame();
				}
				j=1;
				
			}
		});
		tglbtnStatistics.setForeground(Color.BLUE);
		tglbtnStatistics.setFocusable(false);
		tglbtnStatistics.setBounds(230, 70, 113, 37);
		frame.getContentPane().add(tglbtnStatistics);
		
		tglbtnScoreboard = new JToggleButton("Scoreboard");
		tglbtnScoreboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //Top skorlarý gösteren buton
				m++;
			    List<JLabel> labels = new ArrayList<>();
			    labels.add(lblNewLabel_1);
			    labels.add(lblNewLabel_2);
			    labels.add(lblNewLabel_3);
			    labels.add(lblNewLabel_4);
			    labels.add(lblNewLabel_5);
			    labels.add(lblNewLabel_6);
			    labels.add(lblNewLabel_7);
			    labels.add(lblNewLabel_8);
			    labels.add(lblNewLabel_9);
			    labels.add(lblNewLabel_10);
				if(m%2==1) {
			    ScoreBoard scoreboard = new ScoreBoard();
			    scoreboard.sortScoreboard();



			    int k = 0;

			    for (Score score : scoreboard.getScoreboard()) {
			        if (k < labels.size()) {
			            labels.get(k).setText(score.getUser() + " Score:" + score.getPoint() + " Date:" + score.getDate());
			        }
			        k++;
			    }
				}else {
					int i;
					for(i=0;i<10;i++) {
						labels.get(i).setText("");
					}
				}
			}
		});
		tglbtnScoreboard.setForeground(Color.BLUE);
		tglbtnScoreboard.setFocusable(false);
		tglbtnScoreboard.setBounds(440, 70, 113, 37);
		frame.getContentPane().add(tglbtnScoreboard);
		
		btnNewButton = new JButton("Exercise 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //a,b ve N deðerleri girilince ve týklanýnca yeni Exercise 1 deðerleri atanýr
				String A_down = A_bottom.getText();
				String B_down = B_bottom.getText();
				String B_upper = B_up.getText();
				String A_upper = A_up.getText();
				String N = N_value.getText();

				Exercise new_exercise = new Exercise(A_down, A_upper, B_down, B_upper, N);
				ExerciseList exerciselist= new ExerciseList();
				exerciselist.getExerciseList()[0]=new_exercise;
				exerciselist.writeToFile();
				
				

				A_bottom.setText("");
				B_bottom.setText("");
				B_up.setText("");
				A_up.setText("");
				N_value.setText("");
			}
		});
		btnNewButton.setVisible(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(51, 314, 152, 43);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(366, 134, 222, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(366, 155, 222, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(366, 176, 222, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(366, 196, 222, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(366, 216, 222, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(366, 236, 222, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(366, 255, 222, 20);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(366, 277, 222, 20);
		frame.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(366, 296, 222, 20);
		frame.getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(366, 314, 222, 20);
		frame.getContentPane().add(lblNewLabel_10);
		
		btnNewButton_1 = new JButton("Exercise 2");
		btnNewButton_1.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //a,b ve N deðerleri girilince ve týklanýnca yeni Exercise 2 deðerleri atanýr
				String A_down = A_bottom.getText();
				String B_down = B_bottom.getText();
				String B_upper = B_up.getText();
				String A_upper = A_up.getText();
				String N = N_value.getText();

				Exercise new_exercise = new Exercise(A_down, A_upper, B_down, B_upper, N);
				ExerciseList exerciselist= new ExerciseList();
				exerciselist.getExerciseList()[1]=new_exercise;
				exerciselist.writeToFile();
				

				A_bottom.setText("");
				B_bottom.setText("");
				B_up.setText("");
				A_up.setText("");
				N_value.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(51, 368, 150, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Exercise 3");
		btnNewButton_2.setVisible(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//a,b ve N deðerleri girilince ve týklanýnca yeni Exercise 3 deðerleri atanýr
				String A_down = A_bottom.getText();
				String B_down = B_bottom.getText();
				String B_upper = B_up.getText();
				String A_upper = A_up.getText();
				String N = N_value.getText();

				Exercise new_exercise = new Exercise(A_down, A_upper, B_down, B_upper, N);
				ExerciseList exerciselist= new ExerciseList();
				
				exerciselist.getExerciseList()[2]=new_exercise;
				exerciselist.writeToFile();

				A_bottom.setText("");
				B_bottom.setText("");
				B_up.setText("");
				A_up.setText("");
				N_value.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(51, 422, 150, 43);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clean Scoreboard");
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//Skor tablosunu sýfýrlar ve dosyayý da boþaltýr.
				ScoreBoard scoreboard=new ScoreBoard();
				scoreboard.cleanScoreboardFile();
			}
		});
		btnNewButton_3.setBounds(403, 11, 150, 37);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserList userlist= new UserList();
				LoginPage loginpage=new LoginPage(userlist);
        		loginpage.showFrame();
        		frame.dispose();
			}
		});
		btnNewButton_4.setBounds(26, 20, 89, 28);
		frame.getContentPane().add(btnNewButton_4);
	}

	public void showFrame() {
		frame.setVisible(true);
	}
}
	


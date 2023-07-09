package multiplicationgame;



import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;


public class WelcomePage {

    private JFrame frame;
    private JTextField textField;
    private int randomNumber;
    private int randomNumber_2;
    private int z;
    private String username;
    private int point;
    private int correct;
    private int oldTime;
    private int count;
    private ExcelScore excelscore;
    private String StartTime;
    private String currentExercise;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WelcomePage window = new WelcomePage("");
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
    public WelcomePage(String username) {
    	count=0;
    	this.username=username;
        initialize();
    }


    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Multiplication Game");
        frame.setBounds(100, 100, 550, 569);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        CountUpTimer countUpTimer = new CountUpTimer();
        countUpTimer.setBounds(157, 428, 168, 48);
        countUpTimer.pauseTimer();
        
        frame.getContentPane().add(countUpTimer);
        
        JLabel lblScore = new JLabel("");
        lblScore.setBounds(10, 325, 514, 22);
        frame.getContentPane().add(lblScore);
        
        JLabel lblWhichQuestion = new JLabel("1");
        lblWhichQuestion.setVisible(false);
        lblWhichQuestion.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblWhichQuestion.setBounds(194, 271, 43, 31);
        frame.getContentPane().add(lblWhichQuestion);
        
        JLabel lblQuestionBound = new JLabel("10");
        lblQuestionBound.setVisible(false);
        lblQuestionBound.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblQuestionBound.setBounds(247, 273, 46, 26);
        frame.getContentPane().add(lblQuestionBound);
        
        JLabel lblFirstValue = new JLabel("33");
        lblFirstValue.setVisible(false);
        lblFirstValue.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblFirstValue.setHorizontalAlignment(SwingConstants.CENTER);
        lblFirstValue.setBounds(111, 341, 57, 48);
        frame.getContentPane().add(lblFirstValue);
        
        JLabel lblSecondValue = new JLabel("33");
        lblSecondValue.setVisible(false);
        lblSecondValue.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblSecondValue.setHorizontalAlignment(SwingConstants.CENTER);
        lblSecondValue.setBounds(180, 341, 57, 48);
        frame.getContentPane().add(lblSecondValue);
        
        JLabel lblNewLabel_2 = new JLabel("QUESTION");
        lblNewLabel_2.setVisible(false);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_2.setBounds(75, 271, 117, 31);
        frame.getContentPane().add(lblNewLabel_2);
        

        
        JLabel lblNewLabel_4 = new JLabel("/");
        lblNewLabel_4.setVisible(false);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_4.setBounds(224, 271, 23, 31);
        frame.getContentPane().add(lblNewLabel_4);
        

        

        
        JLabel lblNewLabel = new JLabel("X");
        lblNewLabel.setVisible(false);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(156, 349, 36, 33);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("=");
        lblNewLabel_1.setVisible(false);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(224, 358, 46, 14);
        frame.getContentPane().add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setVisible(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setBounds(261, 353, 46, 31);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblCorrectorWrong = new JLabel("");
        lblCorrectorWrong.setVisible(false);
        lblCorrectorWrong.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblCorrectorWrong.setHorizontalAlignment(SwingConstants.CENTER);
        lblCorrectorWrong.setHorizontalTextPosition(SwingConstants.LEFT);
        lblCorrectorWrong.setBounds(291, 271, 212, 42);
        frame.getContentPane().add(lblCorrectorWrong);
        
        
        JButton btnNewButton_2 = new JButton("Submit");
        btnNewButton_2.setVisible(false);
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                String formattedDateTime = currentDateTime.format(formatter);
                int currentTime=countUpTimer.getSeconds();
               

                
        		if(count>0) {
        			int answer = randomNumber*randomNumber_2;
        			int user_answer=Integer.parseInt(textField.getText());
        			textField.setText("");
        			lblCorrectorWrong.setVisible(true);
        			if(answer==user_answer) {
        				lblCorrectorWrong.setText("Correct Answer!");
        				lblCorrectorWrong.setForeground(Color.green);
        				excelscore.addQuestionInfo(randomNumber+"X"+randomNumber_2, ""+(currentTime-oldTime), "Correct");
        				point=point+1;
        				correct++;
        			}else {
        				lblCorrectorWrong.setText("Wrong Answer!");
        				lblCorrectorWrong.setForeground(Color.red);
        				excelscore.addQuestionInfo(randomNumber+"X"+randomNumber_2,  ""+(currentTime-oldTime), "Wrong");
        			}
        			
        		}else {
        			
					
					excelscore=new ExcelScore();
        			StartTime=formattedDateTime;
        			excelscore.getQuestions().clear();
        			excelscore.getCorrectorwrong().clear();
        			excelscore.getSeconds().clear();
        			excelscore.setStart_time(formattedDateTime);
        			
        		}
        		oldTime=countUpTimer.getSeconds();
        		ExerciseList exerciselist=new ExerciseList();
            	int A_1 = Integer.parseInt(exerciselist.getExerciseList()[z].getA_downer());
            	int A_2 = Integer.parseInt(exerciselist.getExerciseList()[z].getA_upper());
            	int B_1 = Integer.parseInt(exerciselist.getExerciseList()[z].getB_downer());
            	int B_2 = Integer.parseInt(exerciselist.getExerciseList()[z].getB_upper());
            	int N = Integer.parseInt(exerciselist.getExerciseList()[z].getN());
            	
            	
            		lblWhichQuestion.setText(""+(count+1));
            		
                    Random random = new Random();
                    randomNumber = random.nextInt(A_2 - A_1 + 1)+A_1;
                    randomNumber_2 = random.nextInt(B_2 - B_1 + 1)+B_1;
                    lblFirstValue.setText(""+randomNumber);
                    lblSecondValue.setText(""+randomNumber_2);
                    
                    if((count)==N) {
                    	point=(correct*100/N);
                    	point=point-(countUpTimer.getSeconds())/2;
                		countUpTimer.pauseTimer();
                		countUpTimer.setVisible(false);
                		lblNewLabel_2.setVisible(false);
                		lblNewLabel_4.setVisible(false);
                		lblNewLabel.setVisible(false);
                		lblNewLabel_1.setVisible(false);
                		lblFirstValue.setVisible(false);
                		lblSecondValue.setVisible(false);
                		lblWhichQuestion.setVisible(false);
                		lblQuestionBound.setVisible(false);
                		btnNewButton_2.setVisible(false);
                		textField.setVisible(false);
                        currentDateTime = LocalDateTime.now();
                        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                        formattedDateTime = currentDateTime.format(formatter);
                		excelscore.setEnd_time(formattedDateTime);
                		excelscore.setScore(""+point);
                		excelscore.setUser(username);
                		excelscore.setExercise_name(currentExercise);
                		excelscore.setStart_time(StartTime);
                		
                		excelscore.writeToExcel();
                		Score score=new Score(username,""+point);
                		ScoreBoard scoreboard=new ScoreBoard();
                		lblScore.setText("User: "+username+" Score: "+point+" Time: "+countUpTimer.getSeconds()+" Date: "+score.getDate()+" Correct: "+correct+"/"+N);
                        scoreboard.getScoreboard().add(score);
                        scoreboard.writeToFile();
                        
                		lblScore.setVisible(true);
                    }
            	count++;
        	}
        });
        btnNewButton_2.setFocusable(false);
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_2.setBounds(339, 357, 89, 23);
        frame.getContentPane().add(btnNewButton_2);
        
        JButton btnNewButton = new JButton("Exercise 1");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		count=0;
        		z=0;
        		correct=0;
        		currentExercise="Exercise 1";
        		ExerciseList exerciselist=new ExerciseList();
        		point=0;
        		oldTime=0;
        		lblQuestionBound.setText(exerciselist.getExerciseList()[0].getN());
        		countUpTimer.resetTimer();
        		lblNewLabel_2.setVisible(true);
        		lblNewLabel_4.setVisible(true);
        		countUpTimer.setVisible(true);
        		lblNewLabel.setVisible(true);
        		lblNewLabel_1.setVisible(true);
        		lblFirstValue.setVisible(true);
        		lblSecondValue.setVisible(true);
        		lblWhichQuestion.setVisible(true);
        		lblQuestionBound.setVisible(true);
        		btnNewButton_2.setVisible(true);
        		lblScore.setText("");
        		lblCorrectorWrong.setText("");
        		
        		textField.setVisible(true);
        		
        		btnNewButton_2.doClick();
        	}
        });
        btnNewButton.setFocusable(false);
        btnNewButton.setBounds(30, 38, 127, 48);
        frame.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Exercise 2");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_1.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
        		count=0;
        		currentExercise="Exercise 2";
        		z=1;
        		correct=0;
        		oldTime=0;
        		ExerciseList exerciselist=new ExerciseList();
        		point=0;
        		lblQuestionBound.setText(exerciselist.getExerciseList()[1].getN());
        		countUpTimer.resetTimer();
        		countUpTimer.setVisible(true);
        		lblNewLabel_2.setVisible(true);
        		lblNewLabel_4.setVisible(true);
        		lblNewLabel.setVisible(true);
        		lblNewLabel_1.setVisible(true);
        		lblFirstValue.setVisible(true);
        		lblSecondValue.setVisible(true);
        		lblWhichQuestion.setVisible(true);
        		lblQuestionBound.setVisible(true);
        		btnNewButton_2.setVisible(true);
        		lblScore.setText("");
        		lblCorrectorWrong.setText("");
        		
        		textField.setVisible(true);
        		
        		btnNewButton_2.doClick();
        	}
        });
        btnNewButton_1.setFocusable(false);
        btnNewButton_1.setBounds(30, 97, 127, 48);
        frame.getContentPane().add(btnNewButton_1);
        
        ExerciseList exerciseList=new ExerciseList();
        
        JLabel Exercise_1_label = new JLabel("");
        Exercise_1_label.setText("A=("+exerciseList.getExerciseList()[0].getA_downer()+"-"
        		+exerciseList.getExerciseList()[0].getA_upper()+")  B=("+exerciseList.getExerciseList()[0].getB_downer()
        		+"-"+exerciseList.getExerciseList()[0].getB_upper()+")  N="+exerciseList.getExerciseList()[0].getN());
        Exercise_1_label.setBounds(186, 55, 187, 19);
        frame.getContentPane().add(Exercise_1_label);
        
        JLabel Exercise_2_label = new JLabel("");
        Exercise_2_label.setText("A=("+exerciseList.getExerciseList()[1].getA_downer()+"-"
        		+exerciseList.getExerciseList()[1].getA_upper()+")  B=("+exerciseList.getExerciseList()[1].getB_downer()
        		+"-"+exerciseList.getExerciseList()[1].getB_upper()+")  N="+exerciseList.getExerciseList()[1].getN());
        Exercise_2_label.setBounds(186, 112, 187, 19);
        frame.getContentPane().add(Exercise_2_label);
        
        JButton btnNewButton_1_1 = new JButton("Exercise 3");
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_1_1.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
        		count=0;
        		z=2;
        		correct=0;
        		oldTime=0;
        		currentExercise="Exercise 3";
        		ExerciseList exerciselist=new ExerciseList();
        		point=0;
        		lblQuestionBound.setText(exerciselist.getExerciseList()[2].getN());
        		countUpTimer.resetTimer();
        		countUpTimer.setVisible(true);
        		lblNewLabel_2.setVisible(true);
        		lblNewLabel_4.setVisible(true);
        		lblNewLabel.setVisible(true);
        		lblNewLabel_1.setVisible(true);
        		lblFirstValue.setVisible(true);
        		lblSecondValue.setVisible(true);
        		lblWhichQuestion.setVisible(true);
        		lblQuestionBound.setVisible(true);
        		btnNewButton_2.setVisible(true);
        		lblScore.setText("");
        		lblCorrectorWrong.setText("");
        		
        		textField.setVisible(true);
        		
        		btnNewButton_2.doClick();
        	}
        });
        btnNewButton_1_1.setFocusable(false);
        btnNewButton_1_1.setBounds(30, 156, 127, 48);
        frame.getContentPane().add(btnNewButton_1_1);
        
        JLabel Exercise_3_label = new JLabel("");
        Exercise_3_label.setText("A=("+exerciseList.getExerciseList()[2].getA_downer()+"-"
        		+exerciseList.getExerciseList()[2].getA_upper()+")  B=("+exerciseList.getExerciseList()[2].getB_downer()
        		+"-"+exerciseList.getExerciseList()[2].getB_upper()+")  N="+exerciseList.getExerciseList()[2].getN());
        Exercise_3_label.setBounds(186, 173, 187, 19);
        frame.getContentPane().add(Exercise_3_label);
        
        JButton btnNewButton_3 = new JButton("Exit");
        btnNewButton_3.setFocusable(false);
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		UserList userlist= new UserList();
				LoginPage loginpage=new LoginPage(userlist);
        		loginpage.showFrame();
        		frame.dispose();
        	}
        });
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_3.setBounds(402, 38, 122, 48);
        frame.getContentPane().add(btnNewButton_3);
    }

    public void showFrame() {
        frame.setVisible(true);
    }
}
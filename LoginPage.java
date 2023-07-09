package multiplicationgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton loginButton= new JButton("Login");
	JButton resetButton= new JButton("Reset");
	JTextField usernameField=new JTextField();
	JPasswordField passwordField=new JPasswordField();
	private UserList userList;
	JLabel usernameLabel=new JLabel("Username:");
	JLabel passwordLabel=new JLabel("Password:");
	JLabel messageLabel=new JLabel("");
	
	
	
	LoginPage(UserList users){
		userList=users;
		
		usernameLabel.setBounds(50, 100, 75, 25);
		passwordLabel.setBounds(50, 150, 75, 25);
		messageLabel.setBounds(125, 250, 250, 35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		usernameField.setBounds(125, 100, 200, 25);
		passwordField.setBounds(125, 150, 200, 25);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.addActionListener(this);
		loginButton.setFocusable(false);
		
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.addActionListener(this);
		resetButton.setFocusable(false);
		
	    ImageIcon icon = new ImageIcon("images.png");
	    Image image = icon.getImage();
	    frame.setIconImage(image);
		
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(usernameField);
		frame.add(passwordField);
		frame.add(usernameLabel);
		frame.add(passwordLabel);
		frame.add(messageLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==resetButton) {
			usernameField.setText("");
			passwordField.setText("");
		}
		
		if(e.getSource()==loginButton) {
			String username=usernameField.getText();
			String password=String.valueOf(passwordField.getPassword());
			if(userList.containsUser(username)) {
				if(userList.containsUsernameandPass(username, password)) {
					messageLabel.setForeground(Color.GREEN);
					messageLabel.setText("Login successful");
					if(userList.isAdmin(username, password, "1")) {
						AdminPage adminpage= new AdminPage();
						adminpage.showFrame();
						frame.dispose();
					}else {

					WelcomePage welcomepage=new WelcomePage(username);
					welcomepage.showFrame();
					frame.dispose();
					}
					
				}else {
					messageLabel.setForeground(Color.RED);
					messageLabel.setText("Wrong Password");
				}
			}else {
				messageLabel.setForeground(Color.RED);
				messageLabel.setText("Username Not Found");
				
			}
		}
	}
	public void showFrame() {
		frame.setVisible(true);
	}

}

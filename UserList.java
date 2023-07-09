package multiplicationgame;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class UserList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<User> userList;

	public ArrayList<User> getUserList() {
		return userList;
	}
	public UserList(User user_1,User user_2) {
		userList = new ArrayList<>();
		userList.add(user_1);
		userList.add(user_2);
	}
    public UserList() {
        userList = new ArrayList<>();
        deserializeUserList();
    }

    public void addUser(User user) {
        userList.add(user);
        serializeUserList(); 
    }

    private void serializeUserList() {
        String filePath = "rsc/users.ser"; 
        

        try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            
            objectOut.writeObject(userList);

            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private void deserializeUserList() {
        String filePath = "rsc/users.ser";

        File file = new File(filePath);

        // Check if the file exists
        if (!file.exists()) {
            try {
                
                file.getParentFile().mkdirs();

                file.createNewFile();

                userList = new ArrayList<>();
                User newUser = new User("Admin", "Admin", "1");
        	    User newUser2 = new User("user1", "user1", "0");
        	    User newUser3 = new User("user2", "user2", "0");
        	    addUser(newUser);
        	    addUser(newUser2);
        	    addUser(newUser3);

                serializeUserList();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
          
            try {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);

                userList = (ArrayList<User>) objectIn.readObject();

                objectIn.close();
                fileIn.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
	public boolean containsUser(String name) {
	    for (User user : userList) {
	        if (user.getUsername().equals(name)) {
	            return true;
	        }
	    }
	    return false;
	}
	public boolean containsUsernameandPass(String name,String pass) {
	    for (User user : userList) {
	        if (user.getUsername().equals(name)&&user.getPassword().equals(pass)) {
	            return true;
	        }
	    }
	    return false;
	}
	public boolean isAdmin(String name,String pass,String admin) {
	    for (User user : userList) {
	        if (user.getUsername().equals(name)&&user.getPassword().equals(pass)&&user.getAdmin().equals(admin)) {
	            return true;
	        }
	    }
	    return false;
	}
}

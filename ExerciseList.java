package multiplicationgame;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class ExerciseList implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Exercise[] exerciseList;

    public Exercise[] getExerciseList() {
        return exerciseList;
    }

    public ExerciseList() {
        exerciseList = new Exercise[3];
        String filePath = "rsc/exercises.ser";

        File file = new File(filePath);

        
        if (!file.exists()) {
            try {
                
                file.getParentFile().mkdirs();

                file.createNewFile();
              Exercise exercise1 = new Exercise("5", "10", "1", "5", "5");
                exerciseList[0] = exercise1;

                Exercise exercise2 = new Exercise("5", "7", "11", "14", "7");
                exerciseList[1] = exercise2;

                Exercise exercise3 = new Exercise("3", "5", "1", "8", "6");
                exerciseList[2] = exercise3;
                
                

                writeToFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Exercise exercise1 = new Exercise("5", "10", "1", "5", "5");
        //exerciseList[0] = exercise1;

        //Exercise exercise2 = new Exercise("5", "7", "11", "14", "7");
        //exerciseList[1] = exercise2;

        //Exercise exercise3 = new Exercise("3", "5", "1", "8", "6");
        //exerciseList[2] = exercise3;
        //writeToFile();
        
        readExerciseFromFile();
    }

    public void readExerciseFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("rsc/exercises.ser"))) {
            exerciseList = (Exercise[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void writeToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("rsc/exercises.ser"))) {
            oos.writeObject(exerciseList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
    
    
    
}

package multiplicationgame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class ExcelScore {
	private String user;
	private String score;
	private String start_time;
	private String end_time;
	private String exercise_name;
	private ArrayList<String> questions;
	private ArrayList<String> seconds;
	private ArrayList<String> correctorwrong;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getExercise_name() {
		return exercise_name;
	}
	public void setExercise_name(String exercise_name) {
		this.exercise_name = exercise_name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public ArrayList<String> getQuestions() {
		return questions;
	}
	public ArrayList<String> getSeconds() {
		return seconds;
	}
	public ArrayList<String> getCorrectorwrong() {
		return correctorwrong;
	}
	public void addQuestionInfo(String question,String second,String correctorwrong) {
		questions.add(question);
		seconds.add(second);
		this.correctorwrong.add(correctorwrong);
	}
	public void writeToExcel() {
	    try {
	        File file = new File("rsc/gunce.xls");
	        HSSFWorkbook workbook;
	        HSSFSheet sheet;
	        

	        if (file.exists()) {
	            FileInputStream fis = new FileInputStream(file);
	            workbook = new HSSFWorkbook(fis);	            
	            sheet = workbook.getSheet(user);
	            fis.close();
	        } else {
	            workbook = new HSSFWorkbook();
	            sheet = workbook.createSheet(user);
	        }
            if(sheet==null) {
            	sheet = workbook.createSheet(user);
            }
	        int lastRow = sheet.getLastRowNum();
	        sheet.setColumnWidth(3, 20*256);
	        sheet.setColumnWidth(2, 20*256);
	        sheet.setColumnWidth(1, 5*256);
	        sheet.setColumnWidth(0, 10*256);
	        //if (lastRow > 0) {
	        //    lastRow++;
	       // }

	        
	        HSSFRow row = sheet.createRow(lastRow);
	        row.createCell(0).setCellValue(exercise_name);
   		 row.createCell(1).setCellValue(score);
            row.createCell(2).setCellValue(start_time);
           row.createCell(3).setCellValue(end_time);

	        for (int i = 0; i < questions.size(); i++) {
	        	
	        		//HSSFRow row = sheet.createRow(lastRow + i);
	            //HSSFRow row = sheet.createRow(lastRow + i+1);
	     
	            row.createCell((3*(i+1))+1).setCellValue(questions.get(i));
	            row.createCell(3*(i+1)+2).setCellValue(seconds.get(i));
	            row.createCell(3*(i+1)+3).setCellValue(correctorwrong.get(i));
	        	
	        	
	        }
	        
	        row=sheet.createRow(lastRow+1);
	        

	        FileOutputStream outFile = new FileOutputStream(file);
	        workbook.write(outFile);
	        workbook.close();
	        outFile.close();
	       

	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    public ExcelScore() {
        questions = new ArrayList<>();
        seconds = new ArrayList<>();
        correctorwrong = new ArrayList<>();

        
    }
	
	
	

}

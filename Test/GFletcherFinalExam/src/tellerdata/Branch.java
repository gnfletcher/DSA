/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellerdata;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author FletcherG
 */
public class Branch {
    private int branchID;
    private Scanner reader; 
    private File dailyLog;                  // file to which user input is written
    private FileWriter fileWriter;          // writes content to file
    private Date date;                      // creates date info for file name
    private SimpleDateFormat dateFormat; 

    public Branch(int branchID){
        this.branchID = branchID;
        //reader = new Scanner(System.in);
    }
    
    public void createLog() throws IOException{
        date = new Date() ;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd") ;
        dailyLog = new File("src/resources/branch" + branchID + "dailylog" + dateFormat.format(date) + ".txt"); //create new log file with date and time.
        System.out.println(dailyLog.getAbsolutePath());
        fileWriter = new FileWriter(dailyLog, true);
        fileWriter.write("Start Log for Branch: " + branchID + " " +dateFormat.format(date));                //writes input
        fileWriter.close(); 
    }
    
    public void writeLog(int time, String transactionDetails) throws IOException{
        fileWriter.write("Test");                //writes input
        fileWriter.close(); 
    }
}

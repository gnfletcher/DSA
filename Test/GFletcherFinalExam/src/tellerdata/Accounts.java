/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellerdata;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 *
 * @author FletcherG
 */
public abstract class Accounts {
    public int customerID;
    public int accountNumber;
    public double balance;
    public TreeMap<Integer, String> transactions;
    private Date date;                      // creates date info for file name
    private SimpleDateFormat dateFormat;
    
    
    public Accounts(int customerID, int accountNumber, float balance){
        this.accountNumber = accountNumber;
        this.customerID = customerID;
        this.balance = balance;
        dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    }
    
    public void deposit(double deposit){
        balance = balance + deposit;
        transactions.put(Integer.valueOf(dateFormat.format(date)), accountNumber + ",Deposit," + deposit + "," + balance);
    }
    
    public void transfer (double transfer, Accounts account){
        balance = balance - transfer;
        account.deposit(transfer);
        
        transactions.put(Integer.valueOf(dateFormat.format(date)), accountNumber + ",Deposit," + transfer + "," + balance + account.accountNumber);
    }
    
    public void reverseLastTransaction(){
        transactions.remove(transactions.lastKey());
    }
    
    public void reverseTransaction(){
        
    }
}

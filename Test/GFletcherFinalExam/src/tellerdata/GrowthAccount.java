/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellerdata;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author FletcherG
 */
public class GrowthAccount extends Accounts{
    private static final double INTEREST_RATE = 0.02;
    
    public GrowthAccount(int customerID, int accountNumber, float balance){
        super(accountNumber, customerID, balance);
        transactions = new TreeMap();

    }
    
}

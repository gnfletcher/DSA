/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellerdata;

/**
 *
 * @author FletcherG
 */
public class Customer extends People{
    public String address;
    public int phoneNumber;
    public int customerID;
    
    public Customer(String name, String address, int phoneNumber, int customerID){
        super(name);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.customerID = customerID;
    }  
}

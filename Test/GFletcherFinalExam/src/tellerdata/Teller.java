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
public class Teller extends People{
    public int employeeID;
    
    public Teller (String name, int employeeID){
        super(name);
        this.employeeID = employeeID;
    }
    
}

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
public abstract class People {
    public String name;
    
    public People(String name){
        this.name = name;
    }
    
    public void getProfile(){
        System.out.println(name);
    }
}

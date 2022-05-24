/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author SELİNAY
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //We can use the Observer Pattern when the change of an object needs to affect different objects.
        //We can use the Observer pattern in cases where a change in one object must change
        //other objects and these objects cannot be known beforehand.
        
        PresidentalOffice po= new PresidentalOffice();
        
        CellPhone myPhone= new CellPhone(po);
        TV myTV = new TV(po);
        Watch myWatch = new Watch(po);
        

        
        po.setMsg("About to be nuked!!! RUN!!!");
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.rmi.activation.Activatable;

/**
 *
 * @author SELİNAY
 */
public class CellPhone implements Observer, DisplayMsg{
    
    private Subject presidental;
    String msg;

    public CellPhone(Subject presidentalOffice) {
        this.presidental = presidentalOffice;
        this.presidental.register(this);
    
    }
    
    

    @Override
    public void update(String msg) {
        this.msg = msg;
        display();
    }

    @Override
    public void display() {
        System.out.println("a toast message is display for 15 seconds as--> "+ msg);
    }
    
}

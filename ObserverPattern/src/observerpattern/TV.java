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
public class TV implements Observer, DisplayMsg{
    
    private Subject presidental;
    String msg;
    
        public TV(Subject presidentalOffice) {
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
        System.out.println("TV broadcast is stopped and streaming this on the screen--> "+ msg);
    }
    
}

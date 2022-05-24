/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;

/**
 *
 * @author SELİNAY
 */
public class PresidentalOffice implements Subject {
    
    private ArrayList<Observer> observers;
    private String msg;

    public PresidentalOffice() {
        observers =new ArrayList<Observer>();
    }
    

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        int i =observers.indexOf(observer);
        if(i< 0){
            System.out.println("The observer you are looking for cannot be found!");
        }
        else{
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers)
           ((Observer)(o)).update(msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
        statusChanged();
    }
    
    public void statusChanged(){
        notifyObservers();
    
    }
    
}

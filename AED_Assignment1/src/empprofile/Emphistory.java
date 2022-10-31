/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empprofile;

import java.util.ArrayList;

/**
 *
 * @author DhiralM
 */
public class Emphistory {
    
    private ArrayList<empinfo> history;
    
    public Emphistory(){
        
        this.history = new ArrayList<empinfo>();
        
    }

    public ArrayList<empinfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<empinfo> history) {
        this.history = history;
    }
    
    public empinfo addNewInfo(){    //Create a new method addNewInfo ,it create new employee information.
        empinfo newInfo = new empinfo();
        history.add(newInfo);    //It adds empployee info to the history
        return newInfo;  //This will create a reference to the new Information.This refernce will help to put new data inside   
}
    
    public void deleteInfo(empinfo ei){
        history.remove(ei);
    }

        
        
        
        
        
        
       
    }
        
        
        
     
    

    
    
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author DhiralM
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory(){
        encounterHistory = new ArrayList<>();
        
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addEncounter(){
        Encounter e = new Encounter();
        encounterHistory.add(e);
        return e;
    }

    public int encounterCount() {
        return encounterHistory.size();
    }

    public Encounter getEncounter(String txtEncounterId) {
        Encounter e = new Encounter();
        for(Encounter eo : encounterHistory){
            if(eo.getEncounterId().equals(txtEncounterId)){
                e = eo;
                break;
            }
        }
        return e;
    }

    public Encounter getEncounterPatient(Patient p) {
        Encounter e = new Encounter();
        for(Encounter eh : encounterHistory){
            if(eh.getPatient().getPatientId().equals(p.getPatientId())){
                e = eh;
                break;
            }
        }
        return e;
        
    }

    public void deleteEncounter(Encounter h) {
        encounterHistory.remove(h);
    }
    
    
    
}

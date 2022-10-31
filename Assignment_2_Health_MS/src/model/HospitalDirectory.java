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
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalDirectory;
    
    public HospitalDirectory(){
        hospitalDirectory = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public Hospital addHospital(){
        Hospital h = new Hospital();
        hospitalDirectory.add(h);
        return h;
    }

    public Hospital getHospital(String txtHospitalId) {
        Hospital h = new Hospital();
        for(Hospital ho : hospitalDirectory){
            if(ho.getHospitalId().equals(txtHospitalId)){
                h = ho;
                break;
            }
        }
        return h;
    }
    
    public int hospitalCount(){
        return hospitalDirectory.size();
    }

    public void deleteHospital(Hospital h) {
        hospitalDirectory.remove(h);
    }
    
    
    
}

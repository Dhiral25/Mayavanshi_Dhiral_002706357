/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DhiralM
 */
public class SystemAdmin {
    private List<City> cities;
    private HospitalDirectory hospitalDirectory;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private EncounterHistory encounterHistory;
    
    

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    
    
    public SystemAdmin(){
        cities = new ArrayList<>();
        patientDirectory = new PatientDirectory();
        doctorDirectory = new DoctorDirectory();
        hospitalDirectory = new HospitalDirectory();
        encounterHistory = new EncounterHistory();
        
        addCities();
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }
    
    
    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    
    public City addCity(){
        City c = new City();
        cities.add(c);
        return c;
    }

    
    public City getCity(String text) {
        City getCity = new City();
        for(City c : cities){
            if(c.getId().equals(text)){
                getCity = c;
                break;
            }
        }
        return getCity;
    }

    private void addCities() {
       
    }
    
    
    
}

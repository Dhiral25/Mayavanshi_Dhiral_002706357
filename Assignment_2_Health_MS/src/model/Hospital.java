/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DhiralM
 */
public class Hospital {
    private String hospitalId;
    private String hospitalName;
    private Community community;
    private String phoneNumber;

    public String getHospitalId() {
        return hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Community getCommunity() {
        return community;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return this.hospitalName;
    }

    
    
    
    
}

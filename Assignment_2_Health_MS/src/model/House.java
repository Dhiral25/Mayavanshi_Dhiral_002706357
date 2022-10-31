/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DhiralM
 */
public class House {
    private String houseId;
    private String streetAddress;
    private Community community;
    private String pinCode;

    public String getHouseId() {
        return houseId;
    }
    
    
    
    public String getStreetAddress() {
        return streetAddress;
    }

    public Community getCommunity() {
        return community;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    
    @Override
    public String toString() {
        return this.streetAddress;
    }
    
    
}

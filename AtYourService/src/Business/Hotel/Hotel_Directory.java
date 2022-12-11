/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hotel;

/**
 *
 * @author DhiralM
 */

import Business.HotelManager.HotelManager;
import java.util.ArrayList;


public class Hotel_Directory {
    private ArrayList<Hotel> hospitalList;
    
    public Hotel_Directory() {
        hospitalList = new ArrayList();
    }

    public ArrayList<Hotel> getHotelList() {
        return hospitalList;
    }
    
    public Boolean deleteHotel(String name) {
        for(int i = 0; i < hospitalList.size(); i ++) {
            if(hospitalList.get(i).getName().equals(name)) {
                hospitalList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Hotel createHotel(String name, HotelManager rm, String phone, String location, String Network){
        Hotel rest = new Hotel();
        rest.setName(name);        
        rest.setPhone(phone);
        rest.setLocation(location);
        rest.setManagerDetails(rm);
        rest.setNetwork(Network);
        rest.setUserAccount(rm.getAccountDetails());
        hospitalList.add(rest);
        return rest;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HotelManager;

/**
 *
 * @author DhiralM
 */

import Business.UserAccount.UserAccount;
import java.util.ArrayList;


public class HotelManagerDirectory {
    
    private ArrayList<HotelManager> restaurantManagerList;
    
    public HotelManagerDirectory() {
        restaurantManagerList = new ArrayList();
    }

    public ArrayList<HotelManager> getHotelManagerList() {
        return restaurantManagerList;
    }
    
     public void setCustomerList(ArrayList<HotelManager> restaurantManagerList) {
        this.restaurantManagerList = restaurantManagerList;
    }
    
    public Boolean deleteHotelManager(String name) {
        for(int i = 0; i < restaurantManagerList.size(); i ++) {
            if(restaurantManagerList.get(i).getName().equals(name)) {
//                system.getUserAccountDirectory().deleteUser(restaurantManagerList.get(i).getAccountDetails().getUsername());
                restaurantManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public HotelManager createHotelManager(String name, UserAccount ua, String phone, String address, String Network){
        HotelManager cust = new HotelManager();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setNetwork(Network);
        restaurantManagerList.add(cust);
        return cust;
    }
}


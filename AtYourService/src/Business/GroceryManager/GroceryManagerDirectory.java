/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GroceryManager;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author DhiralM
 */
public class GroceryManagerDirectory {
    private ArrayList<GroceryManager> restaurantManagerList;
    
    public GroceryManagerDirectory() {
        restaurantManagerList = new ArrayList();
        
    }
    
    public ArrayList<GroceryManager> getGroceryManagerList() {
        return restaurantManagerList;
    }
    
    public void setCustomerList(ArrayList<GroceryManager> restaurantMangerList) {
        this.restaurantManagerList = restaurantManagerList;
        
    }
    public Boolean deleteGroceryManager(String name) {
        for(int i =0; i < restaurantManagerList.size(); i++) {
            if(restaurantManagerList.get(i).getName().equals(name)) {
                restaurantManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public GroceryManager createGroceryManager(String name, UserAccount ua, String phone, String address, String Network) {
        GroceryManager cust = new GroceryManager();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setNetwork(Network);
        restaurantManagerList.add(cust);
        return cust;       
    }
}

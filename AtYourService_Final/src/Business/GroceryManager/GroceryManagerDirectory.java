/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GroceryManager;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author dhiral
 */
public class GroceryManagerDirectory {
    private ArrayList<GroceryManager> restaurantManagerList;
    
    public GroceryManagerDirectory() {
        restaurantManagerList = new ArrayList();
    }

    public ArrayList<GroceryManager> getGroceryManagerList() {
        return restaurantManagerList;
    }
    
     public void setCustomerList(ArrayList<GroceryManager> restaurantManagerList) {
        this.restaurantManagerList = restaurantManagerList;
    }
    
    public Boolean deleteGroceryManager(String name) {
        for(int i = 0; i < restaurantManagerList.size(); i ++) {
            if(restaurantManagerList.get(i).getName().equals(name)) {
//                system.getUserAccountDirectory().deleteUser(restaurantManagerList.get(i).getAccountDetails().getUsername());
                restaurantManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public GroceryManager createGroceryManager(String name, UserAccount ua, String phone, String address, String Network){
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

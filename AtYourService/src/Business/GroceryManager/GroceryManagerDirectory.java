/*
<<<<<<< HEAD
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
>>>>>>> 4f99bc314fd54d079789b1d64a69a58790ce175b
 */
package Business.GroceryManager;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
<<<<<<< HEAD
 * @author dhiral
=======
 * @author DhiralM
>>>>>>> 4f99bc314fd54d079789b1d64a69a58790ce175b
 */
public class GroceryManagerDirectory {
    private ArrayList<GroceryManager> restaurantManagerList;
    
    public GroceryManagerDirectory() {
        restaurantManagerList = new ArrayList();
<<<<<<< HEAD
    }

=======
        
    }
    
>>>>>>> 4f99bc314fd54d079789b1d64a69a58790ce175b
    public ArrayList<GroceryManager> getGroceryManagerList() {
        return restaurantManagerList;
    }
    
<<<<<<< HEAD
     public void setCustomerList(ArrayList<GroceryManager> restaurantManagerList) {
        this.restaurantManagerList = restaurantManagerList;
    }
    
    public Boolean deleteGroceryManager(String name) {
        for(int i = 0; i < restaurantManagerList.size(); i ++) {
            if(restaurantManagerList.get(i).getName().equals(name)) {
//                system.getUserAccountDirectory().deleteUser(restaurantManagerList.get(i).getAccountDetails().getUsername());
=======
    public void setCustomerList(ArrayList<GroceryManager> restaurantMangerList) {
        this.restaurantManagerList = restaurantManagerList;
        
    }
    public Boolean deleteGroceryManager(String name) {
        for(int i =0; i < restaurantManagerList.size(); i++) {
            if(restaurantManagerList.get(i).getName().equals(name)) {
>>>>>>> 4f99bc314fd54d079789b1d64a69a58790ce175b
                restaurantManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
<<<<<<< HEAD
    public GroceryManager createGroceryManager(String name, UserAccount ua, String phone, String address, String Network){
=======
    public GroceryManager createGroceryManager(String name, UserAccount ua, String phone, String address, String Network) {
>>>>>>> 4f99bc314fd54d079789b1d64a69a58790ce175b
        GroceryManager cust = new GroceryManager();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setNetwork(Network);
        restaurantManagerList.add(cust);
<<<<<<< HEAD
        return cust;
=======
        return cust;       
>>>>>>> 4f99bc314fd54d079789b1d64a69a58790ce175b
    }
}

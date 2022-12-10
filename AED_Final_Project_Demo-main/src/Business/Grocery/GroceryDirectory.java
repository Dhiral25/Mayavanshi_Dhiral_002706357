/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Grocery;

import Business.GroceryManager.GroceryManager;
import java.util.ArrayList;

/**
 *
 * @author DhiralM
 */
public class GroceryDirectory {
    private ArrayList<Grocery> restaurantList;
    
    public GroceryDirectory() {
        restaurantList = new ArrayList();
    }

    public ArrayList<Grocery> getGroceryList() {
        return restaurantList;
    }
    
    public Boolean deleteGrocery(String name) {
        for(int i = 0; i < restaurantList.size(); i ++) {
            if(restaurantList.get(i).getName().equals(name)) {
                restaurantList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    
    public Grocery createGrocery(String name, GroceryManager rm, String phone, String location, String Network){
        Grocery rest = new Grocery();
        rest.setName(name);        
        rest.setPhone(phone);
        rest.setLocation(location);
        rest.setManagerDetails(rm);
        rest.setNetwork(Network);
        rest.setUserAccount(rm.getAccountDetails());
        restaurantList.add(rest);
        return rest;
    }
    
    
}

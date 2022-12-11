/*
<<<<<<< HEAD
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Grocery;

=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Grocery;


>>>>>>> 0b1d5158dacf5470d6f758671b2b457607ae88fe
import Business.GroceryManager.GroceryManager;
import java.util.ArrayList;

/**
 *
<<<<<<< HEAD
 * @author vikas
=======
 * @author DhiralM
>>>>>>> 0b1d5158dacf5470d6f758671b2b457607ae88fe
 */
public class GroceryDirectory {
    private ArrayList<Grocery> restaurantList;
    
    public GroceryDirectory() {
        restaurantList = new ArrayList();
<<<<<<< HEAD
=======
        
>>>>>>> 0b1d5158dacf5470d6f758671b2b457607ae88fe
    }

    public ArrayList<Grocery> getGroceryList() {
        return restaurantList;
    }
    
    public Boolean deleteGrocery(String name) {
<<<<<<< HEAD
        for(int i = 0; i < restaurantList.size(); i ++) {
=======
        for(int i=0; i < restaurantList.size(); i++) {
>>>>>>> 0b1d5158dacf5470d6f758671b2b457607ae88fe
            if(restaurantList.get(i).getName().equals(name)) {
                restaurantList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
<<<<<<< HEAD
    
    public Grocery createGrocery(String name, GroceryManager rm, String phone, String location, String Network){
        Grocery rest = new Grocery();
        rest.setName(name);        
=======
    public Grocery createGrocery(String name, GroceryManager rm, String phone, String location, String Network) {
        Grocery rest = new Grocery();
        rest.setName(name);
>>>>>>> 0b1d5158dacf5470d6f758671b2b457607ae88fe
        rest.setPhone(phone);
        rest.setLocation(location);
        rest.setManagerDetails(rm);
        rest.setNetwork(Network);
        rest.setUserAccount(rm.getAccountDetails());
        restaurantList.add(rest);
        return rest;
<<<<<<< HEAD
    }
    
    
=======
        
    }
>>>>>>> 0b1d5158dacf5470d6f758671b2b457607ae88fe
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.Legal.LegalDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Orders.OrderDirectory;
import Business.Orders.HotelDirectory;
import Business.Grocery.GroceryDirectory;
import Business.GroceryManager.GroceryManagerDirectory;
import Business.HotelManager.HotelManagerDirectory;
import Business.Maid.MaidDirectory;
import Business.MaidManager.MaidManagerDirectory;
import Business.Hotel.Hotel_Directory;
import Business.HospitalManager.HospitalManagerDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private GroceryDirectory groceryDirectory;
    private MaidDirectory maidDirectory;
    private CustomerDirectory customerDirectory;
    private LegalDirectory legalDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private GroceryManagerDirectory groceryManagerDirectory; 
    private MaidManagerDirectory maidManagerDirectory; 
    private OrderDirectory orderDirectory;
    private Hotel_Directory hotel_Directory;
    private HotelDirectory hotelDirectory;
    private HotelManagerDirectory hotelManagerDirectory; 
    private HospitalManagerDirectory hospitalManagerDirectory;


    public EcoSystem(HotelDirectory hotelDirectory, HotelManagerDirectory hotelManagerDirectory, LegalDirectory legalDirectory, MaidManagerDirectory maidManagerDirectory, MaidDirectory maidDirectory, GroceryDirectory groceryDirectory, OrderDirectory orderDirectory, HospitalManagerDirectory hospitalManagerDirectory, Hotel_Directory hotel_Directory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, GroceryManagerDirectory groceryManagerDirectory) {
        this.groceryDirectory = groceryDirectory;
        this.maidDirectory = maidDirectory;
        this.customerDirectory = customerDirectory;
        this.legalDirectory = legalDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.groceryManagerDirectory = groceryManagerDirectory;
        this.maidManagerDirectory = maidManagerDirectory;
        this.orderDirectory = orderDirectory;
        this.hospitalManagerDirectory = hospitalManagerDirectory;
        this.hotelDirectory = hotelDirectory;
        this.hotel_Directory = hotel_Directory;
        this.hotelManagerDirectory = hotelManagerDirectory;
    }
    
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
    }

    
    public boolean checkIfUserIsUnique(String userName){
       return false;
    }
}

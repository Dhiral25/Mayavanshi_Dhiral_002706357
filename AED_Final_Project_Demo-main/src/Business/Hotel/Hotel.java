/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hotel;

import Business.Orders.HotelOrder;
import Business.Orders.HotelDirectory;
import Business.HotelManager.HotelManager;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author DhiralM
 */
public class Hotel {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;    
    private String location;
    private String phone;
    private String rest;
    private HotelManager managerDetails;
    private UserAccount userAccount;
    private HashMap<String, String> menu;
    private ArrayList<HotelOrder> orderList;
    private HashMap<String, ArrayList<HotelOrder>> orders;
    private ArrayList<HotelDirectory> orderDirectoryList;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public ArrayList<HotelDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<HotelDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }
    
    public String getRest() {
        return rest;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }
    
    public HashMap<String, ArrayList<HotelOrder>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<HotelOrder>> orders) {
        this.orders = orders;
    }

    public ArrayList<HotelOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<HotelOrder> orderList) {
        this.orderList = orderList;
    }
    
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public HashMap<String, String> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, String> menu) {
        this.menu = menu;
    }
    
    
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public HotelManager getManagerDetails() {
        return managerDetails;
    }

    public void setManagerDetails(HotelManager managerDetails) {
        this.managerDetails = managerDetails;
    }
    
    public Hotel() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        orderList = new ArrayList<HotelOrder>();
        orders = new HashMap<String, ArrayList<HotelOrder>>();
        orderDirectoryList = new ArrayList<HotelDirectory>();
    }
    
    public String getManager() {
        return managerDetails.getName();
    }
    
    public void setMenuItem(String name, String value) {
        menu.put(name, value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Hotel.count = count;
    }
    
    
}

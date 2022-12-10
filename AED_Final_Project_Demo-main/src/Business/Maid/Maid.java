/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Maid;

/**
 *
 * @author DhiralM
 */

import Business.Orders.Order;
import Business.Orders.OrderDirectory;
import Business.MaidManager.MaidManager;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

public class Maid {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;    
    private String location;
    private String phone;
    private MaidManager managerDetails;
    private UserAccount userAccount;
    private HashMap<String, String> menu;
    private ArrayList<Order> orderList;
    private HashMap<String, ArrayList<Order>> orders;
    private ArrayList<OrderDirectory> orderDirectoryList;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public ArrayList<OrderDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<OrderDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }
    
    public HashMap<String, ArrayList<Order>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<Order>> orders) {
        this.orders = orders;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
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

    public MaidManager getManagerDetails() {
        return managerDetails;
    }

    public void setManagerDetails(MaidManager managerDetails) {
        this.managerDetails = managerDetails;
    }
    
    public Maid() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        orderList = new ArrayList<Order>();
        orders = new HashMap<String, ArrayList<Order>>();
        orderDirectoryList = new ArrayList<OrderDirectory>();
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
        Maid.count = count;
    }
}

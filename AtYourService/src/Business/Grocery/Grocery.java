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
import Business.Orders.Order;
import Business.Orders.OrderDirectory;
import Business.GroceryManager.GroceryManager;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< HEAD

/**
 *
 * @author vikas
 */
public class Grocery {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;    
=======
/**
 *
 * @author DhiralM
 */
public class Grocery {
    
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;
>>>>>>> 0b1d5158dacf5470d6f758671b2b457607ae88fe
    private String location;
    private String phone;
    private GroceryManager managerDetails;
    private UserAccount userAccount;
    private HashMap<String, String> menu;
    private ArrayList<Order> orderList;
    private HashMap<String, ArrayList<Order>> orders;
    private ArrayList<OrderDirectory> orderDirectoryList;
    private String Network;

<<<<<<< HEAD
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

    public GroceryManager getManagerDetails() {
        return managerDetails;
    }

    public void setManagerDetails(GroceryManager managerDetails) {
        this.managerDetails = managerDetails;
    }
    
    public Grocery() {
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

=======
>>>>>>> 0b1d5158dacf5470d6f758671b2b457607ae88fe
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
        Grocery.count = count;
    }
<<<<<<< HEAD
    
    
=======

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
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

    public GroceryManager getManagerDetails() {
        return managerDetails;
    }

    public void setManagerDetails(GroceryManager managerDetails) {
        this.managerDetails = managerDetails;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public HashMap<String, String> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, String> menu) {
        this.menu = menu;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public HashMap<String, ArrayList<Order>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<Order>> orders) {
        this.orders = orders;
    }

    public ArrayList<OrderDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<OrderDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }
    
    
    
    
    public Grocery() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        orderList = new ArrayList<Order>();
        orders = new HashMap<String, ArrayList<Order>>();
        orderDirectoryList = new ArrayList<OrderDirectory>();
    }
>>>>>>> 0b1d5158dacf5470d6f758671b2b457607ae88fe
}

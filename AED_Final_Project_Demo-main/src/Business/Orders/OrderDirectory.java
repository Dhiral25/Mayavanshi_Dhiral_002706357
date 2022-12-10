/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;

import Business.DeliveryMan.DeliveryMan;
import Business.Grocery.Grocery;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author DhiralM
 */
public class OrderDirectory {

    private ArrayList<Order> orderList;
    private String status;
    private DeliveryMan deliveryMan;
    private int id;
    private static int count = 1;
    private Boolean isAccept;
    private String comment;    
    private String feedbackComment;

    public String getFeedbackComment() {
        return feedbackComment;
    }

    public void setFeedbackComment(String feedbackComment) {
        this.feedbackComment = feedbackComment;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    private UserAccount customerDetails;
    private Grocery restaurant;

    public UserAccount getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(UserAccount customerDetails) {
        this.customerDetails = customerDetails;
    }

    public Grocery getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Grocery restaurant) {
        this.restaurant = restaurant;
    }

    public Boolean getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public OrderDirectory() {
        id = count;
        count++;
        orderList = new ArrayList();
        deliveryMan = new DeliveryMan();
        status = "Placed";
        comment = "";        
        feedbackComment = "";
        isAccept = false;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void deleteOrder(String name) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getItem().equals(name)) {
                orderList.remove(i);
                return;
            }
        }
    }

    public void deleteOrderAll() {
        for (int i = 0; i < orderList.size(); i++) {
            orderList.remove(i);
        }
    }

    public Order createOrder(String item, String price, int quantity, Grocery rest, UserAccount user) {
        Order order = new Order();
        order.setItem(item);
        order.setPrice(price);
        order.setQuantity(quantity);
        restaurant = rest;
        customerDetails = user;
        orderList.add(order);
        return order;
    }
}

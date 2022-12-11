/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Business.Orders;

import Business.MaidManager.MaidManager;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author parthshah
 */
public class Maid1Directory {
    private ArrayList<MaidOrder> orderList;
    private String status;
    private int id;
    private static int count = 1;
    private Boolean isAccept;
    private String comment;    
    private UserAccount customerDetails;
    private MaidManager maidManager;
    private String feedbackComment;

    public String getFeedbackComment() {
        return feedbackComment;
    }

    public void setFeedbackComment(String feedbackComment) {
        this.feedbackComment = feedbackComment;
    }

    public ArrayList<MaidOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<MaidOrder> orderList) {
        this.orderList = orderList;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        Maid1Directory.count = count;
    }

    public Boolean getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UserAccount getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(UserAccount customerDetails) {
        this.customerDetails = customerDetails;
    }

    public MaidManager getHospitalManager() {
        return maidManager;
    }

    public void setHospitalManager(MaidManager maidManager) {
        this.maidManager = maidManager;
    }
    
     public Maid1Directory() {
        id = count;
        count++;
        orderList = new ArrayList();
        status = "Placed";
        comment = "";        
        isAccept = false;
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

    public MaidOrder createOrder(String item, String price, String date, String total, String hrs, MaidManager leg, UserAccount user) {
        MaidOrder order1 = new MaidOrder();
        order1.setItem(item);
        order1.setPrice(price);
        order1.setDate(date);
        order1.setTime(hrs);
        order1.setTotal(total);
        maidManager = leg;
        customerDetails = user;
        orderList.add(order1);
        return order1;
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DhiralM
 */
public class Community {
    private String communityId;
    private String CommunityName;
    private City city;
    private List<House> houseList;
    
    public Community(){
       houseList = new ArrayList<>();
       addCommunities();
       
    }

    public String getCommunityId() {
        return communityId;
    }
    
    
    public String getCommunityName() {
        return CommunityName;
    }

    public City getCity() {
        return city;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }
    

    public void setCommunityName(String CommunityName) {
        this.CommunityName = CommunityName;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }
    
    @Override
    public String toString() {
        return this.CommunityName;
    }

    public House addHouse() {
        
        House h = new House();
        houseList.add(h);
        return h;
    }

    public House getHouse(String text) {
        House h = new House();
        for(House house : houseList){
            if(house.getHouseId().equals(text)){
                h = house;
                break;
            }
        }
        return h;
    }

    private void addCommunities() {
        
    }

    
    
    
    
    
    
}

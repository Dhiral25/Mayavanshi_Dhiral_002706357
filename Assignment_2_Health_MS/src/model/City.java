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
public class City {
    private String id;
    private String name;
    private String state;
    private List<Community> communityList;
    
    public City(){
        communityList = new ArrayList<>();
    }
    
    

    public String getId() {
        return id;
    }

    
    
    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public List<Community> getCommunityList() {
        return communityList;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCommunityList(List<Community> communityList) {
        this.communityList = communityList;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    public Community addCommunity(){
        
        Community c = new Community();
        communityList.add(c);
        return c;
    }

    public Community getCommunity(String text) {
        /*
        City getCity = new City();
        for(City c : cities){
            if(c.getId().equals(text)){
                getCity = c;
                break;
            }
        }
        return getCity;
        */
        Community c = new Community();
        for(Community community : communityList){
            if(community.getCommunityId().equals(text)){
                c = community;
                break;
            }
        }
        return c;
    }
    
    
    

    
    
}

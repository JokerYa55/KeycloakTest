/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.service;
import beans.user;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author vasil
 */
@SessionScoped
public class userController implements Serializable {

    private user currentUser;

    public userController(String username) {
        this.currentUser = new user();
        this.currentUser.setId(1);
        this.currentUser.setName(username);
        this.currentUser.setBalans(new BigDecimal(1000));
        service tempService = new service();
        tempService.setId(1);
        tempService.setName("Стационарный телефон");
        tempService.setPrice(new BigDecimal(250));
        List<service> tempList = new ArrayList<>();
        tempList.add(tempService);
        
        tempService = new service();
        tempService.setId(2);
        tempService.setName("Интернет");
        tempService.setPrice(new BigDecimal(600));
        tempList.add(tempService);
        this.currentUser.setServiceList(tempList);
    }

    public user getCurrentUser() {
        return currentUser;
    }

}

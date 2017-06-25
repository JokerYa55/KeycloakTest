/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import interfaces.userInterfaces;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author vasil
 * 
 */
public class user implements userInterfaces{
    private long id;
    private String name;
    private BigDecimal balans;    
    private List<service> serviceList;

    @Override
    public long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    @Override
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BigDecimal getBalans() {
        return balans;
    }

    @Override
    public void setBalans(BigDecimal balans) {
        this.balans = balans;
    }

    @Override
    public List<service> getServiceList() {
        return serviceList;
    }

    @Override
    public void setServiceList(List<service> serviceList) {
        this.serviceList = serviceList;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author vasil
 */
public class user {
    private long id;
    private String name;
    private BigDecimal balans;    
    private List<service> serviceList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalans() {
        return balans;
    }

    public void setBalans(BigDecimal balans) {
        this.balans = balans;
    }

    public List<service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<service> serviceList) {
        this.serviceList = serviceList;
    }
    
}

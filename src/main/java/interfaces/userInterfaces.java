/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import beans.service;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author vasil
 */
public interface userInterfaces {

    public long getId();

    public void setId(long id);

    public String getName();

    public void setName(String name);

    public BigDecimal getBalans();

    public void setBalans(BigDecimal balans);

    public List<service> getServiceList();

    public void setServiceList(List<service> serviceList);
}

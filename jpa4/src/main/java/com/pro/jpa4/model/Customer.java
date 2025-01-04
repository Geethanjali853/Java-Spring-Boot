package com.pro.jpa4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_tab")
public class Customer {
    @Id
    private Integer CustId;
    private String custName;
    private String CustLoc;


    public Customer() {
    }

    public Customer(Integer custId) {
        CustId = custId;
    }

    public Customer(String custName, String custLoc) {
        this.custName = custName;
        CustLoc = custLoc;
    }

    public Customer(Integer custId, String custName, String custLoc) {
        CustId = custId;
        this.custName = custName;
        CustLoc = custLoc;
    }

    public Integer getCustId() {
        return CustId;
    }

    public void setCustId(Integer custId) {
        CustId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustLoc() {
        return CustLoc;
    }

    public void setCustLoc(String custLoc) {
        CustLoc = custLoc;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustId=" + CustId +
                ", custName='" + custName + '\'' +
                ", CustLoc='" + CustLoc + '\'' +
                '}';
    }
}

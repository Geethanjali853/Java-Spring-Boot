package com.pro.jpa2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer empId;
    private String empName;
    private Double empSal;

    public Employee() {
        super();
    }
    public Employee(Integer empId) {
        this.empId = empId;
    }

    public Employee(String empName, Double empSal) {
        this.empName = empName;
        this.empSal = empSal;
    }

    public Employee(Integer empId, String empName, Double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }
}

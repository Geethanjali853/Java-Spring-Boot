package com.pro.jpa4.Runner;

import com.pro.jpa4.Repository.CustomerRepo;
import com.pro.jpa4.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Myrunner {
    @Autowired
    CustomerRepo cust_repo;

    public void run(String... args) throws Exception {
        cust_repo.save(new Customer(104,"Modi","New Delhi"));
    }
}

package com.pro.jpa1.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class MyRunner implements CommandLineRunner {

    @Autowired
    ProductRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Product("Samsung Mobile", 45000.45));
        System.out.println("Data Inserted");
    }
}

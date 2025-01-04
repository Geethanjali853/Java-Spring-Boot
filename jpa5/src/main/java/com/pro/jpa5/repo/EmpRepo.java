package com.pro.jpa5.repo;

import com.pro.jpa5.model.Employee;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Document
public interface EmpRepo extends MongoRepository<Employee,Integer> {
    public abstract void deleteByEmpId(Integer id);
    public abstract void deleteByEmpName(String ename);
    public abstract List<Employee> findByEmpSalGreaterThanEqual(Double sal);
    public abstract List<Employee> findByEmpNameLike(String pattern);
}
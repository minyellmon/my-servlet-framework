package com.example.democonnectionjdbc.service;

import com.example.democonnectionjdbc.dao.EmployeeDao;
import com.example.democonnectionjdbc.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired

    private EmployeeDao employeeDao;

//    @Transactional
    public void createEmployeeWithTransaction(){
        employeeDao.creteEmployee(new Employee(11,"Thuza","nwe","new@gmail.com",2000));
        employeeDao.creteEmployee(new Employee(12,"Thiha","Aung","Thiha@gmail.com",4000));
        employeeDao.creteEmployee(new Employee(13,"Thida","Myint","Thida@gmail.com",7000));
        employeeDao.creteEmployee(new Employee(14,"Yama","Zanaka","yama@gmail.com",9000));

    }

}

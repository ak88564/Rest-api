package com.company.mngment.service;


import com.company.mngment.entity.EmployeeEntity;
import com.company.mngment.model.EmployeeCreateRequest;
import com.company.mngment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeerepository;


    public void createEmployee(EmployeeCreateRequest request)
    {
        //if(request.getName().equals("")) throw new RuntimeException("hrf");

        EmployeeEntity employeentity = new EmployeeEntity();

        employeentity.setName(request.getName());
        employeentity.setAddress(request.getAddress());
        employeentity.setPostalcode(request.getPostalcode());
        employeentity.setPhoneNum(request.getPhoneNum());
        employeentity.setStartDate(request.getStartDate());
        employeentity.setEndDate(request.getEndDate());
        employeentity.setSalary(request.getSalary());
        employeentity.setState(request.getState());

        employeerepository.save(employeentity);
    }
    public EmployeeEntity getuserbyId(Long employeeId)
    {
        Optional<EmployeeEntity> employeeEntityOptional =employeerepository.findById(employeeId);
        return employeeEntityOptional.orElseGet(EmployeeEntity::new);
    }



}

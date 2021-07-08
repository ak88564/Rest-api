package com.company.mngment.service;


import com.company.mngment.entity.employeeEntity;
import com.company.mngment.model.EmployeeCreateRequest;
import com.company.mngment.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    employeeRepository employeerepository;


    public void createEmployee(EmployeeCreateRequest request)
    {
        //if(request.getName().equals("")) throw new RuntimeException("hrf");

        employeeEntity employeentity = new employeeEntity();

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
    public employeeEntity getuserbyId(Long employeeId)
    {
        Optional<employeeEntity> employeeEntityOptional =employeerepository.findById(employeeId);
        return employeeEntityOptional.orElseGet(employeeEntity::new);
    }



}

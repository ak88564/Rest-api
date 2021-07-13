package com.company.mngment.service;


import com.company.mngment.entity.EmployeeEntity;
import com.company.mngment.model.EmployeeCreateRequest;
import com.company.mngment.model.UpdateCreateRequest;
import com.company.mngment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
        employeentity.setPostalcode(request.getPostalCode());
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

    public List<EmployeeEntity> findAll()
    {
        return (List<EmployeeEntity>) employeerepository.findAll();
    }

    public String deleteEmployee(long empId) {
        employeerepository.deleteById(empId);
        return "Employee details deleted "+empId;
    }


    public String deleteEmployees() {

        employeerepository.deleteAll();
        return "All employees successfully removed from the database";
    }

    public EmployeeEntity updateEmployee(UpdateCreateRequest updateRequest, Long userId) {

        Optional<EmployeeEntity> byId=employeerepository.findById(userId);
        EmployeeEntity employeeEntity=byId.get();

        employeeEntity.setName(updateRequest.getName());
        employeeEntity.setAddress(updateRequest.getAddress());
        employeeEntity.setPostalcode(updateRequest.getPostalCode());
        employeeEntity.setPhoneNum(updateRequest.getPhoneNum());
        employeeEntity.setStartDate(updateRequest.getStartDate());
        employeeEntity.setEndDate(updateRequest.getEndDate());
        employeeEntity.setSalary(updateRequest.getSalary());
        employeeEntity.setState(updateRequest.getState());
        return employeerepository.save(employeeEntity);
    }
}

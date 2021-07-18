package com.company.mngment.mngmentcontroller;

import com.company.mngment.entity.EmployeeEntity;
import com.company.mngment.model.EmployeeCreateRequest;
import com.company.mngment.model.UpdateCreateRequest;
import com.company.mngment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MngmentController {

    @Autowired
    EmployeeService employeeservice;

    @PostMapping("api/v1/employee")
    public ResponseEntity<String> createUser(@RequestBody EmployeeCreateRequest employeeCreateRequest)
    {
        employeeservice.createEmployee(employeeCreateRequest);
        return ResponseEntity.ok("Employee added");
    }

    @GetMapping("api/v1/employee/{employeeId}")
    public ResponseEntity<EmployeeEntity> getemployeebyId(@PathVariable Long employeeId)
    {
        return ResponseEntity.ok(employeeservice.getuserbyId(employeeId));
    }


    @GetMapping("api/v1/employeeFindAll")
    public ResponseEntity <List<EmployeeEntity>> findAll()
    {
        return ResponseEntity.ok(employeeservice.findAll());
    }

    @DeleteMapping("/api/v1/employee/{userid}")
    public String deleteStudent(@PathVariable long userid)
    {
        return employeeservice.deleteEmployee(userid);
    }

    @DeleteMapping("/api/v1/employee/deleteAll")
    public String deleteEmployees()
    {
        employeeservice.deleteEmployees();
        return "All employee details successfully deleted";
    }

    @PutMapping("/api/v1/employee/{userId}")
    public EmployeeEntity updateEmployees(@RequestBody UpdateCreateRequest updateCreateRequest, @PathVariable Long userId){

        return employeeservice.updateEmployee(updateCreateRequest,userId);
    }

}

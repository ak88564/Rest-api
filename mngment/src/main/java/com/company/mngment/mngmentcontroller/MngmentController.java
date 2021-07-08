package com.company.mngment.mngmentcontroller;

import com.company.mngment.entity.EmployeeEntity;
import com.company.mngment.model.EmployeeCreateRequest;
import com.company.mngment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/Employee")
public class MngmentController {

    @Autowired
    EmployeeService employeeservice;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public EmployeeEntity createUser(@RequestBody EmployeeCreateRequest employeeCreateRequest)
    {
        employeeservice.createEmployee(employeeCreateRequest);
        return null;
    }

    @GetMapping("/{employeeId}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeEntity getemployeebyId(@PathVariable Long employeeId)
    {
        return employeeservice.getuserbyId(employeeId);
    }
}

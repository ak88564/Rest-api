package com.company.mngment.mngmentcontroller;

import com.company.mngment.entity.employeeEntity;
import com.company.mngment.model.EmployeeCreateRequest;
import com.company.mngment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class mngmentController {

    @Autowired
    EmployeeService employeeservice;

    @PostMapping("api/v1/Employee")
    public ResponseEntity<String> createUser(@RequestBody EmployeeCreateRequest employeeCreateRequest)
    {
        employeeservice.createEmployee(employeeCreateRequest);
        return ResponseEntity.ok("Employee added");
    }
    @GetMapping("api/v1/Employee/{employeeId}")
    public ResponseEntity<employeeEntity> getemployeebyId(@PathVariable Long employeeId)
    {
        return ResponseEntity.ok(employeeservice.getuserbyId(employeeId));
    }
}

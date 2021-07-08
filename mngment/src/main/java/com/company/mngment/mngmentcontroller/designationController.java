package com.company.mngment.mngmentcontroller;


import com.company.mngment.entity.designationEntity;
import com.company.mngment.model.designationCreateRequest;
import com.company.mngment.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class designationController {

    @Autowired
    DesignationService designationservice;

    @PostMapping("api/v1/Designation")
    public ResponseEntity<String> createDesignation(@RequestBody designationCreateRequest designationcreaterequest)
    {
        designationservice.createDesignation(designationcreaterequest);
        return ResponseEntity.ok("Designation given");
    }

    @GetMapping("api/v1/Designation/{designationId}")
    public ResponseEntity<designationEntity> getdesignationbyId(@PathVariable Long designationId)
    {
        return ResponseEntity.ok(designationservice.getdesignationbyId(designationId));
    }

}

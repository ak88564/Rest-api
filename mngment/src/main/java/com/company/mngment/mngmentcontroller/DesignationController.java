package com.company.mngment.mngmentcontroller;


import com.company.mngment.entity.DesignationEntity;
import com.company.mngment.model.DesignationCreateRequest;
import com.company.mngment.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DesignationController {

    @Autowired
    DesignationService designationservice;

    @PostMapping("api/v1/Designation")
    public ResponseEntity<String> createDesignation(@RequestBody DesignationCreateRequest designationcreaterequest)
    {
        designationservice.createDesignation(designationcreaterequest);
        return ResponseEntity.ok("Designation given");
    }

    @GetMapping("api/v1/Designation/{designationId}")
    public ResponseEntity<DesignationEntity> getdesignationbyId(@PathVariable Long designationId)
    {
        return ResponseEntity.ok(designationservice.getdesignationbyId(designationId));
    }

}

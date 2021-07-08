package com.company.mngment.mngmentcontroller;


import com.company.mngment.model.taskallotmentCreateRequest;
import com.company.mngment.service.TaskallotmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskAllotmentController {

    @Autowired
    TaskallotmentService taskallotmentservice;

    public ResponseEntity<String> createTaskAllotment(@RequestBody taskallotmentCreateRequest taskallotmentcreaterequest)
    {
        taskallotmentservice.createTaskallotment(taskallotmentcreaterequest);
        return ResponseEntity.ok("Task allotment created");
    }
}

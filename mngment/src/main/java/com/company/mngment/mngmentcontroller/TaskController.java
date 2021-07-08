package com.company.mngment.mngmentcontroller;


import com.company.mngment.model.TaskCreateRequest;
import com.company.mngment.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    TaskService taskservice;

    @PostMapping("api/v1/Task")
    public ResponseEntity<String> createTask(@RequestBody TaskCreateRequest taskcreaterequest)
    {
        taskservice.createTask(taskcreaterequest);
        return ResponseEntity.ok("Task created");
    }


}

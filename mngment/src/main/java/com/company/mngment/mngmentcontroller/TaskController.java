package com.company.mngment.mngmentcontroller;


import com.company.mngment.entity.TaskEntity;
import com.company.mngment.model.TaskCreateRequest;
import com.company.mngment.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    TaskService taskservice;

    @PostMapping("api/v1/task")
    public ResponseEntity<String> createTask(@RequestBody TaskCreateRequest taskcreaterequest)
    {
        taskservice.createTask(taskcreaterequest);
        return ResponseEntity.ok("Task created");
    }

    @GetMapping("api/v1/Task/{taskId}")
    public ResponseEntity<TaskEntity> gettaskbyId(@PathVariable Long taskId)
    {
        return ResponseEntity.ok(taskservice.gettaskbyId(taskId));
    }


}

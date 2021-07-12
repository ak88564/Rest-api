package com.company.mngment.mngmentcontroller;


import com.company.mngment.entity.TaskAllotmentEntity;
import com.company.mngment.model.TaskallotmentCreateRequest;
import com.company.mngment.service.TaskallotmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/taskallotment")
public class TaskAllotmentController {

    @Autowired
    TaskallotmentService taskallotmentService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<String> createTaskAllotment(@RequestBody TaskallotmentCreateRequest taskallotmentcreaterequest)
    {
        taskallotmentService.createTaskallotment(taskallotmentcreaterequest);
        return null;
    }

    @GetMapping("/{taskAllotId}")
    @ResponseStatus(HttpStatus.OK)
    public TaskAllotmentEntity getTaskAllotmentById(@PathVariable Long taskAllotId)
    {

        return taskallotmentService.getById(taskAllotId);

    }
}

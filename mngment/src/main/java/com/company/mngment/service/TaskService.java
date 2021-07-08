package com.company.mngment.service;


import com.company.mngment.entity.TaskEntity;
import com.company.mngment.model.TaskCreateRequest;
import com.company.mngment.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskrepository;


    public void createTask(TaskCreateRequest request) {
        TaskEntity taskentity=new TaskEntity();

        taskentity.setTaskDescription(request.getTaskDescription());

        taskrepository.save(taskentity);



    }
}

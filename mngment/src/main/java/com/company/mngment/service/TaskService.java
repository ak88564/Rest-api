package com.company.mngment.service;


import com.company.mngment.entity.taskEntity;
import com.company.mngment.model.taskCreateRequest;
import com.company.mngment.repository.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private taskRepository taskrepository;


    public void createTask(taskCreateRequest request) {
        taskEntity taskentity=new taskEntity();

        taskentity.setTaskDescription(request.getTaskDescription());

        taskrepository.save(taskentity);



    }
}

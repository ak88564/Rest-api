package com.company.mngment.service;


import com.company.mngment.entity.TaskAllotmentEntity;
import com.company.mngment.model.TaskallotmentCreateRequest;
import com.company.mngment.repository.TaskallotmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskallotmentService {


    @Autowired
    TaskallotmentRepository taskallotmentRepository;

    public void createTaskallotment(TaskallotmentCreateRequest request) {

        TaskAllotmentEntity taskallotmententity = new TaskAllotmentEntity();

        taskallotmententity.setTaskallotId(request.getTaskallotId());
        taskallotmententity.setRating(request.getRating());
        taskallotmententity.setFeedback(request.getFeedback());
        taskallotmententity.setStatus(request.getStatus());
        taskallotmententity.setStartdate(request.getStartdate());
        taskallotmententity.setEnddate(request.getEnddate());

        taskallotmentRepository.save(taskallotmententity);

    }

    public TaskAllotmentEntity getById(Long taskAllotId) {

        Optional<TaskAllotmentEntity> taskAllotmentEntityOptional=taskallotmentRepository.findById(taskAllotId);
        return taskAllotmentEntityOptional.orElseGet(TaskAllotmentEntity::new);
    }
}

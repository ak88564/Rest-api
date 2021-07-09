package com.company.mngment.service;


import com.company.mngment.entity.TaskAllotmentEntity;
import com.company.mngment.model.TaskallotmentCreateRequest;
import com.company.mngment.repository.TaskallotmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskallotmentService {


    @Autowired
    private TaskallotmentRepository taskallotmentrepository;

    public void createTaskallotment(TaskallotmentCreateRequest request) {

        TaskAllotmentEntity taskallotmententity = new TaskAllotmentEntity();

        taskallotmententity.setTaskallotId(request.getTaskallotId());
        taskallotmententity.setRating(request.getRating());
        taskallotmententity.setFeedback(request.getFeedback());
        taskallotmententity.setStatus(request.getStatus());
        taskallotmententity.setStartdate(request.getStartdate());
        taskallotmententity.setEnddate(request.getEnddate());

        taskallotmentrepository.save(taskallotmententity);

    }
}

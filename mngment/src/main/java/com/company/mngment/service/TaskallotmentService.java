package com.company.mngment.service;


import com.company.mngment.entity.taskallotmentEntity;
import com.company.mngment.model.taskallotmentCreateRequest;
import com.company.mngment.repository.taskallotmentRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskallotmentService {


    @Autowired
    private taskallotmentRepository taskallotmentrepository;

    public void createTaskallotment(taskallotmentCreateRequest request) {

        taskallotmentEntity taskallotmententity = new taskallotmentEntity();

        taskallotmententity.setTaskallotId(request.getTaskallotId());
        taskallotmententity.setRanking(request.getRanking());
        taskallotmententity.setFeedback(request.getFeedback());
        taskallotmententity.setStatus(request.getStatus());
        taskallotmententity.setStartdate(request.getStartdate());
        taskallotmententity.setEnddate(request.getEnddate());

        taskallotmentrepository.save(taskallotmententity);

    }
}

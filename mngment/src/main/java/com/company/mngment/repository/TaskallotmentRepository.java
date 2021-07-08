package com.company.mngment.repository;


import com.company.mngment.entity.TaskAllotmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskallotmentRepository extends CrudRepository<TaskAllotmentEntity, Long> {


}

package com.company.mngment.repository;

import com.company.mngment.entity.taskEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface taskRepository extends CrudRepository<taskEntity, Long> {


}

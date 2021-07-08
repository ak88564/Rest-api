package com.company.mngment.repository;


import com.company.mngment.entity.taskallotmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface taskallotmentRepository extends CrudRepository<taskallotmentEntity, Long> {


}

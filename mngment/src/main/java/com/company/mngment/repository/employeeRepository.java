package com.company.mngment.repository;


import com.company.mngment.entity.employeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface employeeRepository extends CrudRepository<employeeEntity, Long> {


    Optional<employeeEntity> findById(Long userID);




}

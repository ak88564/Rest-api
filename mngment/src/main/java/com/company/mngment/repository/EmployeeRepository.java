package com.company.mngment.repository;


import com.company.mngment.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {


    Optional<EmployeeEntity> findById(Long userID);




}

package com.company.mngment.repository;


import com.company.mngment.entity.designationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface designationRepository extends CrudRepository<designationEntity, Long> {



}

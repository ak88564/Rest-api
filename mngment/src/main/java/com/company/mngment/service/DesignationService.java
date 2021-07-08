package com.company.mngment.service;


import com.company.mngment.entity.designationEntity;
import com.company.mngment.model.designationCreateRequest;
import com.company.mngment.repository.designationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DesignationService {

    @Autowired
    private designationRepository designationrepository;

    public void createDesignation(designationCreateRequest request)
    {
        designationEntity designationentity=new designationEntity();

        designationentity.setDesignatedAs(request.getDesignatedAs());

        designationrepository.save(designationentity);
    }

    public designationEntity getdesignationbyId(Long designationId)
    {
        Optional<designationEntity> designationEntityOptional=designationrepository.findById(designationId);
        return designationEntityOptional.orElseGet(designationEntity::new);

    }
}

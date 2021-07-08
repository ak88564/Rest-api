package com.company.mngment.service;


import com.company.mngment.entity.DesignationEntity;
import com.company.mngment.model.DesignationCreateRequest;
import com.company.mngment.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DesignationService {

    @Autowired
    private DesignationRepository designationrepository;

    public void createDesignation(DesignationCreateRequest request)
    {
        DesignationEntity designationentity=new DesignationEntity();

        designationentity.setDesignatedAs(request.getDesignatedAs());

        designationrepository.save(designationentity);
    }

    public DesignationEntity getdesignationbyId(Long designationId)
    {
        Optional<DesignationEntity> designationEntityOptional=designationrepository.findById(designationId);
        return designationEntityOptional.orElseGet(DesignationEntity::new);

    }
}

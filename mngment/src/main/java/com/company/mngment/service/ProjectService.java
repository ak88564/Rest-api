package com.company.mngment.service;


import com.company.mngment.entity.ProjectEntity;
import com.company.mngment.model.ProjectCreateRequest;
import com.company.mngment.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public void createProject(ProjectCreateRequest request) {

        ProjectEntity projectEntity=new ProjectEntity();

        projectEntity.setProjectName(request.getProjectName());

        projectRepository.save(projectEntity);
    }

    public ProjectEntity getById(Long projectId) {

        Optional<ProjectEntity> projectEntityOptional=projectRepository.findById(projectId);
        return projectEntityOptional.orElseGet(ProjectEntity::new);
    }
}

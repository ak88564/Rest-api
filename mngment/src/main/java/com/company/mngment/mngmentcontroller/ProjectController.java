package com.company.mngment.mngmentcontroller;

import com.company.mngment.entity.ProjectEntity;
import com.company.mngment.model.ProjectCreateRequest;
import com.company.mngment.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ProjectEntity createProject(@RequestBody ProjectCreateRequest projectCreateRequest)
    {
        projectService.createProject(projectCreateRequest);
        return null;

    }

    @GetMapping("/{projectId}")
    @ResponseStatus(HttpStatus.OK)
    public ProjectEntity getProjectById(@PathVariable Long projectId)
    {
        return projectService.getById(projectId);
    }
}

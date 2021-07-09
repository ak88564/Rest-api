package com.company.mngment.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long projectId;

    private String projectName;

    @OneToMany(targetEntity = TaskEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name="projectid_fk", referencedColumnName = "projectId")
    private List<TaskEntity> task;
}

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
@Table(name="task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taskId")
    private Long taskId;

    private String taskDescription;


    //@OneToOne(targetEntity = TaskAllotmentEntity.class, cascade = CascadeType.ALL)
    //@JoinColumn(name="taskid_fk", referencedColumnName = "taskId")
    //private List<TaskAllotmentEntity> task_allotment;

    //private Long projectId;

}

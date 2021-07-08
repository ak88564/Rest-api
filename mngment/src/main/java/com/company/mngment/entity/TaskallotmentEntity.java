package com.company.mngment.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "taskallotment")
public class TaskallotmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskallotId;

   // @OneToOne(mappedBy = "taskallotment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private Long ranking;
    private String feedback;
    private String status;
    private String startdate;
    private String enddate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    private TaskEntity task;

}



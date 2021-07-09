package com.company.mngment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 50)
    private String Name;

    private String Address;
    private Integer postalcode;
    private Integer phoneNum;
    private String startDate;
    private String endDate;
    private Integer Salary;
    private String State;


    @OneToMany(targetEntity = TaskAllotmentEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name="empid_fk", referencedColumnName = "Id")
    private List<TaskAllotmentEntity> taskAllotment;


}






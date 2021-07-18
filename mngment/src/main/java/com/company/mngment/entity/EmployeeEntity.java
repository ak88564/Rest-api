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
@Table(name="employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    private String address;
    private Integer postalcode;
    private Integer phoneNum;
    private String startDate;
    private String endDate;
    private Integer salary;
    private String state;


    @OneToMany(targetEntity = TaskAllotmentEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name="empid_fk", referencedColumnName = "id")
    private List<TaskAllotmentEntity> taskAllotment;

    //@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "designation_id")
    //private List<DesignationEntity> designation;




}






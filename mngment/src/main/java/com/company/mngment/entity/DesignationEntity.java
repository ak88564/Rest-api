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
    @Table(name="Designation")
    public class DesignationEntity
    {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "designationId")
        private Long designationId;

        private String designatedAs;

        @OneToMany(targetEntity = EmployeeEntity.class, cascade = CascadeType.ALL)
        @JoinColumn(name="desigid_fk", referencedColumnName = "designationId")
        private List<EmployeeEntity> employeeId;

    }

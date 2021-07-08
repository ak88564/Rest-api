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
    @Table(name="Designation")
    public class DesignationEntity
    {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long designationId;

        private String designatedAs;

    }

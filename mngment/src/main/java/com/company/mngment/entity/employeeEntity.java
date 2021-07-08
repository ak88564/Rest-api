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
@Table(name="Employee")
public class employeeEntity {

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
}






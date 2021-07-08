package com.company.mngment.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EmployeeCreateRequest {

private String Name;
private String Address;
private Integer postalcode;
private Integer phoneNum;
private String startDate;
private String endDate;
private Integer Salary;
private String State;

}

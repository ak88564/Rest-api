package com.company.mngment.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EmployeeCreateRequest {

private String name;
private String address;
private Integer postalCode;
private Integer phoneNum;
private String startDate;
private String endDate;
private Integer salary;
private String state;

}

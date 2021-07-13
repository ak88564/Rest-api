package com.company.mngment.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UpdateCreateRequest {

    private String name;
    private String address;
    private Integer postalCode;
    private Integer phoneNum;
    private String startDate;
    private String endDate;
    private Integer salary;
    private String state;

}

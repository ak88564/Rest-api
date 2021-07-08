package com.company.mngment.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class TaskallotmentCreateRequest {

    private Long taskallotId;
    private Long ranking;
    private String feedback;
    private String status;
    private String startdate;
    private String enddate;

}

package com.example.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // used to create table of job class
@Table(name = "Jobs")
public class Job {
    @Id
    private Long jobId;
    private String title;
    private String description;
    private String location;

    @Min(value = 20000 , message = "Salary should be equal to or greater than 20000rs..")
    private Double salary;


    private String companyEmail;

    private String companyName;

    private String employerName;

    @Enumerated(EnumType.STRING)  // Now values of enums will get stored as String not as ordinals means integers

    private JobType jobType;

    private LocalDate appliedDate;

}

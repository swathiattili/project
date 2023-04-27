package com.cox.departmentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.ResponseEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "Department")
public class Department {


    @Transient
    public static final String SEQUENCE_NAME = "user_sequence";
    @Id
    private int id;
    private String departmentName;
    private String departmentCode;
}

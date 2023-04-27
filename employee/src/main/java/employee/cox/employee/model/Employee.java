package employee.cox.employee.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Employee")
public class Employee {

    @Transient
    public static final String SEQUENCE_NAME = "employee_sequence";
    @Id
    private int employeeId;

    private String employeeName;

    private double salary;

    private String departmentCode;
}

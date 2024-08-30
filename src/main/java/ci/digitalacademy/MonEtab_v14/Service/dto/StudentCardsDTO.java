package ci.digitalacademy.MonEtab_v14.Service.dto;

import ci.digitalacademy.MonEtab_v14.Model.Student;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.Set;

@Getter
@Setter
public class StudentCardsDTO {
    private Long id;

    private String reference;
    private Date issueDate;
    private Date expirationDate;

    private Set<Student> student;

}

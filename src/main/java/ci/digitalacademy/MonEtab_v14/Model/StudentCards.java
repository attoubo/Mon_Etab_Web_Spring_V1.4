package ci.digitalacademy.MonEtab_v14.Model;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;


public class StudentCards {

    private Long id;

    private String reference;
    private Date issueDate;
    private Date expirationDate;

    @ManyToOne
    private Set<Student> student;

}

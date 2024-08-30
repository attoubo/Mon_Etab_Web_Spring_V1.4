package ci.digitalacademy.MonEtab_v14.Model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;


public class Student extends Person {

    private String matricule;
    private String phoneNumber;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Absence> absences;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_card_id", referencedColumnName = "id")
    private StudentCards studentCard;
}

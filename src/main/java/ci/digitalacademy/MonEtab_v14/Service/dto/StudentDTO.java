package ci.digitalacademy.MonEtab_v14.Service.dto;

import ci.digitalacademy.MonEtab_v14.Model.Absence;
import ci.digitalacademy.MonEtab_v14.Model.StudentCards;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentDTO {
    private String matricule;
    private String phoneNumber;

    private List<Absence> absences;
    private StudentCards studentCard;

}

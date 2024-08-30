package ci.digitalacademy.MonEtab_v14.Service.dto;

import ci.digitalacademy.MonEtab_v14.Model.Student;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AbsenceDTO {
    private Date absenceDate;
    private int absenceNumber;

}

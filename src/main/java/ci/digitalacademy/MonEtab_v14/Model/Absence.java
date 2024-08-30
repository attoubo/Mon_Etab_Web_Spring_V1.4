package ci.digitalacademy.MonEtab_v14.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

public class Absence {

        private Date absenceDate;
        private int absenceNumber;

        @ManyToOne(fetch = FetchType.LAZY)
        private Student student;
}

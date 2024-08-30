package ci.digitalacademy.MonEtab_v14.Repository;

import ci.digitalacademy.MonEtab_v14.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCardsRepository extends JpaRepository<Student, Long> {
}

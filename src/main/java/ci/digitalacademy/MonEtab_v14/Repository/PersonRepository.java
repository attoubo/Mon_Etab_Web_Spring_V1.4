package ci.digitalacademy.MonEtab_v14.Repository;

import ci.digitalacademy.MonEtab_v14.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

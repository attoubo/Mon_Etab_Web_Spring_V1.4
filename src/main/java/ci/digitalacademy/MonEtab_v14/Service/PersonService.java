package ci.digitalacademy.MonEtab_v14.Service;

import ci.digitalacademy.MonEtab_v14.Model.Gender;
import ci.digitalacademy.MonEtab_v14.Model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    Person save(Person person);
    Person update(Person person);
    Optional<Person> findOne(Long id);
    List<Person> findAll();
    void deleteById(Long id);
}

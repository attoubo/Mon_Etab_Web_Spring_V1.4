package ci.digitalacademy.MonEtab_v14.Service;

import ci.digitalacademy.MonEtab_v14.Model.Student;
import ci.digitalacademy.MonEtab_v14.Model.StudentCards;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student save(Student student);
    Student update(Student student);
    Optional<Student> findOne(Long id);
    List<Student> findAll();
    void deleteById(Long id);
}

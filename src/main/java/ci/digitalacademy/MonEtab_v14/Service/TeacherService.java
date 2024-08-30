package ci.digitalacademy.MonEtab_v14.Service;

import ci.digitalacademy.MonEtab_v14.Model.Student;
import ci.digitalacademy.MonEtab_v14.Model.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
    Teacher save(Teacher teacher);
    Teacher update(Teacher teacher);
    Optional<Teacher> findOne(Long id);
    List<Teacher> findAll();
    void deleteById(Long id);
}

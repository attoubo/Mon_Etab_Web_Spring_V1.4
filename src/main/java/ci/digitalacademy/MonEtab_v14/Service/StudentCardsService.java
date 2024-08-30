package ci.digitalacademy.MonEtab_v14.Service;

import ci.digitalacademy.MonEtab_v14.Model.School;
import ci.digitalacademy.MonEtab_v14.Model.StudentCards;

import java.util.List;
import java.util.Optional;

public interface StudentCardsService {

    StudentCards save(StudentCards studentCards);
    StudentCards update(StudentCards studentCards);
    Optional<StudentCards> findOne(Long id);
    List<StudentCards> findAll();
    void deleteById(Long id);

}

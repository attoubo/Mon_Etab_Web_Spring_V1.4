package ci.digitalacademy.MonEtab_v14.Service;

import ci.digitalacademy.MonEtab_v14.Model.RoleUser;
import ci.digitalacademy.MonEtab_v14.Model.School;

import java.util.List;
import java.util.Optional;

public interface SchoolService {
    School save(School school);
    School update(School school);
    Optional<School> findOne(Long id);
    List<School> findAll();
    void deleteById(Long id);
}

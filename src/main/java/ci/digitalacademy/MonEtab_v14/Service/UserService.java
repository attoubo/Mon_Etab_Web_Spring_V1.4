package ci.digitalacademy.MonEtab_v14.Service;

import ci.digitalacademy.MonEtab_v14.Model.Teacher;
import ci.digitalacademy.MonEtab_v14.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    User update(User user);
    Optional<User> findOne(Long id);
    List<User> findAll();
    void deleteById(Long id);

}

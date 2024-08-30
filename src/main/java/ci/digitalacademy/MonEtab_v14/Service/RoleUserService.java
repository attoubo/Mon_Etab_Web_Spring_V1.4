package ci.digitalacademy.MonEtab_v14.Service;

import ci.digitalacademy.MonEtab_v14.Model.Person;
import ci.digitalacademy.MonEtab_v14.Model.RoleUser;

import java.util.List;
import java.util.Optional;

public interface RoleUserService {
    RoleUser save(RoleUser roleUser);
    RoleUser update(RoleUser roleUser);
    Optional<RoleUser> findOne(Long id);
    List<RoleUser> findAll();
    void deleteById(Long id);
}

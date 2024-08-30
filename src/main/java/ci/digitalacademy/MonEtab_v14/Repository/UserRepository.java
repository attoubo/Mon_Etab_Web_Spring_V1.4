package ci.digitalacademy.MonEtab_v14.Repository;

import ci.digitalacademy.MonEtab_v14.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

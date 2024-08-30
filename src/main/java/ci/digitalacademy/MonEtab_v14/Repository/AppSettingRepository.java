package ci.digitalacademy.MonEtab_v14.Repository;

import ci.digitalacademy.MonEtab_v14.Model.AppSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppSettingRepository extends JpaRepository<AppSetting, Long> {
}

package ci.digitalacademy.MonEtab_v14.Service;

import ci.digitalacademy.MonEtab_v14.Model.AppSetting;
import ci.digitalacademy.MonEtab_v14.Service.dto.AbsenceDTO;

import java.util.List;
import java.util.Optional;

public interface AppSettingService {
    AppSetting save(AppSetting appSetting);
    AppSetting update(AppSetting appSetting);
    Optional<AppSetting> findOne(Long id);
    List<AbsenceDTO> findAll();
    void deleteById(Long id);
}

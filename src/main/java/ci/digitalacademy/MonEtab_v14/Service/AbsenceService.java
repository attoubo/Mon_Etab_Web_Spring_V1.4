package ci.digitalacademy.MonEtab_v14.Service;

import ci.digitalacademy.MonEtab_v14.Service.dto.AbsenceDTO;
import ci.digitalacademy.MonEtab_v14.Service.dto.AddressDTO;

import java.util.List;
import java.util.Optional;

public interface AbsenceService {
    AbsenceDTO save(AbsenceDTO absenceDTO);
    AbsenceDTO update(AbsenceDTO absenceDTO);
    Optional<AbsenceDTO> findOne(Long id);
    List<AbsenceDTO> findAll();
    void deleteById(Long id);

}

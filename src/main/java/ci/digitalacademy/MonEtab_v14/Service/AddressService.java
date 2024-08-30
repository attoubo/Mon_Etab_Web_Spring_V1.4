package ci.digitalacademy.MonEtab_v14.Service;

import ci.digitalacademy.MonEtab_v14.Service.dto.AddressDTO;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    AddressDTO save(AddressDTO address);
    AddressDTO update(AddressDTO address);
    Optional<AddressDTO> findOne(Long id);
    List<AddressDTO> findAll();
    void deleteById(Long id);

}

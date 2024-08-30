package ci.digitalacademy.MonEtab_v14.Service.dto;

import ci.digitalacademy.MonEtab_v14.Model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleUserDTO {

    private Long id;
    private String role;

    private User user;

}

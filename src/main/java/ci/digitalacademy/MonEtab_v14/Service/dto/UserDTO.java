package ci.digitalacademy.MonEtab_v14.Service.dto;

import ci.digitalacademy.MonEtab_v14.Model.RoleUser;
import ci.digitalacademy.MonEtab_v14.Model.School;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class UserDTO {
    private String pseudo;
    private String password;
    private Date creationDate;

    private RoleUser role;
    private School school;
}

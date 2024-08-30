package ci.digitalacademy.MonEtab_v14.Service.dto;

import ci.digitalacademy.MonEtab_v14.Model.Address;
import ci.digitalacademy.MonEtab_v14.Model.Gender;
import ci.digitalacademy.MonEtab_v14.Model.User;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class PersonDTO {
    private int id;
    private Date birthday;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String url_picture;

    private Gender gender;

    private Address address;

    private User user;
}

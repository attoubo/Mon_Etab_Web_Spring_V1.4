package ci.digitalacademy.MonEtab_v14.Service.dto;

import ci.digitalacademy.MonEtab_v14.Model.AppSetting;
import ci.digitalacademy.MonEtab_v14.Model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SchoolDTO {
    private int id;
    private String name;
    private String url_logo;

    private User user;
    private AppSetting appSetting;

}

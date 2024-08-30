package ci.digitalacademy.MonEtab_v14.Service.dto;
import ci.digitalacademy.MonEtab_v14.Model.School;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppSettingDTO {

    private int id;
    private String smtp_server;
    private int smtp_port;
    private String smtp_username;
    private String smtp_password;

}

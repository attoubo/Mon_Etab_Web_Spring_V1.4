package ci.digitalacademy.MonEtab_v14.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class AppSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String smtp_server;
    private int smtp_port;
    private String smtp_username;
    private String smtp_password;
    @OneToOne
    private School school;
}

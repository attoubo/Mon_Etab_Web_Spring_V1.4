package ci.digitalacademy.MonEtab_v14.Model;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class School {
    private int id;
    private String name;
    private String url_logo;

    @OneToMany
    private User user;

    @OneToOne(mappedBy = "school")
    private AppSetting appSetting;
}

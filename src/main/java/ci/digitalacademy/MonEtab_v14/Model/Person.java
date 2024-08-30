package ci.digitalacademy.MonEtab_v14.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;

import java.sql.Date;

public abstract class Person {
    private int id;
    private Date birthday;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String url_picture;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;
}

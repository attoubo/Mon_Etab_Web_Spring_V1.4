package ci.digitalacademy.MonEtab_v14.Model;

import jakarta.persistence.*;
import lombok.*;

public class RoleUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

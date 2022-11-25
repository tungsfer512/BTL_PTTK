package io.team05.btl.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "my_fullname")
public class Fullname implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstname;
    String lastname;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "fullname", cascade = CascadeType.ALL, orphanRemoval = true)
    User user;

}

package io.team05.btl.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String street;
    String town;
    String district;
    String city;

    @OneToOne
    @JoinColumn(name = "user_id")
    User user;

}

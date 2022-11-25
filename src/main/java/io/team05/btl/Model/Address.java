package io.team05.btl.Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "my_address")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String street;
    String town;
    String district;
    String city;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    User user;
}

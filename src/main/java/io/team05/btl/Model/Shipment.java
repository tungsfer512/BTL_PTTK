package io.team05.btl.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "my_shipment")
public class Shipment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String note;
    Double cost;
    String method;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "shipment", cascade = CascadeType.ALL, orphanRemoval = true)
    Payment payment;
}

package io.team05.btl.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double amount;
    String status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    User customer;

    @OneToMany(mappedBy = "order")
    List<Payment> payments;

    @OneToOne(mappedBy = "order")
    Shipment shipment;
}

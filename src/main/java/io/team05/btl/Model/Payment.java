package io.team05.btl.Model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "payment")
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double amount;
    String card;
    String cvv;
    String method;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "payment", cascade = CascadeType.ALL, orphanRemoval = true)
    Order order;

    @OneToOne
    @JoinColumn(name = "shipment_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Shipment shipment;
}

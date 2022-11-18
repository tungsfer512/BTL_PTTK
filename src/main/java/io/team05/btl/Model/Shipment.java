package io.team05.btl.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shipment")
public class Shipment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String note;
    Double cost;
    String deliverytime;
    String deliverymethod;

    @OneToOne
    @JoinColumn(name = "order_id")
    Order order;
}

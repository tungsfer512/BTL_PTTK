package io.team05.btl.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "payment")
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double amount;
    String number;
    String type;
    String expdate;
    Double cashtendered;
    String paymentmethod;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

    @OneToOne
    @JoinColumn(name = "cart_id")
    Cart cart;
}

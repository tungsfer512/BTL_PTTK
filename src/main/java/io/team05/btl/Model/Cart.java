package io.team05.btl.Model;

import net.bytebuddy.utility.nullability.MaybeNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cart")
public class Cart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer quantity;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

    @OneToOne(mappedBy = "cart")
    Payment payment;
}


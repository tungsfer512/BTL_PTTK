package io.team05.btl.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String phone;
    String email;
    String dob;
    String avatar;
    String shop;
    Double discount;
    String role;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    Account account;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    Fullname fullname;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    Address address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seller", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Voucher> vouchers;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seller", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Product> products;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Cart> carts;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Order> orders;


}

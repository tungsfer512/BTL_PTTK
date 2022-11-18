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

    @OneToOne(mappedBy = "user")
    Account account;

    @OneToOne(mappedBy = "user")
    Fullname fullname;

    @OneToOne(mappedBy = "user")
    Address address;

    @OneToMany(mappedBy = "user")
    List<Voucher> vouchers;

    @OneToMany(mappedBy = "seller")
    List<Product> products;

    @OneToMany(mappedBy = "product")
    List<Cart> carts;

    @OneToMany(mappedBy = "customer")
    List<Order> orders;


}

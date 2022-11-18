package io.team05.btl.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    Integer quantity;
    Double price;
    String description;
    String status;

    @OneToMany(mappedBy = "product")
    List<ProductVoucher> productVouchers;

    @OneToMany(mappedBy = "product")
    List<ProductCategory> productCategories;

    @OneToMany(mappedBy = "product")
    List<Image> images;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    User seller;

    @OneToMany(mappedBy = "customer")
    List<Cart> carts;

}

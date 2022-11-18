package io.team05.btl.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "productcategory")
public class ProductCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;
}

package io.team05.btl.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "image")
public class Image implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String path;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

}

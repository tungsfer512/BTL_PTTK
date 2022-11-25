package io.team05.btl.Model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "my_product_voucher")
public class ProductVoucher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Product product;

    @ManyToOne
    @JoinColumn(name = "voucher_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Voucher voucher;

}

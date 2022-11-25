package io.team05.btl.Model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "my_voucher")
public class Voucher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double discount;
    Double minspent;
    String unit;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    User seller;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "voucher", cascade = CascadeType.ALL, orphanRemoval = true)
    List<ProductVoucher> productVouchers;

}

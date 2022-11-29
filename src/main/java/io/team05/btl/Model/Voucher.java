package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    Integer id;
    Double discount;
    Double minspent;
    String unit;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "seller_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    User seller;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "voucher", cascade = CascadeType.ALL, orphanRemoval = true)
    List<ProductVoucher> productVouchers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getMinspent() {
        return minspent;
    }

    public void setMinspent(Double minspent) {
        this.minspent = minspent;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public List<ProductVoucher> getProductVouchers() {
        return productVouchers;
    }

    public void setProductVouchers(List<ProductVoucher> productVouchers) {
        this.productVouchers = productVouchers;
    }

    public Voucher(Double discount, Double minspent, String unit, User seller, List<ProductVoucher> productVouchers) {
        this.discount = discount;
        this.minspent = minspent;
        this.unit = unit;
        this.seller = seller;
        this.productVouchers = productVouchers;
    }

    public Voucher() {
    }
}

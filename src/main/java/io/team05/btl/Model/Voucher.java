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
    @JsonManagedReference
    Integer id;
    @JsonManagedReference
    Double discount;
    @JsonManagedReference
    Double minspent;
    @JsonManagedReference
    String unit;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "seller_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    User seller;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "voucher", cascade = CascadeType.ALL, orphanRemoval = true)
    List<ProductVoucher> productVouchers;


    public Voucher() {
    }

    public Voucher( Double discount, Double minspent, String unit, User seller) {
        this.discount = discount;
        this.minspent = minspent;
        this.unit = unit;
        this.seller = seller;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getMinspent() {
        return this.minspent;
    }

    public void setMinspent(Double minspent) {
        this.minspent = minspent;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public User getSeller() {
        return this.seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public List<ProductVoucher> getProductVouchers() {
        return this.productVouchers;
    }

    public void setProductVouchers(List<ProductVoucher> productVouchers) {
        this.productVouchers = productVouchers;
    }

    public Voucher id(Integer id) {
        setId(id);
        return this;
    }

    public Voucher discount(Double discount) {
        setDiscount(discount);
        return this;
    }

    public Voucher minspent(Double minspent) {
        setMinspent(minspent);
        return this;
    }

    public Voucher unit(String unit) {
        setUnit(unit);
        return this;
    }

    public Voucher seller(User seller) {
        setSeller(seller);
        return this;
    }

    public Voucher productVouchers(List<ProductVoucher> productVouchers) {
        setProductVouchers(productVouchers);
        return this;
    }
}

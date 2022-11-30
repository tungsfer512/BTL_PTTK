package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "my_product_voucher")
public class ProductVoucher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "product_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Product product;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "voucher_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Voucher voucher;


    public ProductVoucher() {
    }

    public ProductVoucher( Product product, Voucher voucher) {
        this.product = product;
        this.voucher = voucher;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Voucher getVoucher() {
        return this.voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public ProductVoucher id(Integer id) {
        setId(id);
        return this;
    }

    public ProductVoucher product(Product product) {
        setProduct(product);
        return this;
    }

    public ProductVoucher voucher(Voucher voucher) {
        setVoucher(voucher);
        return this;
    }
}

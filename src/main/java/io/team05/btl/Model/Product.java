package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "my_product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;
    @JsonManagedReference
    String title;
    @JsonManagedReference
    Integer quantity;
    @JsonManagedReference
    Double price;
    @Column(columnDefinition = "TEXT")
    @JsonManagedReference
    String description;
    @JsonManagedReference
    String status;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    List<ProductVoucher> productVouchers;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    List<ProductCategory> productCategories;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Image> images;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    List<OrderDetail> orderdetails;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "seller_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Seller seller;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Cart> carts;
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Comment> comments;


    public Product() {
    }

    public Product( String title, Integer quantity, Double price, String description, String status, List<ProductCategory> productCategories, List<Image> images, Seller seller) {
        this.title = title;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.status = status;
        this.productCategories = productCategories;
        this.images = images;
        this.seller = seller;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ProductVoucher> getProductVouchers() {
        return this.productVouchers;
    }

    public void setProductVouchers(List<ProductVoucher> productVouchers) {
        this.productVouchers = productVouchers;
    }

    public List<ProductCategory> getProductCategories() {
        return this.productCategories;
    }

    public void setProductCategories(List<ProductCategory> productCategories) {
        this.productCategories = productCategories;
    }

    public List<Image> getImages() {
        return this.images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<OrderDetail> getOrderdetails() {
        return this.orderdetails;
    }

    public void setOrderdetails(List<OrderDetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    public Seller getSeller() {
        return this.seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<Cart> getCarts() {
        return this.carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Product id(Integer id) {
        setId(id);
        return this;
    }

    public Product title(String title) {
        setTitle(title);
        return this;
    }

    public Product quantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    public Product price(Double price) {
        setPrice(price);
        return this;
    }

    public Product description(String description) {
        setDescription(description);
        return this;
    }

    public Product status(String status) {
        setStatus(status);
        return this;
    }

    public Product productVouchers(List<ProductVoucher> productVouchers) {
        setProductVouchers(productVouchers);
        return this;
    }

    public Product productCategories(List<ProductCategory> productCategories) {
        setProductCategories(productCategories);
        return this;
    }

    public Product images(List<Image> images) {
        setImages(images);
        return this;
    }

    public Product orderdetails(List<OrderDetail> orderdetails) {
        setOrderdetails(orderdetails);
        return this;
    }

    public Product seller(Seller seller) {
        setSeller(seller);
        return this;
    }

    public Product carts(List<Cart> carts) {
        setCarts(carts);
        return this;
    }

    public Product comments(List<Comment> comments) {
        setComments(comments);
        return this;
    }
}

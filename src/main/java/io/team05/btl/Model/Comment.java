package io.team05.btl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "my_comment")
public class Comment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;

    @Column(columnDefinition = "TEXT")
    @JsonManagedReference
    String content;

    @JsonManagedReference
    Double rate;
    @JsonManagedReference
    String createdAt;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "customer_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Customer customer;

    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "product_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Product product;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "orderdetail_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    OrderDetail orderdetail;


    public Comment() {
    }

    public Comment(String content, Double rate, String createdAt, Customer customer, Product product, OrderDetail orderdetail) {
        this.content = content;
        this.rate = rate;
        this.createdAt = createdAt;
        this.customer = customer;
        this.product = product;
        this.orderdetail = orderdetail;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Double getRate() {
        return this.rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderDetail getOrderdetail() {
        return this.orderdetail;
    }

    public void setOrderdetail(OrderDetail orderdetail) {
        this.orderdetail = orderdetail;
    }

    public Comment id(Integer id) {
        setId(id);
        return this;
    }

    public Comment content(String content) {
        setContent(content);
        return this;
    }

    public Comment rate(Double rate) {
        setRate(rate);
        return this;
    }

    public Comment createdAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    public Comment customer(Customer customer) {
        setCustomer(customer);
        return this;
    }

    public Comment product(Product product) {
        setProduct(product);
        return this;
    }

    public Comment orderdetail(OrderDetail orderdetail) {
        setOrderdetail(orderdetail);
        return this;
    }

}

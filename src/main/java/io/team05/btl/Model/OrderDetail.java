package io.team05.btl.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "my_orderdetail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;
    
    @JsonManagedReference
    Integer quantity;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "orderdetail", cascade = CascadeType.ALL, orphanRemoval = true)
    Comment comment;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "order_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Order order;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "product_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Product product;


    public OrderDetail() {
    }

    public OrderDetail(Integer quantity, Order order, Product product) {
        this.quantity = quantity;
        this.order = order;
        this.product = product;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Comment getComment() {
        return this.comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderDetail id(Integer id) {
        setId(id);
        return this;
    }

    public OrderDetail quantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    public OrderDetail comment(Comment comment) {
        setComment(comment);
        return this;
    }

    public OrderDetail order(Order order) {
        setOrder(order);
        return this;
    }

    public OrderDetail product(Product product) {
        setProduct(product);
        return this;
    }
}

package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "my_cart")
public class Cart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;
    @JsonManagedReference
    Integer quantity;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "customer_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Customer customer;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "product_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Product product;


    public Cart() {
    }

    public Cart(Integer quantity, Customer customer, Product product) {
        this.quantity = quantity;
        this.customer = customer;
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

    public Cart id(Integer id) {
        setId(id);
        return this;
    }

    public Cart quantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    public Cart customer(Customer customer) {
        setCustomer(customer);
        return this;
    }

    public Cart product(Product product) {
        setProduct(product);
        return this;
    }
}


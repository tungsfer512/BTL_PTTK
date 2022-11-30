package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "my_order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;
    @JsonManagedReference
    Double amount;
    @JsonManagedReference
    String status;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "customer_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Customer customer;

    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "payment_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Payment payment;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    List<OrderDetail> orderdetails;


    public Order() {
    }

    public Order(Double amount, String status, Customer customer, Payment payment) {
        this.amount = amount;
        this.status = status;
        this.customer = customer;
        this.payment = payment;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return this.payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<OrderDetail> getOrderdetails() {
        return this.orderdetails;
    }

    public void setOrderdetails(List<OrderDetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    public Order id(Integer id) {
        setId(id);
        return this;
    }

    public Order amount(Double amount) {
        setAmount(amount);
        return this;
    }

    public Order status(String status) {
        setStatus(status);
        return this;
    }

    public Order customer(Customer customer) {
        setCustomer(customer);
        return this;
    }

    public Order payment(Payment payment) {
        setPayment(payment);
        return this;
    }

    public Order orderdetails(List<OrderDetail> orderdetails) {
        setOrderdetails(orderdetails);
        return this;
    }
    
}

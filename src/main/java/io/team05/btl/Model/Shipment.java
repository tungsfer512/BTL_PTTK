package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "my_shipment")
public class Shipment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;
    @Column(columnDefinition = "TEXT")
    @JsonManagedReference
    String note;
    @JsonManagedReference
    Double cost;
    @JsonManagedReference
    String method;
    @JsonManagedReference
    String address;

    @JsonBackReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "shipment", cascade = CascadeType.ALL, orphanRemoval = true)
    Payment payment;


    public Shipment() {
    }

    public Shipment(String note, Double cost, String method, String address) {
        this.note = note;
        this.cost = cost;
        this.method = method;
        this.address = address;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Payment getPayment() {
        return this.payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Shipment id(Integer id) {
        setId(id);
        return this;
    }

    public Shipment note(String note) {
        setNote(note);
        return this;
    }

    public Shipment cost(Double cost) {
        setCost(cost);
        return this;
    }

    public Shipment method(String method) {
        setMethod(method);
        return this;
    }

    public Shipment address(String address) {
        setAddress(address);
        return this;
    }

    public Shipment payment(Payment payment) {
        setPayment(payment);
        return this;
    }
}

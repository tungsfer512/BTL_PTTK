package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "my_payment")
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;
    @JsonManagedReference
    Double amount;
    @JsonManagedReference
    String card;
    @JsonManagedReference
    String cvv;
    @JsonManagedReference
    String method;

    @JsonBackReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "payment", cascade = CascadeType.ALL, orphanRemoval = true)
    Order order;

    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "shipment_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Shipment shipment;


    public Payment() {
    }

    public Payment(Double amount, String card, String cvv, String method, Shipment shipment) {
        this.amount = amount;
        this.card = card;
        this.cvv = cvv;
        this.method = method;
        this.shipment = shipment;
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

    public String getCard() {
        return this.card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCvv() {
        return this.cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Shipment getShipment() {
        return this.shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Payment id(Integer id) {
        setId(id);
        return this;
    }

    public Payment amount(Double amount) {
        setAmount(amount);
        return this;
    }

    public Payment card(String card) {
        setCard(card);
        return this;
    }

    public Payment cvv(String cvv) {
        setCvv(cvv);
        return this;
    }

    public Payment method(String method) {
        setMethod(method);
        return this;
    }

    public Payment order(Order order) {
        setOrder(order);
        return this;
    }

    public Payment shipment(Shipment shipment) {
        setShipment(shipment);
        return this;
    }
    
}

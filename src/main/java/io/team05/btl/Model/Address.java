package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "my_address")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;
    @JsonManagedReference
    String street;
    @JsonManagedReference
    String town;
    @JsonManagedReference
    String district;
    @JsonManagedReference
    String city;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    User user;


    public Address() {
    }

    public Address( String street, String town, String district, String city, User user) {
        this.street = street;
        this.town = town;
        this.district = district;
        this.city = city;
        this.user = user;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address id(Integer id) {
        setId(id);
        return this;
    }

    public Address street(String street) {
        setStreet(street);
        return this;
    }

    public Address town(String town) {
        setTown(town);
        return this;
    }

    public Address district(String district) {
        setDistrict(district);
        return this;
    }

    public Address city(String city) {
        setCity(city);
        return this;
    }

    public Address user(User user) {
        setUser(user);
        return this;
    }
    
}

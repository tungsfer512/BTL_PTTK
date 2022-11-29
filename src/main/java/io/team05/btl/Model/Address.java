package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "my_address")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String street;
    String town;
    String district;
    String city;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    User user;

    public Address() {
    }

    public Address(String street, String town, String district, String city, User user) {
        this.street = street;
        this.town = town;
        this.district = district;
        this.city = city;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

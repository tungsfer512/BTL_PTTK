package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "my_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;
    @JsonManagedReference
    String phone;
    @JsonManagedReference
    String email;
    @JsonManagedReference
    String dob;
    @JsonManagedReference
    String image;
    @JsonManagedReference
    String role;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "account_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Account account;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "fullname_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Fullname fullname;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "address_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    Address address;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    Admin admin;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    Seller seller;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    Customer customer;


    public User() {
    }

    public User(String phone, String email, String dob, String image, String role) {
        this.phone = phone;
        this.email = email;
        this.dob = dob;
        this.image = image;
        this.role = role;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Fullname getFullname() {
        return this.fullname;
    }

    public void setFullname(Fullname fullname) {
        this.fullname = fullname;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Admin getAdmin() {
        return this.admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Seller getSeller() {
        return this.seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public User id(Integer id) {
        setId(id);
        return this;
    }

    public User phone(String phone) {
        setPhone(phone);
        return this;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }

    public User dob(String dob) {
        setDob(dob);
        return this;
    }

    public User image(String image) {
        setImage(image);
        return this;
    }

    public User role(String role) {
        setRole(role);
        return this;
    }

    public User account(Account account) {
        setAccount(account);
        return this;
    }

    public User fullname(Fullname fullname) {
        setFullname(fullname);
        return this;
    }

    public User address(Address address) {
        setAddress(address);
        return this;
    }

    public User admin(Admin admin) {
        setAdmin(admin);
        return this;
    }

    public User seller(Seller seller) {
        setSeller(seller);
        return this;
    }

    public User customer(Customer customer) {
        setCustomer(customer);
        return this;
    }

}

package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "my_account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;
    @JsonManagedReference
    String username;
    @JsonManagedReference
    String password;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    User user;


    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Account(String username, String password, User user) {
        this.username = username;
        this.password = password;
        this.user = user;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Account id(Integer id) {
        setId(id);
        return this;
    }

    public Account username(String username) {
        setUsername(username);
        return this;
    }

    public Account password(String password) {
        setPassword(password);
        return this;
    }

    public Account user(User user) {
        setUser(user);
        return this;
    }

}

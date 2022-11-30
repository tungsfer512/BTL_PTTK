package io.team05.btl.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "my_fullname")
public class Fullname implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    Integer id;
    @JsonManagedReference
    String firstname;
    @JsonManagedReference
    String lastname;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "fullname", cascade = CascadeType.ALL, orphanRemoval = true)
    User user;


    public Fullname() {
    }

    public Fullname( String firstname, String lastname, User user) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.user = user;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Fullname id(Integer id) {
        setId(id);
        return this;
    }

    public Fullname firstname(String firstname) {
        setFirstname(firstname);
        return this;
    }

    public Fullname lastname(String lastname) {
        setLastname(lastname);
        return this;
    }

    public Fullname user(User user) {
        setUser(user);
        return this;
    }
}

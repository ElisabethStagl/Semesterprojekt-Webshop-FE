package com.webshop.demo.model;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class User {

    @Positive
    @Id //gibt Primärschlüssel an
    @GeneratedValue //id wird automatisch von DB generiert
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "sex")
    private String sex;

    @NotBlank
    @Length (max = 100)
    @Column(name = "firstName")
    private String firstName;

    @NotBlank
    @Length (max = 200)
    @Column(name = "lastName")
    private String lastName;

    @NotBlank
    @Column(name = "address")
    private String address;

    @NotBlank
    @Column(name = "doornumber")
    private String doornumber;

    @NotBlank
    @Column(name = "postalCode")
    private String postalCode;

    @NotBlank
    @Column(name = "city")
    private String city;

    @NotBlank
    @Column(name = "email", unique = true)
    private String email;

    @NotBlank
    @Column(name = "username")
    private String username;

    @JsonIgnore
    @NotBlank
    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    // CONSTRUCTOR

    public User() {
    }



    public User(String sex, String firstName, String lastName, String address, String doornumber, String postalCode, String city, String email, String username, String password) {
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.doornumber = doornumber;
        this.postalCode = postalCode;
        this.city = city;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    
    

    // GETTERS & SETTERS


    public Long getId() {
        return this.id;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoornumber() {
        return this.doornumber;
    }

    public void setDoornumber(String doornumber) {
        this.doornumber = doornumber;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

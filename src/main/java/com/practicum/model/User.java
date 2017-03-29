package com.practicum.model;

import javax.persistence.*;

/**
 * Created by mehdi on 3/28/17.
 */
@Entity
@Table(name="userssss")
public class User {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String username;
    @Column
    private String firstName;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private int age;



    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

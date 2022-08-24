package com.example.androidproject.Model;

import javax.persistence.*;

@Entity(name = "Member")
public class Member {
//@Column(unique = true)
//@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(unique = true)
    private long id;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
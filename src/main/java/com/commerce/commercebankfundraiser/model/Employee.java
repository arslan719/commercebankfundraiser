package com.commerce.commercebankfundraiser.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String title;



    public Employee() {}

    public Employee(String name,String email,String title)
    {
        this.name = name;
        this.email = email;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Employee{" + "id = " + id +
                ", name '" + name + '\'' +
                ", email '" + email + '\'' +
                ", title '" + title + '\'' +
                '}';

    }
}

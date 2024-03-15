package com.study.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


import java.io.Serializable;

@Entity
@Table(name = "user")
@SequenceGenerator(sequenceName = "sdf", name = "", initialValue = 1, allocationSize = 1)
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "sdf", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    public User() {
    }

    public User(final String name) {
        this.name = name;
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
}

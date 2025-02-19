package com.spring.smartcontactmanager.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private boolean enabled;
    private String imageUrl;
    @Column(length = 300)
    private String about;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")
    private List<Contact> contacts = new ArrayList();

    public User() {
    }

    public User(int id, String name, String email, String password, boolean enabled, String imageUrl, String about, List<Contact> contacts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.imageUrl = imageUrl;
        this.about = about;
        this.contacts=contacts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    
}

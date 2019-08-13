package com.musiclab.model;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

public class Users {
    @Id
    private String id;
    @Size(max = 40)
    private String name;
    @Size(max = 15)
    public String username;
    @Size(max = 100)
    public String password;

//    private RoleName role;
    private Set<Roles> roles = new HashSet();

    public Users(){
    }

    public Users(String name, String username, String password){
        this.name = name;
        this.password = password;
        this.username = username;
    }

//    public String get_id() { return this._id.toHexString(); }
//    public void set_id(ObjectId _id) { this._id = _id; }
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Set<Roles> getRoles() { return roles; }
    public void setRole(Set<Roles> roles) { this.roles = roles; }
}
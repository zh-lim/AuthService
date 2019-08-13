package com.musiclab.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

@Document(collection = "roles")
public class Roles {
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String role;

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}

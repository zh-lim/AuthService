package com.musiclab.payload;

import javax.validation.constraints.*;

public class SignUpRequest {
    @Size(min = 4, max = 40)
    private String name;

    @Size(min = 3, max = 15)
    private String username;

    @Size(min = 6, max = 20)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
}

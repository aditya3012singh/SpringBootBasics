package com.example.demo.dto;

public class RegisterRequestDto {
    private String email;
    private String password;
    private String name;
    public RegisterRequestDto(){};

    public String getPassword(){
        return password;
    }

    public String getEmail(){
        return email;
    }

    public String getName(){
        return name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}

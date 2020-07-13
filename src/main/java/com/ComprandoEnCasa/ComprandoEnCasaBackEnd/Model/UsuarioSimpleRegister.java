package com.ComprandoEnCasa.ComprandoEnCasaBackEnd.Model;

public class UsuarioSimpleRegister {

    private String username;
    private String email;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UsuarioSimpleRegister(String username, String email, String address) {
        this.username = username;
        this.email = email;
        this.address = address;
    }
}

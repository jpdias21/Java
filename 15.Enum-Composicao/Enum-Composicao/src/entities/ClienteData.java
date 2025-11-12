package entities;

import entities.enums.StatusPedido;

public class ClienteData {
   private String name;
   private String surName;
   private String email;
   private StatusPedido StatusPedido;

    public ClienteData(String name, String surName, String email, StatusPedido statusPedido) {
        this.name = name;
        this.email = email;
        StatusPedido = statusPedido;
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusPedido getStatusPedido() {
        return StatusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        StatusPedido = statusPedido;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "ClienteData{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", StatusPedido=" + StatusPedido.getStatus() +
                '}';
    }
}


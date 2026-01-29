package model.PaymentClient;

public class Client {
    private String name;
    private String surName;
    private String email;

    public Client(String email, String name, String surName) {
        this.email = email;
        this.name = name;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}

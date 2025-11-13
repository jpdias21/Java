package model.entities;

import java.time.LocalDate;


public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;

    public Client(String name,String email, LocalDate birthDate ) {
        this.birthDate = birthDate;
        this.email = email;
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
}

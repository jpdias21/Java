package dataBase.model;

import exceptions.DomainException;

public class User {

  protected  String name;
  protected  String email;
  protected  Integer age;

    public User(String name, String email, Integer age) {
        if(age < 18){
            throw new DomainException("Under 18 years of age ");
        }
        this.name = name;
        this.email = email;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

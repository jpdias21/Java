package dataBase.models;

public abstract class Animal {

    protected String name;
    protected Integer age;
    protected Double weight;

    public Animal() {
    }

    public Animal(String name, Integer age, Double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public abstract void comer(
    );

    public abstract void dormir();

    public abstract void emitiSom();





}

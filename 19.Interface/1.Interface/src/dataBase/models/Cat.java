package dataBase.models;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, Integer age, Double weight) {
        super(name, age, weight);
    }

    @Override
    public void comer() {
        System.out.println("Gato come racao");
    }

    @Override
    public void dormir() {
        System.out.println("Gato dormi 12 horas");
    }

    @Override
    public void emitiSom() {
        System.out.println("mIAU MIAU");
    }
}

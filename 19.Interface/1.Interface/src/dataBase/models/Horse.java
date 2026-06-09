package dataBase.models;

public class Horse extends Animal implements Adestravel, Nadador{

    public Horse() {
    }

    public Horse(String name, Integer age, Double weight) {
        super(name, age, weight);
    }

    @Override
    public void comer() {
        System.out.println("cavalo come capim e feno ");

    }

    @Override
    public void dormir() {
        System.out.println("Cavalo dormi 10 horas");
    }

    @Override
    public void emitiSom() {
        System.out.println("iirrrrí");
    }

    @Override
    public void adestrador() {
        System.out.println("Cavalo possivel adestrado");
    }

    @Override
    public void nadar() {
        System.out.println("cavalo possivel nadar");
    }
}

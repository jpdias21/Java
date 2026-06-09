package dataBase.models;

public class Dog extends  Animal implements  Adestravel, Nadador{
    public Dog(String name, Integer age, Double weight) {
        super(name, age, weight);
    }

    @Override
    public void comer() {
        System.out.println("come racao");
    }

    @Override
    public void dormir() {
        System.out.println("Cachorro dorme 12 horas");

    }

    @Override
    public void emitiSom() {
        System.out.println("Au,au");

    }

    @Override
    public void adestrador() {
        System.out.println("Cachhoro possivelmento adestrado");

    }

    @Override
    public void nadar() {
        System.out.println("cachorro consegue nadar");
    }
}

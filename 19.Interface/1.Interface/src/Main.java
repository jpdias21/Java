import dataBase.models.Cat;
import dataBase.models.Dog;
import dataBase.models.Horse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Dog dog = new Dog("Cachorro", 12, 32.00);
        Cat cat = new Cat("Gato", 9 , 10.00);
        Horse horse = new Horse("Cavalo", 22, 300.00);

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());
        dog.emitiSom();
        dog.comer();
        dog.dormir();
        dog.nadar();
        dog.adestrador();
        System.out.println("--------------");

        System.out.println(horse.getName());
        System.out.println(horse.getAge());
        System.out.println(horse.getWeight());
        horse.emitiSom();
        horse.comer();
        horse.dormir();
        horse.nadar();
        horse.adestrador();
        System.out.println("--------------");

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());
        cat.emitiSom();
        cat.comer();
        cat.dormir();
        System.out.println("--------------");


    }
}
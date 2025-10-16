package application;
import entities.Triangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     Triangle x, y;
     x = new Triangle();
     y = new Triangle();

        System.out.println("Digite as 3 areas do triangula A: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Agora digite as 3 areas do triangulo B:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();



        System.out.printf("triangulo A area: %.4f\n", x.area());//

        System.out.printf("triangulo B area: %.4f\n", y.area());
        if (x.area() > y.area()) {
            System.out.println("a area maior e o triangulo A");
        } else {
            System.out.println("a area maior e o triangulo B");
        }

        sc.close();

    }
}
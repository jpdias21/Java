package application;
import java.util.Scanner;
import utils.Calculator;

public class Main {
//    public static double PI = 3.1415;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radios: ");

        double radio = sc.nextDouble();
        double c = Calculator.circumference(radio);
        double v = Calculator.volume(radio);
//        double c = circumference(radio);
//        double v = volume(radio);

        System.out.println("Circuference : " + c);
        System.out.println("volume : " + v);
        System.out.println("Number PI: " + Calculator.Pi);
        sc.close();
    }
//    public static double circumference(double radio){
//        return 2.0 * PI * radio;
//    }
//    public static double volume(double radio){
//        return 4.0 * PI * radio * radio * radio / 3.0;
//    }
}
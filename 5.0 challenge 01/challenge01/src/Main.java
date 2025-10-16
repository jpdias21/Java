import entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle r;
        r = new Rectangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height : ");
        r.width = sc.nextDouble();
        r.height = sc.nextDouble();

        System.out.println("Area : " + r.Area());
        System.out.println("Parameter :" + r.Parameter());
        System.out.println("Diagonal : " + r.Diagonal());


        sc.close();
    }
}
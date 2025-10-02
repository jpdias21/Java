package application;
import entities.Student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student e;
        e = new Student();

        Scanner sc = new Scanner(System.in);

        System.out.println("coloque a nota do seu primeiro trimestre : ");
        e.noteOne = sc.nextDouble();

        System.out.println("coloque a nota do seu segundo trimestre : ");
        e.noteTwo = sc.nextDouble();

        System.out.println("coloque a nota do seu terceiro trimestre : ");
        e.noteThree = sc.nextDouble();

        System.out.println(e.toMensagem());
        sc.close();
    }
}
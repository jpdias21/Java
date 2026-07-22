import dataBase.model.PrintService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        PrintService printService;

        List<Integer> listNumber = new ArrayList<>();
        List<String> listString = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();

        for(int i = 0; i < number; i++){
            System.out.println("enter number");
            int numberList = sc.nextInt();
            listNumber.add(numberList);
        }

        for(int i = 0; i < number; i++){
            System.out.println("enter String");
            String stringList = sc.next();
            listString.add(stringList);
        }

        printService = new PrintService(listString);
        printService.first();
        printService.print();
        printService.somar();
        printService.count();
        printService.last();
        System.out.println("=============");
        printService = new PrintService(listNumber);
        printService.first();
        printService.print();
        printService.somar();
        printService.count();
        printService.last();



        sc.close();




    }
}

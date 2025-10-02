package application;

import entities.Negatives;
import entities.VectorSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("quantos numeros voce vai digitar ?");
//        int n = sc.nextInt();
//        Negatives[] negative = new Negatives[n];
//
//       for(int i = 0 ; i < n; i++){
//           sc.nextLine();
//           int number = sc.nextInt();
//             if(number < 0){
//                 negative[i] = new Negatives(number);
//             }
//       }

//       System.out.println("Number negatives :");

//       for(int i = 0; i < n; i++){
//           if(negative[i] != null){
//               System.out.println(negative[i].getNumber());
//           }
//       }
//       sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar : ");
        int number  = sc.nextInt();

        VectorSum[] add = new VectorSum[number];

        for(int i = 0; i < number; i++){
            sc.nextLine();
            double addNumber = sc.nextDouble();
            add[i] = new VectorSum(addNumber);
        }

        for(int i = 0 ; i < number; i++){
            System.out.println("Valores: " + add[i].getSomar());
        }
        double somar = 0.0;

        for(int i = 0; i < number; i++){
            somar += add[i].getSomar();
        }
        System.out.println("Soma: " + somar);
        System.out.println("Media: " +  somar / number);
        sc.close();
    }
}
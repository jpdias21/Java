package application;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0 ; i < n; i++ ){
            vect[i] = sc.nextDouble();
        }

        double calculation = (vect[0] + vect[1] + vect[2]) / 3 ;

        System.out.println("result: " + calculation);

        double[] vetor = new double[6];


        sc.close();
    }
}
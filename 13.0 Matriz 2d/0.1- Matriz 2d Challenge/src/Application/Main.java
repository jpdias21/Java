package Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero de quadrantes que voce deseja : ");
        int n = sc.nextInt();

        int y, z;
        int matrizes [][] = new int [n][n];
        for(int i = 0 ; i< n ; i++){
            sc.nextLine();
            for(int j = 0 ; j < n ; j++){
                System.out.println("Digite o numero na linha" + i + "na coluna" + j + ": ");
                matrizes[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < n; j++){
                System.out.print("[" + matrizes[i][j] + "]");
            }
            System.out.print("\n");
        }


        System.out.println("Numeros diagonal: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(matrizes[i][i] + " ");
       }

        int negative = 0;
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrizes[i][j] < 0){
                    negative++;
                }
            }
        }
        System.out.println("numeros negativos:" +  negative);

       sc.close();
    }
}
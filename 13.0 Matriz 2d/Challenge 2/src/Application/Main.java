package Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite da linha : ");
        int linha = sc.nextInt();

        System.out.println("Digite na coluna : ");
        int coluna = sc.nextInt();

        int matriz [][] = new int[linha][coluna];
        for(int li = 0 ; li < matriz.length ; li++){
            for(int co = 0 ; co < matriz[li].length ; co++){
                System.out.println("Digite da linha " + li + " da coluna " + co + " :");
                int number = sc.nextInt();
                matriz[li][co] = number;
            }
        }

        System.out.println("Digite o numero que voce quer achar : ");
        int position = sc.nextInt();

        boolean achou = false;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0 ; j < matriz[i].length; j++ ){
                if(matriz[i][j] == position){
                    System.out.println("Posicao: "+  i + ", " + j);

                    System.out.println("Encima : " + matriz[(i-1)][(j)] );
                    System.out.println("Ao lado (erquerdo): " + matriz[i][(j -1)]);
                    System.out.println("Ao lado (direito) " + matriz[i][(j+1)]);
                    System.out.println("Abaixo " + matriz[(i+1)][j]);
                    achou = true;
                }
            }
            if(!achou){
                System.out.println("Nao tem nenhum numero  na matriz");
            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0 ; j < matriz[i].length; j++ ){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
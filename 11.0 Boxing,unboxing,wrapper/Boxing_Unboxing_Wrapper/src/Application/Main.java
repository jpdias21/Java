package Application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Notas;

import static entities.Notas.mediaNotas;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas voce ira digitar : ");
        int n = sc.nextInt();

        ArrayList<String> nomes = new ArrayList<>(n);
        ArrayList<Double> notas = new  ArrayList<>(n);
        for(int i = 0; i < n ; i++){
            sc.nextLine();
            System.out.println("Digite a nota do aluno " + (i+1) + " :");
             double notaAluno = sc.nextDouble();
                notas.add(notaAluno);
        }

        double mediaNotas = mediaNotas(notas);
        
        sc.close();
    }
}
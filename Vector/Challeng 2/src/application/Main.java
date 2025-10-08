package application;

import entities.*;

import java.util.ArrayList;
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

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Quantos numeros voce vai digitar : ");
//        int number  = sc.nextInt();
//
//        VectorSum[] add = new VectorSum[number];
//
//        for(int i = 0; i < number; i++){
//            sc.nextLine();
//            double addNumber = sc.nextDouble();
//            add[i] = new VectorSum(addNumber);
//        }
//
//        for(int i = 0 ; i < number; i++){
//            System.out.println("Valores: " + add[i].getSomar());
//        }
//        double somar = 0.0;
//
//        for(int i = 0; i < number; i++){
//            somar += add[i].getSomar();
//        }
//        System.out.println("Soma: " + somar);
//        System.out.println("Media: " +  somar / number);
//        sc.close();


//       Scanner sc = new Scanner(System.in);
//       System.out.println("Quanta pessoas voce vai digitar: ");
//       int n = sc.nextInt();

//       OlderPerson[] person = new OlderPerson[n];
//       for(int i = 0; i < n ; i++){
//           sc.nextLine();
//           System.out.println("Dados da " + (i + 1) + "pessoa: ");
//           String name = sc.next();
//           int age = sc.nextInt();
//           person[i] = new OlderPerson(name, age);
//       }

//       OlderPerson oldest = person[0];
//       for(OlderPerson p : person){

//           if(p.getAge() > oldest.getAge()){
//               oldest = p ;
//           }
//       }
//       System.out.println("A pessoa mais velha: " + oldest.getName() + " " +  oldest.getAge() );

//       sc.close();


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Quantos alunos seram digitados : ");
//        int n = sc.nextInt();
//
//        AprovedGrades[] aprove = new AprovedGrades[n];
//
//        for(int i = 0; i < n; i++){
//            sc.nextLine();
//            System.out.println("Digite o nome do " + (i+1) + "aluno :");
//            String name = sc.next();
//            double firstSemester = sc.nextDouble();
//            double secondSemester = sc.nextDouble();
//
//            aprove[i] = new AprovedGrades(name, firstSemester, secondSemester);
//        }
//
//
//        ArrayList<String> personAproves = new ArrayList<>();
//
//        for (int i = 0; i < n; i++){
//           if((aprove[i].getFirstSemester() + aprove[i].getSecondSemester() / 2) >= 6.0){
//               personAproves.add(aprove[i].getName());
//           }
//        }
//
//        System.out.println("Alunos aprovados : " + personAproves);
//
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Quantos pessoas seram digitados : ");
//        int n = sc.nextInt();
//
//        HeightPerson [] personHeight = new HeightPerson[n];
//
//        for(int i = 0; i < n; i++){
//            sc.nextLine();
//            System.out.println("Digite os dados da" + (i+1) + "pessoa :");
//            String name = sc.next();
//            int age = sc.nextInt();
//            double height = sc.nextDouble();
//
//            personHeight[i] = new HeightPerson(name, age, height);
//        }
//        double sumHeigth = 0.0 ;
//        for(int i = 0 ; i < n; i++){
//           sumHeigth += personHeight[i].getHeight();
//        }
//        sumHeigth = sumHeigth / personHeight.length;
//
//        ArrayList<Integer> personMor = new ArrayList<>();
//        ArrayList<String> stringPeaplo = new ArrayList<>();
//        for(int i = 0 ; i < personHeight.length ; i++){
//            if(personHeight[i].getAge() < 16){
//                personMor.add(personHeight[i].getAge());
//
//            }
//            if(personHeight[i].getAge() > 16){
//                stringPeaplo.add(personHeight[i].getName());
//            }
//        }
//        double calculeMor16 = (double) personMor.size() / personHeight.length * 100;
//
//
//        System.out.println("A media das pessoas: " + sumHeigth);
//        System.out.println("Pessoa com menos de 16: " + calculeMor16);
//        System.out.println("Pessoas : " + stringPeaplo);
//
//
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Quantos numeros voce ira digitar: ");
//        int n = sc.nextInt();
//
//        AvenNumbers [] avenNumbers = new AvenNumbers[n];
//        int poss = 0;
//        for(int i = 0 ; i < n; i++){
//            sc.nextLine();
//            System.out.println("Digite um numero");
//            int number = sc.nextInt();
//            if(number % 2 == 0){
//                avenNumbers[poss] = new AvenNumbers(number);
//                poss++;
//            }
//        }
//        System.out.println("numeros pares: ");
//       for(int i = 0 ; i < poss; i++){
//           System.out.println(avenNumbers[i].getNumber());
//       }
//        System.out.println("Quantidade de pares : " + poss);
//        sc.close();


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Quantos numeros voce ira digitar : ");
//        int n = sc.nextInt();
//
//        HighestPosition[] highestPosition = new HighestPosition[n];
//
//        for(int i = 0; i < n; i++ ){
//            System.out.println("Digite um numero : ");
//            double number = sc.nextDouble();
//
//            highestPosition[i] = new HighestPosition(number);
//        }
//        HighestPosition maior = HighestPosition.finMax(highestPosition);
//        System.out.println("Maior número: " + maior.getNumber());
//
//
//        sc.close();


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor :");
        int n = sc.nextInt();
        SumVectors sumVectors = new SumVectors(n);

        for(int i = 0; i < n ; i++ ){
            System.out.println("Digite o valor do vetor A, posicao " + n  +" :");
            int vectorOne = sc.nextInt();
            sumVectors = new SumVectors(vectorOne);

        }

        sc.close();


    }

}
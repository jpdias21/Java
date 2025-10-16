package application;

import entities.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;


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


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Quantos valores vai ter cada vetor :");
//        int n = sc.nextInt();
//        int[] numberOne = new int[n];
//        int [] numberTwo = new int [n];
//
//        SumVectors sumVectors = new SumVectors(numberOne, numberTwo);
//
//        for(int i = 0; i < n ; i++ ){
//            System.out.println("Digite o valor do vetor A, posicao " + i+1  +" :");
//            int vectorOne = sc.nextInt();
//            numberOne[i] = vectorOne ;
//        }
//
//        for(int i = 0; i < n ; i++ ){
//            System.out.println("Digite o valor do vetor B, posicao " + i+1  +" :");
//            int vectorTwo = sc.nextInt();
//            numberTwo[i] = vectorTwo;
//        }
//
//        sumVectors = new SumVectors(numberOne, numberTwo);
//
//        System.out.println("resultado: " + Arrays.toString(sumVectors.Somar()));
//        System.out.println(Arrays.toString(sumVectors.getVectorOne()));
//        System.out.println(Arrays.toString(sumVectors.getVectorTwo()));
//        sc.close();
//
//

//       Scanner sc = new Scanner(System.in);

//       System.out.println("Quantos elementos vai ter o vetor: ");

//       int n = sc.nextInt();
//       AbaixoDaMedia[] abaixoDaMedia = new AbaixoDaMedia[n];

//       for (int i = 0 ; i < n ; i++){
//           sc.nextLine();
//           System.out.println("Digite um numero:");
//           double number = sc.nextDouble();

//           abaixoDaMedia[i] = new AbaixoDaMedia(number);
//       }

//       double calculation = abaixoDaMedia[0].Calculation(abaixoDaMedia);

//       System.out.println("media do vetor " +  calculation);

//       Vector<Double> abaixo = AbaixoDaMedia.MediaVector(calculation, abaixoDaMedia);
//       System.out.println("Elementos abaixo da media : " + abaixo);


//       sc.close();

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Quantos elementos vai ter o vetor:");
//        int n = sc.nextInt();
//        MediaPares[] mediaPares = new MediaPares[n];
//
//        for(int i = 0 ; i < n ; i++){
//            sc.nextLine();
//            System.out.println("Digite um numero: ");
//            double number = sc.nextDouble();
//            mediaPares[i] = new MediaPares(number);
//
//        }
//        double calculo = mediaPares[0].Somar(mediaPares);
//        System.out.println("Media dos pares : " + calculo);
//
//        double NumPar = mediaPares[0].MediaMediaPar(mediaPares);
//        if(NumPar == 0){
//            System.out.println("Nunhum par");
//        }
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Quantas pessoa voce vai digitar: ");
//        int n = sc.nextInt();
//        Mais_Velho[] maisVelhos = new Mais_Velho[n];
//
//        for(int i = 0 ; i < n ; i++){
//            sc.nextLine();
//            System.out.println("Dados da pessoa "+ i+1 + ": "  );
//
//            System.out.println("Nome:");
//            String name = sc.next();
//
//            System.out.println("Idade: ");
//            int age = sc.nextInt();
//
//            maisVelhos[i] = new Mais_Velho(name, age);
//        }
//
//        Mais_Velho maisVelha = maisVelhos[0].CalMaisVelho(maisVelhos);
//
//        System.out.println("O mais velho: " + maisVelha.getName());
//        sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alinos serao digitados : ");
        int n = sc.nextInt();

        Aprovados[] aprovados = new Aprovados[n];

        for(int i =0; i < n ; i++){
            System.out.println("Digite nome, primeira e sugunda nota  do aluno:");
            String name = sc.next();
            double notaOne = sc.nextDouble();
            double notaTwo = sc.nextDouble();

            aprovados[i] = new Aprovados(name, notaOne, notaTwo);
        }


        double[] alunosAprovado = aprovados[0].AlunosAprovados(aprovados);
        sc.close();

    }

}
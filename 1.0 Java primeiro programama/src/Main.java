import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Ola mundo no Java");
        ///  string
//        String name = "Joao Pedro";
//        //Number
//        int dia = 4;
//        int idade = 18;
//
//        if(idade <= 20){
//            System.out.println("Voce tem menos de 20 anos, voce tem " + idade);
//        }else{
//            System.out.println("Voce tem mais de 20 anos voce tem " + idade);
//        }
//
//        boolean eUmBoolean = true ;
//           if(!eUmBoolean){
//               System.out.println("Aqui e um Falo");
//           }else{
//               System.out.println("aqui e um verdadeiro");
//           }
//
//        switch (dia) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3 :
//                System.out.println("Terça feira ");
//            default:
//                System.out.println("Nao tem este dia senhor " + name);
//        }

//        int[] numeros = {0,1,2,3,4,5,6,7,8,9};
//        String[] string = {"Joao", "Pedro", "Dias"};
//        System.out.println(numeros[0]);
//        System.out.println(string[1]);//

//        for (int i = 0 ; i <= 10; i++){
//            System.out.println("Contamos em " + i);
//        };

//        int number = 0 ;

//        while(number <= 10){
//            System.out.println("estamos no while e o numero agora e " + number);
//            number++;
//        }

//        do {
//            System.out.println("Estou no Do while " + number);
//            number++ ;
//        }while(number <= 5);

//        int inteiro = 100 ;
//        double decimal = inteiro;
//        System.out.println("Valor interio para deciamal "+ decimal);
//
//        double decimalOvalor = 100.00;
//        int valorInteiro =(int)  decimalOvalor;
//        System.out.println("Valor decimal para inteiro "+ valorInteiro);
///
//                String nome = "Joao";
//        int idade = 20 ;
//        double cortador = 10.2323;
//
//        System.out.printf("%s tem %d anos de idade e ganha R$ $ %.2f reais%n", nome, idade, cortador);

        //       Scanner sc = new Scanner(System.in);

//       String name;
//       int number;
//       double z ;
//       name = sc.next();
//       number = sc.nextInt();
//       z = sc.nextDouble();
//       System.out.println("voce digitou o valor: ");
//       System.out.println(name);
//       System.out.println(number);
//       System.out.println(z);
//       sc.close();
//        int x ;
//        String s1,s2,s3 ;
//        x = sc.nextInt();
//        s1 = sc.next();
//        s2 = sc.next();
//        s3 = sc.next();
//
//        System.out.println("Dados que voce digitou :");
//        System.out.println(x);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        sc.close();

        Scanner sc = new Scanner(System.in);
 //       int entrada1, entrada2, entrada3, entrada4, entrada5, entrada6;
 //       entrada1 = sc.nextInt();
 //       entrada2 = sc.nextInt();
 //       entrada3 = sc.nextInt();
 //       entrada4 = sc.nextInt();
 //       entrada5 = sc.nextInt();
 //       entrada6 = sc.nextInt();
//
 //       System.out.println("Dados que voce digitou : ");
 //       System.out.println("Entrada : " + entrada1 + " + " +  entrada2 + " : " + "saida : " +  (entrada1 + entrada2));
 //       System.out.println("Entrada : " + entrada3 + " + " +  entrada4 + " : " + "saida : " +  (entrada3 + entrada4));
 //       System.out.println("Entrada : " + entrada5 + " + " +  entrada6 + " : " + "saida : " +  (entrada5  + entrada6));
//

//        double entrada01, entrada02, entrada03;
//        entrada01 = sc.nextDouble();
//        entrada02 = sc.nextDouble();
//        entrada03 = sc.nextDouble();
//        double tt = 3.14159 ;
//
//        System.out.println("Entrada : " +  entrada01 + " Saida: " + (tt
//        * (entrada01 * entrada01)));
//
//        System.out.println("Entrada : " +  entrada02 + " Saida: " + (tt
//        * (entrada02 * entrada02)));
//
//        System.out.println("Entrada : " +  entrada03 + " Saida: " + (tt
//        * (entrada03 * entrada03)));

//       int entrada1, entrada2, entrada3, entrada4,entrada5, entrada6, entrada7, entrada8 ;
//       entrada1 = sc.nextInt();
//       entrada2 = sc.nextInt();
//       entrada3 = sc.nextInt();
//       entrada4 = sc.nextInt();
//       entrada5 = sc.nextInt();
//       entrada6 = sc.nextInt();
//       entrada7 = sc.nextInt();
//       entrada8 = sc.nextInt();
//       System.out.println("Entrada : " + entrada1 + entrada2+ entrada3 + entrada4 + " Saida: " + ((entrada1 * entrada2) - (entrada3 * entrada4)));

//       System.out.println("Entrada : " + entrada5 + entrada6+ entrada7 + entrada8 + " Saida: " + (entrada5 * entrada6 - entrada7 * entrada8));


    //    double entrada1, entrada2, entrada3, entrada4, entrada5, entrada6,entrada7, entrada8, entrada9;
    //    entrada1 = sc.nextDouble();
    //    entrada2 = sc.nextDouble();
    //    entrada3 = sc.nextDouble();
    //    entrada4 = sc.nextDouble();
    //    entrada5 = sc.nextDouble();
    //    entrada6 = sc.nextDouble();
    //    entrada7 = sc.nextDouble();
    //    entrada8 = sc.nextDouble();
    //    entrada9 = sc.nextDouble();

        //   System.out.println("Fucncionarios : " +  entrada1 + ", horas trabalhadas" + entrada2 + ", salario : U$" + (String.format("%.2f",entrada2 * entrada3)));

      // System.out.println("Fucncionarios : " +  entrada4 + ", horas trabalhadas" + entrada5 + ", salario : U$" + (String.format("%.2f",entrada5 * entrada6)));

      // System.out.println("Fucncionarios : " +  entrada7 + ", horas trabalhadas" + entrada8 + ", salario : U$" + (String.format("%.2f",entrada8 * entrada9)));

     //   double codigopeca1, codigopeca2, numberpecas1, numberpecas2, valor1, valor2, codigopeca01, codigopeca02, numberpecas01, numberpecas02, valor01, valor02, codigopeca001, codigopeca002, numberpecas001, numberpecas002, valor001, valor002;

       // codigopeca1 = sc.nextDouble();
       // numberpecas1 = sc.nextDouble();
       // valor1 = sc.nextDouble();
       // codigopeca2 = sc.nextDouble();
       // numberpecas2 = sc.nextDouble();
       // valor2 = sc.nextDouble();

       // codigopeca01 = sc.nextDouble();
       // numberpecas01 = sc.nextDouble();
       // valor01 = sc.nextDouble();
       // codigopeca02 = sc.nextDouble();
       // numberpecas02 = sc.nextDouble();
       // valor02 = sc.nextDouble();

      //codigopeca001 = sc.nextDouble();
      //numberpecas001 = sc.nextDouble();
      //valor001 = sc.nextDouble();
      //codigopeca002 = sc.nextDouble();
      //numberpecas002 = sc.nextDouble();
      //valor002 = sc.nextDouble();


       // System.out.println("entrada1 : "+ codigopeca1 + " "+ numberpecas1 + "  " + valor1 + " entrada2 : " + codigopeca2 + numberpecas2 + valor2 + " Valor a pagar : U$" + (String.format("%.2f",(numberpecas1 * valor1) + (numberpecas2 * valor2))) );

        // System.out.println("entrada1 : "+ codigopeca01 + " "+ numberpecas01 + "  " + valor01 + " entrada2 : " + codigopeca02 + numberpecas02 + valor02 + " Valor a pagar : U$" + (String.format("%.2f",(numberpecas01 * valor01) + (numberpecas02 * valor02))) );

        // System.out.println("entrada1 : "+ codigopeca001 + " "+ numberpecas001 + "  " + valor001 + " entrada2 : " + codigopeca002 + numberpecas002 + valor002 + " Valor a pagar : U$" + (String.format("%.2f",(numberpecas001 * valor001) + (numberpecas002 * valor002))) );

        

        sc.close();

        


    }
}


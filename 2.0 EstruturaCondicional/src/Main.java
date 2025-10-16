import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // exercicio 01
//        int entrada01, entrada02, entrada03;
//
//        entrada01 = sc.nextInt();
//        entrada02 = sc.nextInt();
//        entrada03 = sc.nextInt();
//
//        if(entrada01 < 0){
//            System.out.println("Este numero e negativo " + entrada01);
//        }
//
//        if(entrada02 > 0){
//            System.out.println("Este numero a positivo " + entrada02);
//        }
//
//        if(entrada03 <= 0){
//            System.out.println("numero e negativo : " + entrada03);
//        }

        // exercicio 02

//        int entrada01, entrada02, entrada03;
//        entrada01 = sc.nextInt();
//        entrada02 = sc.nextInt();
//        entrada03 = sc.nextInt();
//
//        if(entrada01 % 2 == 0){
//            System.out.println("entrada par: " + entrada01);
//        }else System.out.println("entrada impar : " + entrada01);
//
//        if(entrada02 %2 != 0){
//            System.out.println("entrada impar: " + entrada02);
//        }else System.out.println("entrada par: " + entrada02);
//
//        if(entrada03 % 2 == 0){
//            System.out.println("entrada par: " + entrada03);
//        }else System.out.println("entrada impar: " + entrada03);
        // exercicio 4
//        int entrada1,entrada2,entrada3,entrada4,entrada5,entrada6;
//        entrada1 = sc.nextInt();
//        entrada2 = sc.nextInt();
//        entrada3 = sc.nextInt();
//        entrada4 = sc.nextInt();
//        entrada5 = sc.nextInt();
//        entrada6 = sc.nextInt();
//
//        if((entrada1 + entrada2) % 2 == 0 ){
//            System.out.println("Sao multiplos");
//        }else System.out.println("Nao sao multiplos");
//
//        if((entrada3 + entrada4) %2 != 0 ){
//            System.out.println("Nao sao multiplos");
//        }else System.out.println("Sao multiplos");
//
//        if((entrada5 + entrada6) %2 == 0){
//            System.out.println("Sao multiplos");
//        }else System.out.println("Nao sao multiplos");
        // exercicio 5
//        int horaDeEntrada, horaDeSaida;
//        int duracao ;
//
//        horaDeEntrada = sc.nextInt();
//        horaDeSaida = sc.nextInt();
//
//        if (horaDeEntrada < horaDeSaida) {
//            duracao = horaDeSaida - horaDeEntrada;
//        }
//        else {
//            duracao = 24 - horaDeEntrada + horaDeSaida;
//        }

//        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

//        double cachorroQuente = 4.00;
//        double xSalada = 4.50;
//        double xBacon = 5.00;
//        double torradaSimples = 2.00;
//        double refrigerante = 1.50;
//
//        int codigoProduto, quantidade;
//
//        codigoProduto = sc.nextInt();
//        quantidade = sc.nextInt();
//
//        switch (codigoProduto){
//            case 1 :
//                System.out.println("total a pagar : " + (cachorroQuente
//                * quantidade));
//                break;
//            case 2 :
//                System.out.println("total a pagar : " + (xSalada
//                        * quantidade));
//                break;
//            case 3 :
//                System.out.println("total a pagar : " + (xBacon
//                        * quantidade));
//                break;
//            case 4 :
//                System.out.println("total a pagar : " + (torradaSimples
//                        * quantidade));
//                break;
//            case 5 :
//                System.out.println("total a pagar : " + (refrigerante
//                        * quantidade));
//            break;
//        }

   //    double entrada1;

   //    entrada1 = sc.nextDouble();


   //    if(entrada1 >= 0 && entrada1 <= 25){
   //        System.out.println("intervalo [0,25] : " + entrada1);
   //    }else if(entrada1 > 25 && entrada1 <= 50){
   //        System.out.println("intervalo [25,50]: " + entrada1);
   //    } else if(entrada1 >= 75 && entrada1 <= 100 ) {
   //        System.out.println("Intervalo : [75,100]: " + entrada1);
   //    }else{
   //        System.out.println("Fora do intervalo: " + entrada1);
   //    }

    //Exercicio 7 nao fiz


    // este EXERCICIO 8 EU NAO ENTENDI
    double entrada1;

    entrada1 = sc.nextDouble();

    if(entrada1 >= 0 && entrada1 <= 2000){
        System.out.println("VOCE ESTA INSENTO DE IMPOSTO");
    }else if(entrada1 >= 2001 && entrada1 <= 3000 ){
        System.out.println("Seu imposto de rende e 8% porcento e voce tera que pagar R$" + (entrada1 - 2000) * 0.08);
    }else if(entrada1 >= 3003 && entrada1 <= 4500){
        System.out.println("Seu imposto de rende e 18% porcento e voce tera que pagar R$" + (0.18 * entrada1));
    } else if (entrada1 >= 4501) {
        System.out.println("Seu imposto de rende e 28% porcento e voce tera que pagar R$" + (0.28 * entrada1));
    }

        System.out.println("Parei aqui ");
        sc.close();
    }
}
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // exercicio 01

//        int senha = sc.nextInt();
//
//        while (senha != 2002){
//            senha = sc.nextInt();
//        }
//
//        System.out.println("Acesso permitido: " + senha);
        
// exercicio 02
   //  int  x = sc.nextInt();
   //  int  y = sc.nextInt();

   //    while (x != 0 && y != 0){
   //        if(x > 0 && y > 0 ){
   //            System.out.println("1 Quadrante");

   //        } else if (x < 0 && y > 0) {
   //            System.out.println("2 Quadrante");
   //        } else if (x < 0 && y < 0) {
   //            System.out.println("3 quadrante");
   //        } else{
   //            System.out.println("4 quadrante");
   //        }
   //            x = sc.nextInt();
   //            y = sc.nextInt();
   //    }

        // exercicio 3
//        System.out.println("quais as prefecias de nossos produtos 1 alcool, 2 gasolina, 3 diesel,  4 fim");
//        int produto = sc.nextInt();
//
//        int alccol = 0;
//        int gasolina = 0;
//        int diesel = 0 ;
//
//        while(produto != 4){
//            if(produto == 1){
//                alccol = alccol + 1;
//            } else if (produto == 2) {
//                gasolina = gasolina + 1;
//            }else if(produto == 3){
//                diesel = diesel + 1;
//            }
//            produto = sc.nextInt();
//        }

//        System.out.println("Alcool: " + alccol);
//        System.out.println("Gasolina: " + gasolina);
//        System.out.println("Diesel: " + diesel);
//        System.out.println("Muito obrigado");


//        int entrada = sc.nextInt();
//
//        for(int i = 0 ; i <= entrada; i++){
//            if(i % 2 != 0){
//                System.out.println("numeros : " + i);
//           }
//
//        }


//        System.out.println("digite quantas quantos numeros vao ser digitados : ");
//        int N = sc.nextInt();
//        int in = 0;
//        int out = 0;
//        int intervalo;
//        for(int i = 0; i < N ; i++){
//
//            intervalo = sc.nextInt();
//            if(intervalo >= 10 && intervalo <= 20){
//                in = in + 1;
//                System.out.println("Dentro");
//            }else{
//                out = out + 1;
//                System.out.println("fora " + out);
//            }
//        }
//        System.out.println(in + " in");
//        System.out.println(out + " out");

//        System.out.println("Digite o intervalo");
//        int N = sc.nextInt();
//        double soma = 0;
//        for(int i = 0; i < N ; i++){
//            double valor = sc.nextDouble();
//            soma = soma + valor;
//            System.out.println(soma);
//        }

//        System.out.println("saida : " + (soma / 3));
//        System.out.println("Quantos pares voce quer digitar : ");
//        int N = sc.nextInt();
//        for (int i = 0; i < N; i++){
//        double numerador = sc.nextInt();
//        double denominador = sc.nextInt();
//            if (denominador == 0){
//                System.out.println("divisao impossivel porque contem o : " + denominador);
//            }else{
//                double calculo = numerador / denominador;
//                System.out.println("saida : " + calculo);
//            }
//
//        }

//       System.out.println("quantas vezes voce quer fazer o ");
//       int N= sc.nextInt();
//        System.out.println("Quantas entradas voce quer fazer : ");
//        int entrada = sc.nextInt();
//        for (int i = 0; i < entrada; i++ ){
//            int numero = sc.nextInt();
//            int fatorial = 1;
//                if (numero == 0){
//                    numero = 1;
//                    System.out.println("saida : " + numero);
//                }else {
//                    for (int number = 1; number <= numero; number++) {
//                        fatorial = fatorial * number;
//                        System.out.println("saida: " + fatorial);
//                    }
//                }
//
//        }

//        System.out.println("quantos divisoes tem seu numero");
//        int n = sc.nextInt();
//
//        for (int i = 1 ; i <= n; i++){
//            int calculo = 0 + i;
//            System.out.println("saida : " + calculo);
//        }

        String original = " hwjbefl feirbIBuh ciubs IUBCSI ioucouB OUVDEF  ";

        String newOriginal = original.toUpperCase();
        String othorOriginal = original.toLowerCase(Locale.ROOT);
        String trimOriginal = original.trim();
        System.out.println(newOriginal);
        System.out.println(othorOriginal);
        System.out.println(trimOriginal);

        sc.close();
    }
}
import dataBase.entity.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hellow world");

        List<Employees> employees = new ArrayList<>();

        employees.add(new Employees("Joao", 2000.00, true));
        employees.add(new Employees("Maria", 15000.00, true));
        employees.add(new Employees("Carlos", 3200.00, false));
        employees.add(new Employees("Ana", 7800.00, true));
        employees.add(new Employees("Pedro", 2500.00, false));
        employees.add(new Employees("Fernanda", 12500.00, true));
        employees.add(new Employees("Lucas", 3800.00, true));
        employees.add(new Employees("Juliana", 12000.00, true));
        employees.add(new Employees("Rafael", 1800.00, false));
        employees.add(new Employees("Beatriz", 6500.00, true));
        employees.add(new Employees("Gustavo", 11000.00, true));
        employees.add(new Employees("Camila", 2900.00, false));
        employees.add(new Employees("Bruno", 5400.00, true));
        employees.add(new Employees("Larissa", 15000.00, true));
        employees.add(new Employees("Mateus", 2300.00, false));
        employees.add(new Employees("Amanda", 8700.00, true));
        employees.add(new Employees("Diego", 4200.00, false));
        employees.add(new Employees("Carolina", 13500.00, true));
        employees.add(new Employees("Felipe", 11000.00, true));
        employees.add(new Employees("Mariana", 6000.00, false));


        Scanner sc = new Scanner(System.in);
        boolean question = true;

        while(question == true){
            System.out.println(" escolha a sua opcao: 1, 2, 3, 4, 5 ");
            String option = sc.next();
            switch (option){
                case "1" :
                    System.out.println("Entrei no case 1 ");
                    employees.stream().filter(e -> e.isAtivo()).forEach(e -> System.out.println(e));
                    break;
                case "2":
                    System.out.println("Entrei no case 2");
                    employees.stream().filter(e -> e.getSalary() >= 10000.00).forEach(e -> System.out.println(e));
                    break;
                case "3" :
                    System.out.println("Entrei no case 3");
                    employees.stream().filter(e -> ! e.isAtivo()).forEach(e -> System.out.println(e));

                   boolean ativo = employees.stream().anyMatch(e -> !e.isAtivo());
                    System.out.println(ativo);

                    break;
                case "4" :
                    System.out.println("Entrei no case 4");
                    employees.removeIf(e -> ! e.isAtivo());
                    employees.forEach(e -> System.out.println(e));
                    break;
                case "5":
                    System.out.println("Entrei no case 5");
                    for(Employees employees1 : employees ){
                        System.out.println(employees1);
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Sair do painel : 1.Sim 2.NAO");
            String out = sc.next();
            if(out.equals("1")){
                question = false;
            }
            // 1 - exibir funcionarios que trabalham
            //2 - funcionarios que ganham acima de 10 mil
            //3 - quer saber se existe funionarios inativos
            //4 - remaver funcionarios inativos
            //5 - mostrar todos os funcionarios
        }
        System.out.println("Voce terminou.");
    }
}
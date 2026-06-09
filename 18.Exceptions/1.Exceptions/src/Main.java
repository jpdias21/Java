import dataBase.model.User;
import exceptions.DomainException;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name;
        String email;
        Integer age;

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter your name :");

            name = sc.next();

            System.out.println("Enter your email: ");
            email = sc.next();

            System.out.println("Enter your age : ");
            age = sc.nextInt();

            User user = new User(name, email, age);

        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("Inseriu input errado");

        }catch(NullPointerException e){
            System.out.println("voce Nao inseriu nenhum objeto");
        } catch (DomainException e){
            System.out.println(e.getMessage());
            System.out.println("Aqui apareceu");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
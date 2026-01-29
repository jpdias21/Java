package infra.DataBase;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            System.out.println("Conectado!");
        } catch (Exception e) {
            System.out.println("Erro:");
            e.printStackTrace();
        }
    }
}

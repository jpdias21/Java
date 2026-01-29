package infra.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL =
            "jdbc:postgresql://systempayment.ca9coao02lnw.us-east-1.rds.amazonaws.com:5432/system_payment";
    private static final String USER = "postgres";
    private static final String PASSWORD = "968292003Joao";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

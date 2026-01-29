package infra.dao;

import infra.DataBase.ConnectionFactory;
import model.PaymentClient.Client;
import model.PaymentProcess.CreditCard;
import model.PaymentProcess.PaymentProcess;
import model.enums.StatusPayment;

import java.sql.*;

public class PaymentIssuedDAO {

    public void save(PaymentProcess paymentProcess) throws SQLException {
        String sql = "INSERT INTO payment_issued(name, surname,email,amount,creat_at,payment_method,status) VALUES(?,?,?,?,?,?, ?)";



        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            stmt.setString(1, paymentProcess.getClient().getName());
            stmt.setString(2, paymentProcess.getClient().getSurName());
            stmt.setString(3, paymentProcess.getClient().getEmail());
            stmt.setDouble(4, paymentProcess.getAmount());
            stmt.setTimestamp(5, paymentProcess.getTimestamp());  // ← Position 5
            stmt.setString(6, paymentProcess.getMethodPayment().toString());
            stmt.setString(7, paymentProcess.getStatusPayment().toString());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()) {
                paymentProcess.setPaymentId(rs.getInt(1));
            }


        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public PaymentProcess findById(int id) throws SQLException{
        PaymentProcess paymentProcess = null;
        String sql = "SELECT * FROM payment_issued WHERE id_payment_issued = ?";
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                Client client = new Client(
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("email")
                );

                paymentProcess = new CreditCard(
                        rs.getDouble("amount"),
                        rs.getInt("id_payment_issued"),
                        StatusPayment.valueOf(rs.getString("status")),
                        rs.getTimestamp("creat_at"),
                        null,
                        client
                );
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return paymentProcess;
    }


}

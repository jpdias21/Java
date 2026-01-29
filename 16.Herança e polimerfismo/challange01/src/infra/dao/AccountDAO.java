package infra.dao;

import model.AccountOfBussines.Account;

import infra.DataBase.ConnectionFactory;

import java.sql.*;

public class AccountDAO {

    public void save(Account account) throws SQLException {

        String sql = "INSERT INTO account(holder,account_number, balance) VALUES(?,?,?)";


        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, account.getHolder());
            stmt.setInt(2, account.getNumber());
            stmt.setDouble(3, account.getBalance());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int idGenerated = rs.getInt(1);
                account.setIdAccountBD(idGenerated);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void updateBalance(Account account) {
        String sql = "UPDATE account SET balance = ? WHERE id_account = ? ";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, account.getBalance());
            stmt.setInt(2, account.getIdAccountBD());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Account findById(int id) throws SQLException {
        Account account = null;
        String sql = "SELECT * FROM account WHERE id_account = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                account = new Account();
                account.setIdAccountBD(rs.getInt("id_account"));
                account.setBalance(rs.getDouble("balance"));
                account.setHolder(rs.getString("holder"));
                account.setNumber(rs.getInt("number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;
    }
}


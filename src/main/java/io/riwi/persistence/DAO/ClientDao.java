package io.riwi.persistence.DAO;

import io.riwi.models.Client;
import io.riwi.persistence.database.ConfigDB;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {
    public Client registerClient(Object obj) throws SQLException {

        Client objClient = (Client) obj;

        try {
            Connection conn = ConfigDB.openConnection();

            String sql = "INSERT INTO client (firstname, lastname, email, phoneNumber, address) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, objClient.getFirstName());
            preparedStatement.setString(2, objClient.getLastName());
            preparedStatement.setString(3, objClient.getEmail());
            preparedStatement.setString(4, objClient.getPhoneNumber());
            preparedStatement.setString(5, objClient.getAddress());
            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();

            while (rs.next()) {
                objClient.setId(rs.getInt(1));
            }
            JOptionPane.showMessageDialog(null, "Client registered successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error >> " + e.getMessage());
        }
        return objClient;
    }

    public List<Object> ShowClients() {
        List<Object> clientList = new ArrayList<>();

        Connection conn = ConfigDB.openConnection();

        try {

            String sql = "SELECT * FROM client";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            ResultSet rs = preparedStatement.getGeneratedKeys();

            while (rs.next()) {
                Client client = new Client();
                client.setId(rs.getInt("id"));
                client.setFirstName(rs.getString("firstname"));
                client.setLastName(rs.getString("lastname"));
                client.setEmail(rs.getString("email"));
                client.setPhoneNumber(rs.getString("phoneNumber"));
                client.setAddress(rs.getString("email"));
                clientList.add(client);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error >> " + e.getMessage());
        }
        return clientList;

    }
}

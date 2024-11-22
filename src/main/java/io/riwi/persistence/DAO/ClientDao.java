package io.riwi.persistence.DAO;

import io.riwi.models.Client;
import io.riwi.persistence.database.ConfigDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {
    public void registerClient(Client client) throws SQLException {
        String sql = "INSERT INTO client (firstname, lastname, email, phoneNumber, address) VALUES (?, ?, ?, ?, ?)";
        try (
                Connection conn = ConfigDB.openConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(sql)
        ) {
            preparedStatement.setString(1, client.getFirstName());
            preparedStatement.setString(2, client.getLastName());
            preparedStatement.setString(3, client.getEmail());
            preparedStatement.setString(4, client.getPhoneNumber());
            preparedStatement.setString(5, client.getAddress());
            preparedStatement.executeUpdate();
        }
    }

    public List<Client> ShowClients() throws SQLException {
        String sql = "SELECT * FROM client";
        ArrayList<Client> clients = new ArrayList<>();

        try (
                Connection conn = ConfigDB.openConnection();
                Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(sql)
        ) {
            while (rs.next()) {
                Client client = new Client();
                client.setId(rs.getInt("id"));
                client.setFirstName(rs.getString("firstname"));
                client.setLastName(rs.getString("lastname"));
                client.setEmail(rs.getString("email"));
                client.setPhoneNumber(rs.getString("phoneNumber"));
                client.setAddress(rs.getString("email"));
                clients.add(client);
            }
        }
        return clients;

    }
}

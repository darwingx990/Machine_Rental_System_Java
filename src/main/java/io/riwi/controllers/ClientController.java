package io.riwi.controllers;

import io.riwi.models.Client;
import io.riwi.persistence.DAO.ClientDao;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

public class ClientController {

    public static void createClient(Client client) throws SQLException {
        ClientDao objClientDao = new ClientDao();

        String firstname = JOptionPane.showInputDialog("please enter your name: ");
        String lastname = JOptionPane.showInputDialog("please enter your last name: ");
        String email = JOptionPane.showInputDialog("please enter your email: ");
        String phoneNumber = JOptionPane.showInputDialog("please enter your phonenumber: ");
        String address = JOptionPane.showInputDialog("please enter your address: ");

        Client objClient = new Client();

        objClient.setFirstName(firstname);
        objClient.setLastName(lastname);
        objClient.setEmail(email);
        objClient.setPhoneNumber(phoneNumber);
        objClient.setAddress(address);

        objClient = (Client) objClientDao.registerClient(objClient);

    }

    public List<Client> showClients() throws SQLException {
        return null;
    }
}

package io.riwi;

import io.riwi.controllers.ClientController;
import io.riwi.persistence.DAO.ClientDao;
import io.riwi.persistence.database.ConfigDB;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConfigDB.openConnection();
        ClientController clientControlle = new ClientController();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Registrar cliente");
            System.out.println("2. Consultar clientes");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    clientControlle;

                    break;
                case 2:
                    // Lógica para consultar clientes
                    break;
            }
        } while (opcion != 3);

        ConfigDB.closeConnection();


    }
}
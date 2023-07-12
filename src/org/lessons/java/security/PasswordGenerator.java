package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName;
        String userSurname;
        String userFavoriteColor;
        int userBirthDay;
        int userBirthMonth;
        int userBirthYear;

        //Richiesta Dati
        System.out.println("Nome: ");
        userName = scanner.nextLine();
        System.out.println("Cognome: ");
        userSurname = scanner.nextLine();
        System.out.println("Colore Preferito: ");
        userFavoriteColor = scanner.nextLine();
        System.out.println("Giorno di Nascita: ");
        userBirthDay = scanner.nextInt();
        System.out.println("Mese di Nascita: ");
        userBirthMonth = scanner.nextInt();
        System.out.println("Anno di Nascita: ");
        userBirthYear = scanner.nextInt();

        //Operazioni

        int numberPassword = userBirthDay + userBirthMonth + userBirthYear;
        String stringPassword = userName + "-" + userSurname + "-" + userFavoriteColor + "-";

        System.out.println(stringPassword + numberPassword);

    }
}

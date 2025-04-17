package com.mycompany.chatappcs;

import java.util.Scanner;

public class ChatAppCS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Enter number: ");
        String number = scanner.nextLine();

        Login newLogin = new Login(username, password, number);
        System.out.println(newLogin.registerUser());

        System.out.println("Confirm username: ");
        String confirmUsername = scanner.nextLine();
        System.out.println("Confirm password: ");
        String confirmPassword = scanner.nextLine();
        System.out.println("Confirm number: ");
        String confirmNumber = scanner.nextLine();

        boolean status = newLogin.loginUser(confirmUsername, confirmPassword, confirmNumber);
        System.out.println(newLogin.LoginStatus(status));
    }
}

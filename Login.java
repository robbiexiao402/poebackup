package com.mycompany.chatappcs;

public class Login {
    private final String username, password, number;

    public Login(String username, String password, String number) {
        this.username = username;
        this.password = password;
        this.number = number;
    }

    private boolean checkUsername() {
        final String pattern = "^(?=.{1,5}$)(?=.*_)[A-Za-z_]*$";
        return this.username.matches(pattern);
    }

    private boolean checkPassword() {
        final String pattern = "^(?=.{8,8}$)(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?])[A-Za-z0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]*$";
        return this.password.matches(pattern);
    }

    private boolean checkCellPhoneNumber() {
        final String pattern = "^\\+27([0-9]{9})$";
        return this.number.matches(pattern);
    }

    public String registerUser() {
        if (!checkUsername()) {
            return "Username not valid.";
        } else if (!checkPassword()) {
            return "Password not valid.";
        } else if (!checkCellPhoneNumber()) {
            return "Number not valid.";
        } else {
            return "All information captured.";
        }
    }

    public boolean loginUser(String username, String password, String number) {
       return username.equals(this.username) && password.equals(this.password) && number.equals(this.number);
    }

    public String LoginStatus(boolean status) {
        if (status) {
            return "Successful";
        } else {
            return "Unsuccessful";
        }
    }
}

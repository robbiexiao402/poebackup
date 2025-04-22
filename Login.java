package com.mycompany.chatappcs;

public class Login {
    final String username, password, number;

    public Login(String username, String password, String number) {
        this.username = username;
        this.password = password;
        this.number = number;
    }
    // Title: Username Regex Validation
    // Author: ChatGPT
    // Date: 18 April 2025
    // Version: GPT-4
    // Available: https://chatgpt.com/share/6804c413-ddc4-800a-904b-da09271b90fd
    public boolean checkUsername() {
        final String pattern = "^(?=.{1,5}$)(?=.*_)[A-Za-z0-9_]*$";
        return this.username.matches(pattern);
    }
    // Title:  Regex Password Validation
    // Author: ChatGPT
    // Date: 18 April 2025
    // Version: GPT-4
    // Available: https://chatgpt.com/share/68077153-67dc-800a-9ca0-e619f862bd5a
    public boolean checkPassword() {
        final String pattern = "^(?=.{8,}$)(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?])[A-Za-z0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]*$";
        return this.password.matches(pattern);
    }
    // Title: Java Regex Explanation
    // Author: ChatGPT
    // Date: 18 April 2025
    // Version: GPT-4
    // Available: https://chatgpt.com/share/680770c0-ea4c-800a-ae25-6025400de70d
    public boolean checkCellPhoneNumber() {
        final String pattern = "^\\+27([0-9]{9})$";
        return this.number.matches(pattern);
    }

    public String registerUser() {
        if (!checkPassword() && !checkUsername()) {
            return "Username and password not valid.";
        } else if (!checkCellPhoneNumber() && !checkUsername()) {
            return "Username and number not valid";
        } else if (!checkCellPhoneNumber() && !checkPassword()) {
            return "Password and number not valid.";
        } else if (!checkUsername()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        } else if (!checkPassword()) {
            return "Password is not correctly formatted, please ensure that the pasword contains at least 8 characters, a capital letter, a number, and a special character.";
        } else if (!checkCellPhoneNumber()) {
            return "Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.";
        } else {
            return "Username successfully captured.\nPassword successfully captured.\nCellphone number successfully captured.";
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


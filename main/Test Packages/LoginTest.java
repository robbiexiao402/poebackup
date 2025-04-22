package com.mycompany.chatappcs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    // Title: Seperate string in Java
    // Author: ChatGPT
    // Date: 22 April 2025
    // Version: GPT-4
    // Available: https://chatgpt.com/share/68077af7-3308-800a-9a2e-37aeee18f764
    @Test
    public void testValidUsername() {
        Login login = new Login("kyl_1", "Kyleee1@", "+27831009438");
        String message = login.registerUser();
        assertEquals("Username successfully captured.", message.split("\n")[0]);
    }

    @Test
    public void testInvalidUsername() {
        Login login = new Login("kyle!!!!!!!", "Kyleee1@", "+27831009438");
        String message = login.registerUser();
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", message);
    }
    // Title: Seperate string in Java
    // Author: ChatGPT
    // Date: 22 April 2025
    // Version: GPT-4
    // Available: https://chatgpt.com/share/68077af7-3308-800a-9a2e-37aeee18f764
    @Test 
    public void testValidPassword() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99", "+27831009438");
        String message = login.registerUser();
        assertEquals("Password successfully captured.", message.split("\n")[1]);
    }
    
    @Test
    public void testInvalidPassword() {
        Login login = new Login("kyl_1", "password", "+27831009438");
        String message = login.registerUser();
        assertEquals("Password is not correctly formatted, please ensure that the pasword contains at least 8 characters, a capital letter, a number, and a special character.", message);
    }
    // Title: Seperate string in Java
    // Author: ChatGPT
    // Date: 22 April 2025
    // Version: GPT-4
    // Available: https://chatgpt.com/share/68077af7-3308-800a-9a2e-37aeee18f764
    @Test
    public void testValidNumber() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976");
        String message = login.registerUser();
        assertEquals("Cellphone number successfully captured.", message.split("\n")[2]);
    }
    
    @Test
    public void testInvalidNumber() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99", "08966553");
        String message = login.registerUser();
        assertEquals("Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.", message);
    }
    
    @Test
    public void testValidLogin() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976");
        login.registerUser();
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99", "+27838968976"));
    }
    
    @Test
    public void testInvalidLogin() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976");
        login.registerUser();
        assertFalse(login.loginUser("kyl_3", "password", "0834567892"));
    }
    
    @Test
    public void testCorrectUsername() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976");
        assertTrue(login.checkUsername());
    }
    
    @Test
    public void testIncorrectUsername() {
        Login login = new Login("kyle!!!!!!!", "Ch&&sec@ke99", "+27838968976");
        assertFalse(login.checkUsername());
    }
    
    @Test
    public void testCorrectPassword() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976");
        assertTrue(login.checkPassword());
    }
    
    @Test
    public void testIncorrectPassword() {
        Login login = new Login("kyl_1", "password", "+27838968976");
        assertFalse(login.checkPassword());
    }
    
    @Test
    public void testCorrectCellNumber() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99", "+27838968976");
        assertTrue(login.checkCellPhoneNumber());
    }
    
    @Test
    public void testIncorrectCellNumber() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99", "0834567892");
        assertFalse(login.checkCellPhoneNumber());
    }
}

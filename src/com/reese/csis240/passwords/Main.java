package com.reese.csis240.passwords;

import java.security.SecureRandom;

public class Main
{
    public static void main(String args[]) {
        SecureRandom random = new SecureRandom();
        char[] possibleChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '*', '&', '$', '#' };

        // Total number of passwords:
        // (chars.length ^ 7 characters) * 10 (1st char must be number)
        long possiblePasswords = (long) Math.pow(possibleChars.length, 7) * 10;
        System.out.println("Total possible passwords:\n" + possiblePasswords + "\n");

        // Generate cryptographically strong random password:
        // Total length: 8
        // First character between 0-9
        char[] password = new char[8];
        password[0] = possibleChars[random.nextInt(10)];
        for (int i = 1; i < 8; i++) {
            password[i] = possibleChars[random.nextInt(possibleChars.length)];
        }
        String passwordStr = String.valueOf(password);
        System.out.println("Generated password:\n" + passwordStr);
    }
}
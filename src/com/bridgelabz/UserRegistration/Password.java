package com.bridgelabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password : ");
        String password;

        try {
            String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$";
            password = scanner.next();
            //password = "";
            //char ch = password.charAt(10);

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println(password + " is valid");
            } else {
                System.out.println(password + " is invalid");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

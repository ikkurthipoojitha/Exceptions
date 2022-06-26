package com.bridgelabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first name : ");
        String firstName;

        try{
            String regex = "^[A-Z][a-z]{2,6}$";
            firstName = scanner.next();
            //firstName = "";
            char ch = firstName.charAt(10);

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(firstName);
            if (matcher.matches()) {
                System.out.println(firstName + " is valid name");
            } else {
                System.out.println(firstName + " is invalid name");
            }

        }

        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}

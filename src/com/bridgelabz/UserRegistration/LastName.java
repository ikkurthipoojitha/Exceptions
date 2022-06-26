package com.bridgelabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LastName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the last name : ");
        String lastName;

        try{
            String regex = "^[A-Z][a-z]{2,6}$";
            lastName = scanner.next();
            //lastName = "";
            char ch = lastName.charAt(10);

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(lastName);
            if (matcher.matches()) {
                System.out.println(lastName + " is valid name");
            } else {
                System.out.println(lastName + " is invalid name");
            }

        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

package com.bridgelabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailId {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email id : ");
        String mailId;

        try {
            String regex = "^[a-z]([a-z0-9+._]){3,16}[a-z0-9]@[a-z0-9]{1,12}.[a-z]{2,5}$";
            mailId = scanner.next();
            //mailId = "";
            //char ch = mailId.charAt(10);

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(mailId);
            if (matcher.matches()) {
                System.out.println(mailId + " is valid");
            } else {
                System.out.println(mailId + " is invalid");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

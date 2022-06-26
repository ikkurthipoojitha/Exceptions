package com.bridgelabz.UserRegistration;
import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mobile number: ");
        String mobileNumber;

        try{
            String regex = "^[0-9]{2}[6-9]{1}[0-9]{9}$";
            mobileNumber = scanner.next();
            //mobileNumber = "";
            char ch = mobileNumber.charAt(10);

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(mobileNumber);
            if (matcher.matches()) {
                System.out.println(mobileNumber + " is valid number");
            } else {
                System.out.println(mobileNumber + " is invalid number");
            }

        }

        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}

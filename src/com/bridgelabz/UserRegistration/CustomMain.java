package com.bridgelabz.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomMain {

    public void  validateName(String test) throws CustomException {
        String regex = "^[A-Z][a-z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);

        if(matcher.matches()){

            throw new CustomException("Name is valid");
        }
        else {
            System.out.println("Name is not valid");
        }
    }

    public void  validateMobileNumber(String test) throws CustomException {
        String regex = "^[0-9]{2}[6-9]{1}[0-9]{9}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);

        if(matcher.matches()){

            throw new CustomException("Mobile Nnumber is valid");
        }
        else {
            System.out.println("Mobile number is  invalid");
        }
    }

    public void  validatePassword(String test) throws CustomException {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);

        if(matcher.matches()){

            throw new CustomException("password is valid");
        }
        else {
            System.out.println("password is invalid");
        }
    }


    public void  validateMail(String test) throws CustomException {

        String regex = "^(abc)[.+-]?[0-9]{0,3}(@)[a-z0-9]{1,}.[a-z]{1,}.?[a-z]{1,},?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);

        if(matcher.matches()){

            throw new CustomException("mail is valid");
        }
        else {
            System.out.println("mail is invalid");
        }
    }


    public static void main(String[] args) throws CustomException {


        CustomMain customMain = new CustomMain();

        try
        {
            customMain.validateName("Kiya");
        }catch (CustomException message)
        {
            System.out.println("Exception : " + message);
        }

        try
        {
            customMain.validateMobileNumber("91 9876543210");
        }catch (CustomException message)
        {
            System.out.println("Exception : " + message);
        }

        try
        {
            customMain.validatePassword("Poojitha@123");
        }catch (CustomException message)
        {
            System.out.println("Exception : " + message);
        }

        try
        {
            customMain.validateMail("abc.100@gmail.com");
        }catch (CustomException message)
        {
            System.out.println("Exception : " + message);
        }


    }
}

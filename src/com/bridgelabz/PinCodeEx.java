package com.bridgelabz;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PinCodeEx {

    public static void main(String[] args) {
        System.out.println("Welcome to Regex pinCode pattern program");
        String pinCode = "400 088";
        String regex = "^[1-9]{1}[0-9]{2}\\s?[0-9]{3}$";
        //creating pattern and matcher objects
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pinCode);
        if(matcher.matches())
            System.out.println("PinCode is Valid! as space in pinCode matches regex pattern");
        else
            System.out.println("PinCode is Invalid! as space in pinCode does not match the regex pattern");
    }
}


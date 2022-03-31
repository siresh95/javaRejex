package com.bridgelabz;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailEx {

        public static void main(String[] args) {
        System.out.println("Welcome to Regex Email pattern program");
        String email="abc.xyz@bridgelabz.co.in";
        String regex="^[a-z0-9]+([.+_-][a-z]+)*@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        //creating objects of pattern and matcher.
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
            System.out.println("email is valid! \nAs optional part xyz and country code matches with regex pattern");
        else
            System.out.println("email is invalid! \nAs optional part xyz and country code doesn't matches with regex pattern");
    }
    }


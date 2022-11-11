package com.tcs.main;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx
{
    public static void main(String[] args)
    {
        Console console = System.console();

        Scanner input = new Scanner(System.in);

            System.out.print("Enter RegEx ");
            String regex = input.next();
            Pattern pattern = Pattern.compile(regex);

            System.out.print("Enter Text to Matched ");
            String inputText = input.next();
            Matcher matcher = pattern.matcher(inputText);

            boolean found = false;

            while (matcher.find())
            {
                System.out.println(matcher.group()+" "+matcher.start());
                found = true;
            }

            if(!found){
                System.out.println("No match found");
            }

    }
}


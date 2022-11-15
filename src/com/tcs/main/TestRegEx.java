package com.tcs.main;

import com.tcs.side.Animal;

import java.io.Console;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx
{
    public static void main(String[] args)
    {

        TestCollections.StaticCollections sc = new TestCollections.StaticCollections();

        TestCollections tc = new TestCollections();
        TestCollections.InnerCollections innerCollections = tc.new InnerCollections();

        MyInterface mi = new MyInterface() { // Anonymous Class
                                    @Override
                                    public void sort() {

                                    }

                                    @Override
                                    public Month[] list() {
                                    return new Month[0];
                                    }
        };

        class MyClass{ // Local Class


        }

        MyClass mc = new MyClass();

        List<Animal> zooAnimals = new ArrayList<>();
        Animal a1 = new Animal();
        Animal a2 = a1;
        zooAnimals.add(new Animal());
        zooAnimals.add(a1);
        zooAnimals.add(a2);
        MyCollection<String, Integer, Float> myCollection = new MyCollection<>();

        MyInterface someRefVar = new Wallet(56);

        MyInterface.add2nos(5,8);

        Month[] months = {

                Month.JANUARY,
                Month.FEBRUARY,
                Month.MARCH,
                Month.APRIL,
                Month.MAY,
                Month.JUNE,
                Month.JULY,
                Month.AUGUST,
                Month.SEPTEMBER,
                Month.OCTOBER,
                Month.NOVEMBER,
                Month.DECEMBER
        };

        for( Month month : months )
        {
            System.out.println(Integer.valueOf(month.ordinal()));
        }

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


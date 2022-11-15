package com.tcs.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestLambda {

    public static void main(String[] args) {

        List<BigDecimal> numbers = new ArrayList<>();
        List<BigDecimal> filterednumbers = new ArrayList<>();
        List<String> mappedStrings = new ArrayList<>();

        Predicate<BigDecimal> usualPredicate = bd -> (bd.compareTo(BigDecimal.valueOf(70.0))) == 1; // Reusing Lambda Functions

        Function<BigDecimal,Predicate<BigDecimal>> usualFunction = (BigDecimal bigDecimal)-> {

            Predicate<BigDecimal> predicate = (BigDecimal bd) -> (bd.compareTo(bigDecimal)) == 1;
            return predicate;

        };

        Function<BigDecimal, String> mapFunction = (BigDecimal bd) -> {
            String s="";
            if(bd.compareTo(BigDecimal.valueOf(70.0)) ==1)
            {
                s = "Big Number";
            }
            else {
                s = "Small Number";
            }
            return s;
        };

        Function< BigDecimal, Function<BigDecimal, String> > modifiedMapFunction = (BigDecimal bd)->
        {
            Function<BigDecimal, String> mapFunctionTemp = (BigDecimal e) -> {
                String s="";
                if(e.compareTo(bd) ==1)
                {
                    s = "Big Number";
                }
                else {
                    s = "Small Number";
                }
                return s;
            };
            return mapFunctionTemp;
        };



        numbers.add(new BigDecimal(45.0));
        numbers.add(new BigDecimal(22.7));
        numbers.add(new BigDecimal(34.2));
        numbers.add(new BigDecimal(125.54));
        numbers.add(new BigDecimal(23.89));
        numbers.add(new BigDecimal(67.98));
        numbers.add(new BigDecimal(78.32));
        numbers.add(new BigDecimal(98.32));
        numbers.add(new BigDecimal(12.78));
        numbers.add(new BigDecimal(72.56));

        BigDecimal sum = new BigDecimal(0.0);

        //What if we wanted to multiply each number by a weight factor and then add? for bd X 0.8 | it's like 20% discount
        // Only values greater than 70 have to be discounted

       // for(BigDecimal bd : numbers)
       // {
          //  BigDecimal tempBd = bd;
          //  if((bd.compareTo(BigDecimal.valueOf(70.0))) == 1) // if bd is greater than 70.0
          //  {
           //     tempBd = bd.multiply(BigDecimal.valueOf(0.8)); // tempBd discounted by 20%
           // }
          //  sum = sum.add(tempBd);
       // }

        System.out.println("Sum of the numbers is "+sum);

        BigDecimal resultFiltered = numbers.stream().filter(usualFunction.apply(BigDecimal.valueOf(50.0))).map( n -> n.multiply(BigDecimal.valueOf(0.8))).reduce(BigDecimal.ZERO,BigDecimal::add);

        System.out.println("Sum of the filtered numbers is "+resultFiltered);

        BigDecimal result = numbers.stream().map( n -> {BigDecimal tempN = BigDecimal.valueOf(0.0); if((n.compareTo(BigDecimal.valueOf(70.0))) > 0) {  tempN =  n.multiply(BigDecimal.valueOf(0.8));}return tempN;}).reduce(BigDecimal.ZERO,BigDecimal::add);

        numbers.stream().forEach(e -> { // Lambda Functions are Shorthand notation for Anonymous Classes* | Methods
            ;
            ;
            ;

            System.out.println(e);
        });

        numbers.forEach(e -> System.out.println(e));

        System.out.println("Unfiltered Discounted Sum is "+result);

       // numbers.forEach(e -> {
          //  if((e.compareTo(BigDecimal.valueOf(70.0))) == 1)
          //  {
          //      filterednumbers.add(e);
          //  }
       // });

        System.out.println("****************************");



        filterednumbers = numbers.stream().filter(usualFunction.apply(BigDecimal.valueOf(100.0))).collect(Collectors.toList());

        //numbers.forEach(e-> System.out.println(e));
        numbers.stream().forEach(System.out::println);
        System.out.println("****************************");
        filterednumbers.forEach(System.out::println);
        System.out.println("****************************");

        mappedStrings = numbers.stream().map(modifiedMapFunction.apply(BigDecimal.valueOf(100.0))).collect(Collectors.toList());
        mappedStrings.forEach(System.out::println); // Method References

    }

    }


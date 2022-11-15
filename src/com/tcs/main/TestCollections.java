package com.tcs.main;

import com.tcs.side.Vocal;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class TestCollections
{

    MyInterface mi = new MyInterface() { // Anonymous Class
        @Override
        public void sort() {

        }

        @Override
        public Month[] list() {
            return new Month[0];
        }
    };



    public class InnerCollections // Inner Class Definition
    {

    }

    public static class StaticCollections // Nested Static Class
    {

    }

    public static void main(String[] args)
    {

        Scanner speakInput = new Scanner(System.in);
        String speakInputString = speakInput.next();

        Vocal vc;

        if(speakInputString.equals("human"))
        {
            vc = new Vocal() {
                @Override
                public String speak( ) {

                    return "Hello I am a Human and I speak";
                }
            };
        }
        else {

           vc = new Vocal() {
                @Override
                public String speak() {
                    return "Hello I am not a Human and I don't speak";
                }
            };

        }

        System.out.println(vc.speak()); // compare this to filter(), map(), reduce()



        System.out.println("**************************");

        TestCollections tc = new TestCollections();
        InnerCollections ic = tc.new InnerCollections();

        StaticCollections sc = new StaticCollections();

        List<Month> months = new ArrayList<>();

        months.add(Month.DECEMBER);
        months.add(Month.JANUARY);
        months.add(Month.APRIL);
        months.add(Month.FEBRUARY);
        months.add(Month.MARCH);
        months.add(Month.MARCH);

        //boolean monthExists = false;
        //for( Month month : months ) // for each construct
       // {
         //   if(month.equals(Month.MARCH))
         //   {
          //      monthExists = true;
           // }
       // }

        //System.out.println("JUNE exists ?"+monthExists);

        System.out.println(Month.JUNE+" Exists? "+months.contains(Month.JUNE));

        System.out.println(months);

        Scanner input = new Scanner(System.in);
        //System.out.print("Please enter an index");
        //int  i = input.nextInt();

        //System.out.println(months.get(i));

        months.stream().sorted().toString();

        System.out.println(months);

        months.add(2,Month.SEPTEMBER);

        System.out.println(months);


        System.out.println("**********SET************");
        SortedSet<Month> monthSet = new ConcurrentSkipListSet<>();

        monthSet.add(Month.DECEMBER);
        monthSet.add(Month.JANUARY);
        monthSet.add(Month.JANUARY);
        monthSet.add(Month.JUNE);
        monthSet.add(Month.JUNE);
        monthSet.add(Month.APRIL);

        System.out.println(monthSet);

        System.out.println("**********QUEUE************");

        Queue<Month> monthQueue = new PriorityQueue<>();
        monthQueue.add(Month.DECEMBER);
        monthQueue.add(Month.APRIL);
        monthQueue.add(Month.DECEMBER);
        monthQueue.add(Month.JANUARY);
        monthQueue.add(Month.SEPTEMBER);
        monthQueue.add(Month.SEPTEMBER);

        System.out.println(monthQueue);

       // System.out.println(monthQueue.peek());

        while (!monthQueue.isEmpty())
        {
            System.out.println(monthQueue.poll());
            System.out.println(monthQueue);
        }

        System.out.println("**********MAP************");

        Map<Month,List<Double>> delhiTempMap = new HashMap<>();

        List<Double> tempList = new ArrayList<>();
        tempList.add(3.0);
        tempList.add(5.0);
        delhiTempMap.put(Month.DECEMBER,tempList);
        delhiTempMap.put(Month.DECEMBER,tempList);
        delhiTempMap.put(Month.MARCH,tempList);
        delhiTempMap.put(Month.JUNE,tempList);
        delhiTempMap.put(Month.SEPTEMBER,tempList);

        System.out.println("Temperature in Delhi in "+Month.DECEMBER+" is "+delhiTempMap.get(Month.DECEMBER));







    }
}

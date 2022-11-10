package com.tcs.main;

import com.tcs.side.*;

import java.io.*;
import java.util.Scanner;

/** This is the First Test Class that was written for TCS Java Training */
public class TcsTest extends User // this is the Application's Main class
{

    TcsTest(String username)
    {
        super(username);


    }

     int someNum; // This Declaration is inside the Class Body - [Instance Variable or Static Variable]

    //class body

    //More Methods...
    //More DATA

    /*
    * comments
    * ...
    * ...
    * ...
    *
    * */

    { // independent block
        // some code or data

    }

    public static void main (String... args) throws IOException // will start from the main method (Entry Point)
    {
        int sumNum3; // local variable

        myBlock:{ // Independent Block can have Label | Method | Class
            //..First Statement | Expression
            System.out.println("Hello TCS!712"); // String is the DATA
            //... more code
            System.out.println("sum of two int nos is " + addTwoInts(6,8)); // Method Invocation
            System.out.println("sum of two dec nos is " + addTwoFrcns(4.6,9.7)); // Method Invocation
            System.out.println("sum of two dec nos is " + addTwoFrcns(56.45,78.43)); // Method Invocation


            int[] numArr ; // arr type variable declaration
            numArr = new int[10]; //  instantiation

            //arr initialization block
            for(int i=0; i<numArr.length;i++)
            {
                numArr[i] = i*3;
            }

            String[][] names =
                    {
                        {"Mr. ", "Mrs. ", "Ms. "},
                        {"Smith", "Jones"}
                    };

            //float[][] temperatureValues; // 2 dimensional arr type variable declaration
            //temperatureValues = new float[6][5];  //  instantiation of 6 X 5 Float type Data Variables = 30 X 4 = 120 Bytes

            float[][] temperatureValues = // Declaration, Instantiation and Initialization all at once
                    {
                        //  Jan, Apr, Jun, Sep, Nov
                            {24f,35f, 38f, 28f, 25f}, // Mumbai
                            {12f,32f, 42f, 30f, 18f}, // Delhi
                            {24f,23f, 22f, 21f, 22f}, // Bengaluru
                            {26f,32f, 38f, 30f, 24f}, // Chennai
                            {28f,33f, 36f, 26f, 22f}, // Kolkata
                            {-5f,18f, 30f, 16f, 6f},  // Munich
                    };

            System.out.println("sum of array elements is " + addArrElmnts(numArr)); // Method Invocation

            System.out.println("incremented value is " + incrementInt(78)); // Method Invocation
            System.out.println("decremented value is " + decrementInt(78)); // Method Invocation

            System.out.println("result of conditional operation is " + operateConditionally(-8, 56)); // Method Invocation

            System.out.println("result of conditional operation with switch is " + conditionalOperatorSwitch(8, 5, 'k')); // Method Invocation


            System.out.println("Max Temp of the Given City is:  "+findMaxTemperatureCity(temperatureValues, "mumbai")+" degrees celcius"); // Method Invocation

            CafeCoffeeDay  outlet1; //Declaration
            outlet1 = new CafeCoffeeDay(500,4); // Instantiation and Partial Initialization
            outlet1.setLocation("mg road, bengaluru"); // Initialization



            System.out.println("com.tcs.side.Location of Outlet1 is: "+outlet1.getLocation());

            CafeCoffeeDay outlet2;
            outlet2 = new CafeCoffeeDay(100,1); // Instantiation and Partial Initialization
            outlet2.setLocation("marine drive, mumbai"); // Initialization

            System.out.println("com.tcs.side.Location of Outlet2 is: "+outlet2.getLocation());

            Location l1 = new Location(45,67);
            Location l2 = new Location(89,34);



            System.out.println("Distance between l1 and l2 is: "+calcDistance(l1,l2));

            System.out.println("value of x for l1: "+l1.getX()+" Value of y for l1: "+l1.getY());
            System.out.println("value of x for l2: "+l2.getX()+" Value of y for l2: "+l2.getY());

            l1 = l2 ;

            System.out.println("value of x for l1: "+l1.getX()+" Value of y for l1: "+l1.getY());

            System.out.println("value of locationType is: "+ Location.locationType); // just like Math.sqrt();

            System.out.println("value of locationType is: "+l1.locationType);
            System.out.println("value of locationType is: "+l2.locationType);

            l1.locationType = "ab";


            Profile.updateProfile();

            System.out.println("value of locationType is: "+Location.locationType); // just like Math.sqrt();
            System.out.println("value of locationType is: "+l1.locationType);
            System.out.println("value of locationType is: "+l2.locationType);



            Buyer buyer1  = new Buyer("kingMan234");

            Admin admin1 = new Admin("Mohan345");

            Object obj1 = new Admin("someUsername");
            Object obj2 = new User("someUsername");
            Object obj3 = new Buyer("someOtherUser");

            Profile profile1 = new User("someUSernew");
            Profile profile2 = new Admin("kinguser");

            String userAnimalInput="";

            Animal myAnimal = null;
            Scanner animalScanner = new Scanner(System.in);
            System.out.println("Which Animal do you want to create? : ");
            userAnimalInput = animalScanner.next(); // read another line

            switch (userAnimalInput)
            {
                case "dog" : myAnimal = new Dog(); break;
                case "cat" : myAnimal = new Cat(); break;
                case "cow" : myAnimal = new Cow(); break;
                case "goat" : myAnimal = new Goat(); break;
                case "lion" : myAnimal = new Lion(); break;
                case "hyena" : myAnimal = new Hyena(); break;
                default: myAnimal = new Animal();break;
            }

            // Animal myAnimal = new Hyena(); // Polymorphism | HardCoding

            System.out.println("The Animal Says: "+myAnimal.speak());
            System.out.println("Will the Animal Obey: "+myAnimal.willYouObey());

            Exception exception = new Exception();
            Error error = new Error();
            RuntimeException runtimeException = new RuntimeException();
        }

        int i = 78;
        Integer iObj = new Integer(78);
        Float fObj = iObj.floatValue(); // new Float(78.0) - Autoboxing
        float f = fObj; // Unboxing

        Character cObj = 'c'; // Autoboxing
        char c = cObj.charValue(); // Unboxing

        Boolean bObj = true; // Autoboxing
        boolean b = bObj;  // Unboxing

        System.out.println("Enter a number :" );
        Scanner numScanner = new Scanner(System.in);
        String num1 = numScanner.next();


        System.out.println("Enter another number :" );
        String num2 = numScanner.next();

        int pnum1 = Integer.parseInt(num1);
        int pnum2 = Integer.parseInt(num2);

        System.out.println("sum of these two numbers is :"+ (pnum1+pnum2)); // string concatenation

        String testString = new String("Test String");
        String testString2 = "test string 2"; // abbreviated

        String s1 = "Hello World";
        String s2 = "Hello TCS";
        String s3 = s1 + s2;

        s3.length();

        System.out.println(s3.substring(6,16));

        int num7 = 678;

        String numS = String.valueOf(num7); // convert any primitive data to string

        Float.valueOf(numS); // conversion from String to Numeric Data

        StringBuilder sb1 = new StringBuilder("Hello World");
        sb1.append(" This is a new day");

        String inum = "good morning";
        String jnum = "good morning";

        Location testl1 = new Location(2,3);
        Location testl2 = new Location(2,3);

        inum.equals(jnum);

        if( testl1.equals(testl2) )
        {
            System.out.println("The two numbers are equal with hashes "+testl1.hashCode()+" "+testl2.hashCode());
        }
        else
        {
            System.out.println("The two numbers are unequal with hashes "+testl1.hashCode()+" "+testl2.hashCode());
        }


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write("This is from the Buffered Writer");
        bufferedWriter.flush();

        System.out.println();

        PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
        writer.write("some string from the Print Writer");
        writer.flush();
    }

    static int addTwoInts (int num1, int num2) // Method Definition | With Parameters
    {
        //Entry Point
        //Method Body
        int sumNum4;

        int result = num1 + num2;
        return result;  // Exit Point
    }

    static int add(int x, int y)
    {
        return x + y;
    }

    static float add(float x, float y)
    {
        return x + y;
    }

    static double addTwoFrcns (double num1, double num2)
    {
        double result = num1 + num2; // declaration, instantiation (on the left) and initialization (on the right) all in one line
        return result;
    }

    static int addArrElmnts (int[] intArr)
    {
        int result = 0 ;   // declared and initialized a variable
        for(int i = 0; i<intArr.length; i++)
        {
            int sumNum5;
            result = result + intArr[i]; // i=0,1,2,3,4... (length-1)
        }
        return result;
    }

    static int incrementInt(int i)
    {
        return ++i; // increments the integer value by 1
    }

    static int decrementInt(int i)
    {
        return --i; // increments the integer value by 1
    }

    static int operateConditionally(int num1, int num2)
    { // EntryPoint

        int result = 0;

        if(num1 <= 10) // multiplication
        {
            result = num1 * num2;
        }
        else if (num1 > 10 && num1 <= 100) //addition
        {
            result = num1 + num2;
        }
        else if (num1 > 100 && num1 <= 500) // subtraction
        {
            result = num1 - num2;
        }
        else if (num1 > 500) // division
        {
            result = num1 / num2;
        }

        return result; // ExitPoint
    }

    static int conditionalOperatorSwitch(int num1, int num2, char operator) // a,m,d,s
    {

        int result=0;

        switch (operator)
        {
            case 'a': result = num1 + num2; break;
            case 'm': result = num1 * num2; break;
            case 'd': result = num1 / num2; break;
            case 's': result = num1 - num2; break;
            default: result = 0;
        }


        return result;
    }

    static float findMaxTemperatureCity(float[][] temptrValues, String cityName)
    {
        //Entry Point

            //float result = 0.0f;
            int cityIndex = 0;
            float tempValue = 0.0f;

        switch (cityName)
        {
            case "mumbai"   : cityIndex = 0; break;
            case "delhi"    : cityIndex = 1; break;
            case "bengaluru": cityIndex = 2; break;
            case "chennai"  : cityIndex = 3; break;
            case "kolkata"  : cityIndex = 4; break;
            case "munich"   : cityIndex = 5; break;
            default: cityIndex = 0;
        }
        //tempValue = temptrValues[cityIndex][0];

        //for( int i = 0 ;  i < temptrValues[cityIndex].length ; i++)
       // { // For Block will be executed as long as the condition specified above is satisfied
           // if(tempValue < temptrValues[cityIndex][i])
           // {
             //   tempValue = temptrValues[cityIndex][i];
           // }
       // }

        int whileCntr = 0;



            do {
               {
                    if (tempValue < temptrValues[cityIndex][whileCntr])
                    {
                        tempValue = temptrValues[cityIndex][whileCntr];
                        return 0.0f;
                    }
                    whileCntr++;
                }
            }
            while (whileCntr < temptrValues[cityIndex].length);


        return tempValue; // Exit Point
    }

    static double calcDistance(Location l1, Location l2)
    {
        double result = 0.0f;

        result = Math.sqrt( (l1.getX() - l2.getX())*(l1.getX() - l2.getX()) + (l1.getY() - l2.getY())*(l1.getY() - l2.getY()) );

        return result;
    }





}




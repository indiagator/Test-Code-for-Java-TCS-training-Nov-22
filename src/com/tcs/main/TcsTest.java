package com.tcs.main;

import com.tcs.side.Buyer;
import com.tcs.side.CafeCoffeeDay;
import com.tcs.side.Location;
import com.tcs.side.User;

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

    public static void main (String... args) // will start from the main method (Entry Point)
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





        }


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




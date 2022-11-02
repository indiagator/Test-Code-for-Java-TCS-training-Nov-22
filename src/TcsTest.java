


/** This is the First Test Class that was written for TCS Java Training */
public class TcsTest // this is the Application's Main class
{

    int someNum;

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

    public static void main (String[] args) // will start from the main method (Entry Point)
    {

        int sumNum3;

        { // Independent Block | Method | Class
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

            System.out.println("sum of array elements is " + addArrElmnts(numArr)); // Method Invocation


        }


    }

    static int addTwoInts (int num1, int num2) // Method Definition
    {
        //Entry Point
        //Method Body

        int sumNum4;

        int result = num1 + num2;
        return result;  // Exit Point
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


    int sumNum2;

}




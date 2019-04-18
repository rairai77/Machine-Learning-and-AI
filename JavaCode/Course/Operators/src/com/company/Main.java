package com.company;

public class Main {

    public static void main(String[] args) {
	    // Addition
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        //Subtraction
        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        //Multiplication
        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        //Division
        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        //Remainder
        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 10 = " + result);

        //Adding 1
        result++;
        System.out.println("Result is now " +  result);

        //Subtracting 1
        result--;
        System.out.println("Result is now " +  result);

        //Abbreviated addition
        result += 2;
        System.out.println("Result is now " + result);

        // Abbreviated subtraction
        result -= 2;
        System.out.println("Result is now " + result);

        // Abbreviated multiplication
        result *= 2;
        System.out.println("Result is now " + result);

        //Abbreviated division
        result /= 2;
        System.out.println("Result is now " + result);

        // Abbreviated remainder
        result %= 3;
        System.out.println("Result is now " + result);

        //== operator is used for comparisons Equal To
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("it is not an alien!");

        //!= is used for comparisons  Not Equal To
        int topScore = 80;
        if(topScore != 100)
            System.out.println("You didn't get the top score");

        // In the same way as != and == you can use:
        //  < Less Than, > Greater Than, <= Less Than Or Equal To, >= Greater than or Equal To

        // && means and
        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than secondTopScore and less then 100");

        // or is ||
        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("one of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is valid, if I had put 1 equal sign it would've been an error");

        boolean isCar = false;
            if(isCar == true)
                System.out.println("this is nto supposed to happen");

        // Short-cut for if is car was true set it to true else set it to false
        boolean wasCar = isCar ? true: false;
        if(wasCar)
            System.out.println("wasCar is true");

        //CHALLENGE
        double myDouble = 20;
        double mySecondDouble = 80;
        double total = (myDouble + mySecondDouble)*25;
        System.out.println("Total = " + total);
        total %= 40;
        System.out.println("Remainder = " + total);
        if(total <= 20)
            System.out.println("Total was over the limit");


    }
}

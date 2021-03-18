package org.campus02.rekursion;

public class DigitSumRecursiveDemoApp {

    public static void main(String[] args) {
        // Ziffernsumme

        System.out.println("getDigitSum(12345) = " + getDigitSum(12345));
    }

    // create a recursive getDigitSum out of this code
    /*
        1. Think about stop condition
        2. Think about the tiny solution / what do you need to do for a single number (like 8)
            123456 => 8 / 5
            getDigitSum(8) => getDigitSum(5) => getDigitSum(9) // Einstellige Zahlen
        3. What is the task of the method
     */
    public static int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static int power(int a, int b) {
        /* calculate a exp b (a hoch b) with a recursion */
        return 0;
    }

    public static int multiplicate(int a, int b) {
        /* Multiplicate a * b, but just do it with + and recursion */
        return 0;
    }

}

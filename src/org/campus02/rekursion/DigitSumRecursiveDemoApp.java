package org.campus02.rekursion;

public class DigitSumRecursiveDemoApp {

    public static void main(String[] args) {
        // Ziffernsumme

        System.out.println("getDigitSum(8) = " + getDigitSum(8));
        System.out.println("getDigitSum(5) = " + getDigitSum(5));
        System.out.println("getDigitSum(1234567) = " + getDigitSum(1234567));
        System.out.println("getDigitSum(12345) = " + getDigitSum(12345));
        System.out.println("getDigitSumLimited(12345) = " + getDigitSumLimited(12345));
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
        if (number < 10)    // stop condition
            return number;
        else{
            int lastNumber = number % 10;   // 1234567 => 7
            number = number / 10; // 1234567 => 123456
            return lastNumber + getDigitSum(number);    // recursive call
        }
    }

    public static int getDigitSumLimited(int number) {
        if (number < 10) return number;
        return number % 10 + getDigitSumLimited(number / 10);
    }

    public static int power(int a, int b) {
        /* calculate a exp b (a hoch b) with a recursion */
        /* a = 2, b = 3 => 2 * 2 * 2 = 8
           a = 2, b = 4 => 2 * 2 * 2 * 2 = 16
         */
        return 0;
    }

    public static int multiplicate(int a, int b) {
        /* Multiplicate a * b, but just do it with + and recursion */
        return 0;
    }

}

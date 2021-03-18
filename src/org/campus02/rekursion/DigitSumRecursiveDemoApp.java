package org.campus02.rekursion;

public class DigitSumRecursiveDemoApp {

    public static void main(String[] args) {
        // Ziffernsumme

        System.out.println("getDigitSum(8) = " + getDigitSum(8));
        System.out.println("getDigitSum(5) = " + getDigitSum(5));
        System.out.println("getDigitSum(1234567) = " + getDigitSum(1234567));
        System.out.println("getDigitSum(12345) = " + getDigitSum(12345));
        System.out.println("getDigitSumLimited(12345) = " + getDigitSumLimited(12345));

        System.out.println("power(2,4) = " + power(2,4));
        System.out.println("power(3,3) = " + power(3,3));
        System.out.println("power(4,4) = " + power(4,4));
        System.out.println("power(5,3) = " + power(5,3));

        System.out.println("multiplicate(5, 4) = " + multiplicate(5, 4));
        System.out.println("multiplicate(7, 4) = " + multiplicate(7, 4));
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
        /* a = 2, b = 3 => power (2, 3) = 2 * power(2, 2) => 2 * (2 * power(2, 1)) => 2 * (2 * 2)
           a = 2, b = 4 => 2 * 2 * 2 * 2 = 16

           x hoch 1 => x => Abbruchbedingung

         */
        if (b < 2)
            return a;

        return a * power(a, b - 1);
    }

    public static int multiplicate(int a, int b) {
        /* Multiplicate a * b, but just do it with + and recursion */

        if (b >= 1 && a >= 1)
            return a + multiplicate(a, b - 1); // 5 x 4 = a + a + a + a => 5 + 5 + 5 + 5 + 0

        return 0;
    }

}

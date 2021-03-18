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
}

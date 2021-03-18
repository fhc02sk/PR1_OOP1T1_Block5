package org.campus02.wiederholung;

public class PerfectNumbersDemoApp {

    // Summe der echten Teiler einer Zahl wissen
    //  6 => 1 + 2 + 3
    // 28 => 1 + 2 + 4 + 7 + 14
    // klein
    // writing, one method, which calculates the sum of real divisors
    /*
        => 1. Do we have a return values? If yes, think about datatype, if NO return is void
        => 2. Think about name
        => 3. What does the method needs from caller to fulfill the job
     */

    public static void main(String[] args) {
/*        System.out.println("isPerfectNumber(5) = " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(6) = " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(27) = " + isPerfectNumber(27));
        System.out.println("isPerfectNumber(28) = " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(29) = " + isPerfectNumber(29));
        System.out.println("isPerfectNumber(33550336) = " + isPerfectNumber(33550336));
        System.out.println("isPerfectNumber(33550335) = " + isPerfectNumber(33550335));*/
        for (int i = 1; i < 100_000_000; i++) {
            if (isPerfectNumber(i) == true){
                System.out.println(i + " is a perfect number!");
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number == calculateSumRealDivisors(number)) {
            return true;
        }

        return false;
    }

    public static int calculateSumRealDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}

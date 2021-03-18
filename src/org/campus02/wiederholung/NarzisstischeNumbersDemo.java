package org.campus02.wiederholung;

public class NarzisstischeNumbersDemo {

    // 153 = 1exp3 + 5exp3 + 3exp3 => 1, 5, 3
    // 4 exp 3 => 4 * 4 * 4

    // 153 % 10 = 3 <=
    // 153 / 10 = 15
    // 15 % 10 = 5 <=
    // 15 / 10 = 1
    // 1 % 10 = 1 <=
    // 1 / 10 = 0 (we are finished)

    public static void main(String[] args) {
        System.out.println("isNarcissisticNumber(153) = " + isNarcissisticNumber(153, 3));
        System.out.println("isNarcissisticNumber(152) = " + isNarcissisticNumber(152, 3));
        System.out.println("isNarcissisticNumber(407) = " + isNarcissisticNumber(407, 3));

        for (int exp = 3; exp <= 8; exp++) {
            System.out.println();
            System.out.print(exp + ": ");
            for (int i = 1; i < 30_000_000; i++) {
                if (isNarcissisticNumber(i, exp)) {
                    System.out.print(i + ", ");
                }
            }
        }
    }

    public static boolean isNarcissisticNumber(int number, int exp) {
        int sum = 0;
        int originalValue = number;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            sum = sum + (int)Math.pow(digit, exp);
            //sum = sum + (digit * digit * digit);
        }
        if (sum == originalValue) {
            return true;
        }
        return false;
    }
}

package org.campus02.rekursion;

public class DemoRekursion2App {

    public static void main(String[] args) {

        reduce(99, 28);
    }

    public static void reduce(int value, int stopvalue) {
        /*
            1. Think about stop condition / Abbruchbedingung
         */

        System.out.println(value); // Arbeit / job of our recursion

        if (value == 0 || value == stopvalue)   // stop condition
            return;

        reduce(value - 1, stopvalue);   // recursive call

    }

    public static void reduce2(int value, int stopvalue) {
        System.out.println(value); // Arbeit / job of our recursion
        value--;
        if (value >= stopvalue)   // stop condition
            reduce2(value, stopvalue);   // recursive call
    }
}

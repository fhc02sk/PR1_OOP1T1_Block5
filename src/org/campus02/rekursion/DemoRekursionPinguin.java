package org.campus02.rekursion;

public class DemoRekursionPinguin {

    public static void main(String[] args) {
        lesen(">");
    }

    public static void lesen(String indent) {
        System.out.println(indent + "Der Pinguin schlug die Zeitung auf und da stand");
        lesen("-" + indent);
    }


}

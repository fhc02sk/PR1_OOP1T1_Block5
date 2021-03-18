package org.campus02.linkedlist;

public class DemoLinkedListApp {
    public static void main(String[] args) {

        Node wagon1 = new Node();
        wagon1.value = 3;
        Node wagon2 = new Node();
        wagon2.value = 7;

        // wir hängen an den wagon1, zweiten wagon dran
        wagon1.next = wagon2;

        System.out.println("wagon1.value = " + wagon1.value);
        System.out.println("wagon2.value = " + wagon2.value);
        System.out.println("wagon1.next = " + wagon1.next);
        System.out.println("wagon1.next.value = " + wagon1.next.value);
        System.out.println("wagon2.next = " + wagon2.next);
        System.out.println("wagon1 = " + wagon1);
        System.out.println("wagon2 = " + wagon2);

        System.out.println("wagon2.next.value = " + wagon2.next.value);

    }
}

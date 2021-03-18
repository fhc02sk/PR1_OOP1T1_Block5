package org.campus02.linkedlist;

public class TrainDemoApp {
    public static void main(String[] args) {

//        int[] arr = new int[30];

        LinkedList linkedList = new LinkedList();
        // first / last == null

        linkedList.add(5);
        // etwas später
        linkedList.add(37);
        // etwas später
        linkedList.add(19);
        linkedList.add(58);
        linkedList.add(23);
        linkedList.add(77);
        linkedList.add(13);
        linkedList.add(87);

        linkedList.printAllNodes();

        System.out.println();
        System.out.println("linkedList.containsValue(87) = " + linkedList.containsValue(87));
        System.out.println("linkedList.containsValue(77) = " + linkedList.containsValue(77));
        System.out.println("linkedList.containsValue(99) = " + linkedList.containsValue(99));
        System.out.println("linkedList.containsValue(5) = " + linkedList.containsValue(5));


        System.out.println("linkedList.getAt(3) = " + linkedList.getAt(3).value);
        System.out.println("linkedList.getAt(5) = " + linkedList.getAt(5).value);
        System.out.println("linkedList.getAt(8) = " + linkedList.getAt(8).value);
        System.out.println("linkedList.getAt(10) = " + linkedList.getAt(10));

        linkedList.printAllNodes();
        System.out.println();
        linkedList.deleteAt(3);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.deleteAt(1);
        linkedList.printAllNodes();
        System.out.println();

        linkedList.deleteAt(6);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.add(74);
        linkedList.printAllNodes();
        System.out.println();


        linkedList.addElement(3, 22);
        linkedList.printAllNodes();
        System.out.println();

        linkedList.addElement(1, 1);
        linkedList.printAllNodes();
        System.out.println();

        linkedList.addElement(9, 99);
        linkedList.printAllNodes();
        System.out.println();

        linkedList.add(199);
        linkedList.printAllNodes();
        System.out.println();

        linkedList.changeValue(4, 25);
        linkedList.printAllNodes();
        System.out.println();
    }
}

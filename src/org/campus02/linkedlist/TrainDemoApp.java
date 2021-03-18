package org.campus02.linkedlist;

public class TrainDemoApp {
    public static void main(String[] args) {

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

        linkedList.printAllNodes();
    }
}

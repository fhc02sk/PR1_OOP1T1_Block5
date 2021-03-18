package org.campus02.linkedlist;

// Management of our train / linked list
public class LinkedList {
    Node first; // head, start, begin
    Node last; // tail, end

    public void add(int value) {
        Node newWagon = new Node();
        newWagon.value = value;

        if (first == null) {
            // we have an empty train
            first = newWagon;
            last = newWagon;
        }
        else {
            last.next = newWagon; // wir hängen wagon hinten dran
            last = newWagon;
        }
    }

    // should print out all nodes to console
    public void printAllNodes(){
        Node current = first;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }

    // suche => returns Index if value is on the train, return -1 if value is
    // not on the train
    public int containsValue(int value) {
        Node current = first;
        int index = 1;
        while (current != null){
            if (current.value == value){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // delete
    // einfügen an bestimmter stelle
    // changeValue
}

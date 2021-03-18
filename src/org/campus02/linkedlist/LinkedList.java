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

    public Node getAt(int position) {
        Node current = first;
        int index = 1;
        while (current != null){
            if (position == index) {
                return current;
            }
            current = current.next;
            index++;
        }
        return null;
    }

    // we like remove/delete a node at position (1)
    public void deleteAt(int position){
        // 37 auf 58
        Node current = first;
        int index = 1;
        position = position - 1;
        if (position == 0)
        {
            first = first.next;
            current.next = null;
        }
        else {
            while (current != null) {
                if (position == index) {
                    // hier müssen wir was tun
                    // current = 37 // current.next = 19
                    Node deleteNode = current.next; // 19
                    current.next = deleteNode.next; /* current.next (19).next (58) */

                    deleteNode.next = null; // damit unser node nicht mehr auf den nächsten zeigt

                    if (deleteNode == last){ // bin ich am letzten Knoten
                        // last manipulieren
                        last = current;
                    }
                    break;
                }

                current = current.next;
                index++;
            }
        }
    }

    // delete
    // einfügen an bestimmter stelle
    // changeValue
}

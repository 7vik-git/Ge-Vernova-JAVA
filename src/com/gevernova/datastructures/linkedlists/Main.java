package com.gevernova.datastructures.linkedlists;

public class Main {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertAtStart(8);
//        list1.showLinkedList();
        list1.insertAtStart(12);
        list1.insertAtStart(5);
        list1.insertAtStart(17);
        list1.insertAtStart(3);
        list1.insertAtStart(6);
        list1.insertAtIndex(2, 2);
        list1.showLinkedList();
        list1.insertAtEnd(15);
        list1.removeNode(2);
        list1.showLinkedList();
        int x =list1.getElementAtIndex(4);
        System.out.println(x);
    }
}

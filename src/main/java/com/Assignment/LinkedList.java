package com.Assignment;

public class LinkedList<K> {

    MyMapnode head;
    MyMapnode tail;

    public MyMapnode search(K key) {
        MyMapnode tempNode = head;
        while (tempNode !=null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            } else {
                tempNode = tempNode.getNext();
            }
        }
        return null;
    }

    public void append(MyMapnode mapNode) {
        if (head == null) {
            head = mapNode;
            tail = mapNode;
        }
        else{
            this.tail.setNext(mapNode);
            this.tail=mapNode;
        }
    }
}

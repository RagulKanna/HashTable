package com.Assignment;


public class MyMapnode<K, V> {
    private K key;
    private V value;
    private MyMapnode<K, V> next;

    public MyMapnode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;

    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyMapnode<K, V> getNext() {
        return next;
    }

    public void setNext(MyMapnode<K, V> next) {
        this.next = next;
    }
}

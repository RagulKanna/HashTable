package com.Assignment;

public class HashTable<K, V> {
    LinkedList<K> linkedList;

    public HashTable() {
        linkedList = new LinkedList<>();
    }

    public V get(K key) {
        MyMapnode<K,V> mapNode=this.linkedList.search(key);
        if(mapNode==null)
            return null;
        else
            return mapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapnode mapNode=this.linkedList.search(key);
        if(mapNode==null){
            mapNode=new MyMapnode(key,value);
            this.linkedList.append(mapNode);
        }else
            mapNode.setValue(value);

    }
}

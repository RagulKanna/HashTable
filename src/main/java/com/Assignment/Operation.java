package com.Assignment;

import java.util.Locale;

public class Operation {

    public static void findfrequency() {
        String sentence = "To be or not to be";
        HashTable hashtable = new HashTable();

        String words[] = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value=(Integer)hashtable.get(word);
            if(value==null){
                value=1;
            }else {
                value=value+1;
            }
            hashtable.add(word,value);
        }
        for(String word:words) {
            Integer frequency = (Integer) hashtable.get(word);
            System.out.println("Key "+word+" - frequency: " + frequency);
        }
    }
}

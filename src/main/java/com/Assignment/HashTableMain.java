package com.Assignment;

import java.util.Scanner;

public class HashTableMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nUsecase-1 To find frequency of words in 'To be or not to be'");
        System.out.println("Enter the use case to do operation :");
        switch (scan.nextInt()) {
            case 1:
                Operation.findfrequency();
                break;
        }
    }
}

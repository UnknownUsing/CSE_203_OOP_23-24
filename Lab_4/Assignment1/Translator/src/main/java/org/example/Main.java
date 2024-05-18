package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary d1 = new Dictionary();
        System.out.print("Enter word to look up: ");
        String check = sc.nextLine();
        d1.addWord();
        if (d1.checkDictionary(check)){
            d1.findMeaning(check);
        }
    }

}
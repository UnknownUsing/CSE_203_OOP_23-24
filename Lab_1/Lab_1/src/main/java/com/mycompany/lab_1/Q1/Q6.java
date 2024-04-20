/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_1.Q1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Q6 {
    String input;

    public Q6() {
    }

    public Q6(String input) {
        this.input = input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    public int lengthOfString(){
        return input.length();
    }
    
    public int numberOfWord(){
        if (input == null || input.isEmpty()){
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }
    
    public void concatenate(){
        Scanner reader = new Scanner(System.in);
        String input2 = reader.nextLine();
        System.out.println(input + input2);
    }
    
    public String palindrome(){
        String check = input.replaceAll("\\s","");
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) != check.charAt(check.length() - i - 1)) {
                return "false";
            }
        }
        return "true";
    }
}

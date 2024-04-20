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
public class Q1 {
    private int number;
    
    public Q1(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Q1() {
    }
    
    public int sumFirstLast(){
        int lastDigit = number % 10;
        int digits = (int)Math.log10(number);
        int firstDigit = (int)(number / Math.pow(10, digits));
        int sum = lastDigit + firstDigit;
        return sum;
    }
}


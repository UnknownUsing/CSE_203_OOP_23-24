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
public class Q4 {
    private int[] array;
    private int length;

    public Q4() {
    }

    public Q4(int[] array, int length) {
        this.array = array;
        this.length = length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public void arrayInput(){
        Scanner reader = new Scanner(System.in);
        this.array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = reader.nextInt();
        }
    }
    
    public int evenSum(){
        int sum = 0;
        for (int element : array) {
            if (element %  2 == 0) {
                sum += element;
            }
        }
        return sum;
    }
}


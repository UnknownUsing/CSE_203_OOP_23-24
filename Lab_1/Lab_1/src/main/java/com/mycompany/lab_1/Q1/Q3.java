/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_1.Q1;

/**
 *
 * @author Student
 */
public class Q3 {
    private int number;

    public Q3() {
    }

    public Q3(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public void hailstoneSequence(){
        while (number != 1) {            
            if (number % 2 == 0) {
                System.out.println(number+" is even, so we take n/2 = "+ number / 2);
                number /= 2;
            } else{
                System.out.println(number+" is odd, so we take 3*n + 1 = "+(number*3 + 1));
                number =(number*3) + 1;
            }
        }
    }
}

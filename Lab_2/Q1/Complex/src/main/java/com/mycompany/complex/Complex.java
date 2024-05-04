/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complex;

/**
 *
 * @author Student
 */
public class Complex {

    public static void main(String[] args) {
        ComplexNumber comx1 = new ComplexNumber();
        ComplexNumber comx2 = new ComplexNumber();
        comx1.inputComplex();
        comx2.inputComplex();
        comx1.addComplexNumber(comx2).outputComplex();
        comx1.subComplexNumber(comx2).outputComplex();
        comx1.multiComplexNumber(comx2).outputComplex();
    }
}

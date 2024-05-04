/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complex;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ComplexNumber {
    private double real;
    private double image;

    public ComplexNumber() {
    }

    public ComplexNumber(int real, int image) {
        this.real = real;
        this.image = image;
    }
    
    public void inputComplex(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Input real part: ");
        real = reader.nextDouble();
        System.out.print("Input image part: ");
        image = reader.nextDouble();
    }
    
    public void outputComplex(){
        System.out.println(real + " + " + image + "i");
    }
    
    public ComplexNumber addComplexNumber(ComplexNumber n2){
        ComplexNumber result = new ComplexNumber(0,0);
        result.real = this.real + n2.real;
        result.image = this.image + n2.image;
        return result;
    }
    
    public ComplexNumber subComplexNumber(ComplexNumber n2){
        ComplexNumber result = new ComplexNumber(0,0);
        result.real = this.real - n2.real;
        result.image = this.image - n2.image;
        return result;
    }
    
    public ComplexNumber multiComplexNumber(ComplexNumber n2){
        ComplexNumber result = new ComplexNumber(0,0);
        result.real = (this.real*n2.real - this.image*n2.image);
        result.image = (this.real*n2.image + this.image*n2.real);
        return result;
    }
    
}

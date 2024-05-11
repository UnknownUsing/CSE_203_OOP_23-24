/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrmanagement1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class FullTimeEmployee extends Employee {
    private static Scanner reader = new Scanner(System.in);
    
    protected double salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    public FullTimeEmployee(double salary, String employeeID, String employeeName, int yearOfBirth, String addresss, String phoneNumber) {
        super(employeeID, employeeName, yearOfBirth, addresss, phoneNumber);
        this.salary = salary;
    }
    
    
    
    public void inputFullTimeInfo(){
        super.inputInfo();
        System.out.print("Enter Salary: ");
        salary = reader.nextDouble();
    }
    
    public void outputFullTimeInfo(){
        super.outputInfo();
        System.out.println("Salary: "+salary);
    }   
    
    public void edit(){
        super.edit();
        System.out.print("Enter Salary: ");
        salary = reader.nextDouble();
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public double getPayment() {
        return salary;
    }
    
}

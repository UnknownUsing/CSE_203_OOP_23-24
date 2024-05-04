/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manageemployeessalaries;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Employees {
    static Scanner reader = new Scanner(System.in);
    
    private String employeeCode;
    private String employeeFullName;
    private int yearsOfService;
    private double salaryCoefficien;
    private double basicSalary;
    private double salary;

    public Employees() {
        
    }

    public Employees(String employeeCode, String employeeFullName, int yearsOfService, double salaryCoefficien, double basicSalary) {
        this.employeeCode = employeeCode;
        this.employeeFullName = employeeFullName;
        this.yearsOfService = yearsOfService;
        this.salaryCoefficien = salaryCoefficien;
        this.basicSalary = basicSalary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public double getSalary() {
        return salary;
    }
    
     
    public void inputInfo(){
        System.out.println("Enter employee code: ");
        employeeCode = reader.nextLine();
        System.out.println("Enter employee full name: ");
        employeeFullName = reader.nextLine();
        System.out.println("Enter years of service: ");
        yearsOfService = reader.nextInt();
        System.out.println("Enter salary coefficien: ");
        salaryCoefficien = reader.nextDouble();
        System.out.println("Enter basic salary: ");
        basicSalary = reader.nextDouble();
        reader.nextLine();
    }
    
    public void outputInfo(){
        System.out.println("Employee code: " + employeeCode);
        
        System.out.println("Full name: " + employeeFullName);

        System.out.println("Years of service: " + yearsOfService);

        System.out.println("Salary coefficien: " + salaryCoefficien);

        System.out.println("Basic salary: " + basicSalary);
    }
    
    public void outputSalary(){
        System.out.println("Name: " + employeeFullName);
        System.out.println("Employee Code: "+employeeCode);
        System.out.println("Salary: "+salary);
    }
    
    
    public double salary(){
        salary = salaryCoefficien * basicSalary;
        return salary;
    }
    
    
    
}

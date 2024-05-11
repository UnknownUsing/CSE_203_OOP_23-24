package com.mycompany.hrmanagement1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Student
 */
public abstract class Employee {
    private static Scanner reader = new Scanner(System.in);
    
    private String employeeID;
    private String employeeName;
    private int yearOfBirth;
    private String addresss;
    private String phoneNumber;
    


    public Employee() {
    }

    public Employee(String employeeID, String employeeName, int yearOfBirth, String addresss, String phoneNumber) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.yearOfBirth = yearOfBirth;
        this.addresss = addresss;
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    
    
    
    
    public void inputInfo(){
        System.out.print("Enter ID: ");
        employeeID = reader.nextLine();
        System.out.print("Enter Name: ");
        employeeName = reader.nextLine();
        System.out.print("Enter Year Of Birth: ");
        yearOfBirth = reader.nextInt();
        reader.nextLine();
        System.out.print("Enter Address: ");
        addresss = reader.nextLine();
        System.out.print("Enter Phone Number: ");
        phoneNumber = reader.nextLine();
    }
    
    public void outputInfo(){
        System.out.println("ID: " + employeeID);
        System.out.println("Name: "+ employeeName);
        System.out.println("Year Of Birth: " + yearOfBirth);
        System.out.println("Address: " + addresss);
        System.out.println("Phone Number: "+phoneNumber);
    }
    
    public void edit(){
        System.out.print("Enter Name: ");
        employeeName = reader.nextLine();
        System.out.print("Enter Year Of Birth: ");
        yearOfBirth = reader.nextInt();
        reader.nextLine();
        System.out.print("Enter Address: ");
        addresss = reader.nextLine();
        System.out.print("Enter Phone Number: ");
        phoneNumber = reader.nextLine();
    }
    
   public abstract String getInfo();
   
   public abstract double getPayment();
}

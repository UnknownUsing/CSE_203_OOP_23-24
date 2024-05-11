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
public class PartTimeEmployee extends Employee {

    static private Scanner reader = new Scanner(System.in);

    private int workingHour;
    private double payRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int workingHour, double payRate) {
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHour, double payRate, String employeeID, String employeeName, int yearOfBirth, String addresss, String phoneNumber) {
        super(employeeID, employeeName, yearOfBirth, addresss, phoneNumber);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public void inputPartTimeInfo() {
        super.inputInfo();
        System.out.print("Enter Working Hours: ");
        workingHour = reader.nextInt();
        System.out.print("Enter Payrate: ");
        payRate = reader.nextDouble();
    }

    public void outputPartTimeInfo() {
        super.outputInfo();
        System.out.println("Working Hours: " + workingHour);
        System.out.println("Payrate: " + payRate);
    }

    public void edit() {
        super.edit();
        System.out.print("Enter Working Hours: ");
        workingHour = reader.nextInt();
        System.out.print("Enter Payrate: ");
        payRate = reader.nextDouble();
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public double getPayment() {
        return workingHour * payRate;
    }

}

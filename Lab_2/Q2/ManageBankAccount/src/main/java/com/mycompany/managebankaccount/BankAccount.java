/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managebankaccount;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankAccount {
    static Scanner reader = new Scanner(System.in);
    
    private int accNumber;
    private String customerName;
    private double accBalance;

    public BankAccount() {
    }

    public BankAccount(int accNumber, String customerName, double accBalance) {
        this.accNumber = accNumber;
        this.customerName = customerName;
        this.accBalance = accBalance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAccBalance() {
        return accBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accNumber=" + accNumber + ", customerName=" + customerName + ", accBalance=" + accBalance + '}';
    }
    
    
    public void createAcc(){
        System.out.print("Enter Account Number: ");
        accNumber = reader.nextInt();
        System.out.print("Enter Full Name: ");
        customerName = reader.nextLine();
        reader.nextLine();
        System.out.print("Enter Initial Account Balance: ");
        accBalance = reader.nextDouble();
    }
    
    public void outInfoAcc(){
        System.out.println("Account Number: "+this.accNumber);
        System.out.println("Full Name: "+ this.customerName);
        System.out.println("Account Balance: "+this.accBalance);
    }
    
    public void deposit(double depositAmount){
        this.accBalance += depositAmount;
    }
    
    public boolean withdrawal(double withdrawAmount){
        if (accBalance < 0) return false;
        if (withdrawAmount > accBalance) return false;
        this.accBalance -= withdrawAmount;
        return true;
        
    }
    
    public boolean transfer(BankAccount acc2, double transferAmount){
        if (transferAmount <= accBalance) {
            accBalance -= transferAmount;
            acc2.accBalance += transferAmount;
            return true;
        }else{
            return false;
        }
    }
}

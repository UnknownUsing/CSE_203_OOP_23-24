/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.managebankaccount;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ManageBankAccount {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of account you want to create: ");
        int n = reader.nextInt();
        var accArray = new ArrayList<BankAccount>();
        for (int i = 0; i < n; i++) {
            BankAccount acc = new BankAccount();
            acc.createAcc();
            accArray.add(acc);
        }

        for (BankAccount bankAccount : accArray) {
            bankAccount.outInfoAcc();
        }
        //Deposit
        System.out.println("Enter the account number to deposit");
        int accNum = reader.nextInt();
        System.out.println("Enter the deposit amount: ");
        int deposit = reader.nextInt();
        for (BankAccount bankAccount : accArray) {
            if (bankAccount.getAccNumber() == accNum) {
                bankAccount.deposit(deposit);
                bankAccount.outInfoAcc();
                break;
            }
        }
//        //Withdrawal
        System.out.println("Enter the account number to withdrawal");
        int accNum2 = reader.nextInt();
        System.out.println("Enter the withdrawal amount: ");
        int withdrawal = reader.nextInt();
        for (BankAccount bankAccount : accArray) {
            if (bankAccount.getAccNumber() == accNum2) {
                if (bankAccount.withdrawal(withdrawal)) {
                    bankAccount.withdrawal(withdrawal);
                    bankAccount.outInfoAcc();
                    break;
                } else {
                    System.out.println("Cannot withdrawn");
                    break;
                }

            }
        }
        //Transfer
        System.out.println("Enter your account number");
        int accNum3 = reader.nextInt();
        int accIndex = 0;
        System.out.println("Enter the account number you wish to transfer to");
        int accNum4 = reader.nextInt();
        System.out.println("Enter the transfer amount: ");
        int transfer = reader.nextInt();
        for (BankAccount bankAccount : accArray) {
            if (bankAccount.getAccNumber() == accNum3) {
                accIndex = accArray.indexOf(bankAccount);
                break;
            }
        }
        for (BankAccount bankAccount : accArray) {
            if (bankAccount.getAccNumber() == accNum4 && accArray.get(accIndex).transfer(bankAccount, transfer)) {
                accArray.get(accIndex).transfer(bankAccount, transfer);
                accArray.get(accIndex).outInfoAcc();
                bankAccount.outInfoAcc();
                break;
            } else {
                System.out.println("Cannot transfer");
                break;
            }
        }
        
    }
}

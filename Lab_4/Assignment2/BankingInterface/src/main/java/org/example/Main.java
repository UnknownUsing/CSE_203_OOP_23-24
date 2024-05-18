package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Input Bank Name: ");
        String bankNameInput = rd.nextLine();
        Bank bank = BankFactory.getBank(bankNameInput);
        System.out.println(bank.getBankName());

    }
}
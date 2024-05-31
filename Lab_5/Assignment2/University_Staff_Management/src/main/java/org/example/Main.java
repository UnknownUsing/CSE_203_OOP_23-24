package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        StaffManagement staffManagement = new StaffManagement();
        int n;
        do {
            System.out.println("1. Enter list of staff");
            System.out.println("2. Edit staff");
            System.out.println("3. Delete staff");
            System.out.println("4. Calculate total salary of all staff");
            System.out.println("5. Statistics of the total salary of staff by type of staff");
            System.out.println("6. List of the 3 highest paid staff.");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    staffManagement.inputInfo();
                    break;
                case 2:
                    staffManagement.editInfo();
                    break;
                case 3:
                    staffManagement.deleteInfo();
                    break;
                case 4:
                    staffManagement.calcSalaryAll();
                    break;
                case 5:
                    staffManagement.statisticsSalary();
                    break;
                case 6:
                    staffManagement.highestPaidStaff();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (n != 0);
    }
}
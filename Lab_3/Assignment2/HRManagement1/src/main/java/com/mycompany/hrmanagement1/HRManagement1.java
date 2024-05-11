package com.mycompany.hrmanagement1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class HRManagement1 {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    HR manage = new HR();
    int n = 0;
    while (n != 11) {            
        System.out.println("1. Add Full-time Employee");
        System.out.println("2. Add Part-time Employee ");
        System.out.println("3. Show all Full-time Employee");
        System.out.println("4. Show all Part-time Employee");
        System.out.println("5. Show all Employee");
        System.out.println("6. Search Employee by Id");
        System.out.println("7. Delete Employee by Id");
        System.out.println("8. Edit Employee information by Id");
        System.out.println("9. Search Employee by payment");
        System.out.println("10. Sort Full-time Employee and Part-Time employee");
        System.out.println("11. Exit");
        System.out.print("Enter number: ");
        n = reader.nextInt();
        switch (n) {
            case 1:
                manage.addFullTime();
                break;
            case 2:
                manage.addPartTime();
                break;
            case 3:
                manage.outAllFullTime();
                break;
            case 4:
                manage.outAllPartTime();
                break;
            case 5:
                manage.outAll();
                break;
            case 6:
                manage.searchID();
                break;
            case 7:
                manage.deleteID();
                break;
            case 8:
                manage.editID();
                break;
            case 9:
                manage.searchPayment();
                break;
            case 10:
                manage.sort();
                break;
            case 11:
                break;
            default:
                throw new AssertionError();
        }

    }
    }
}

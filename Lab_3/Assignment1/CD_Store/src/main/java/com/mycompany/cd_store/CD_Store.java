/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cd_store;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CD_Store {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ManageCDCatalogue manage = new ManageCDCatalogue();
        int n = 0;
        while (n != 9) {
            System.out.println("1. Add CD");
            System.out.println("2. Search CD by CD title");
            System.out.println("3. Search CDs by collections");
            System.out.println("4. Search CDs by type");
            System.out.println("5. Delete CD by CD Id");
            System.out.println("6. Edit CD information by Id");
            System.out.println("7. Display all CDs");
            System.out.println("8. Sort the CD list ascending by year of release");
            System.out.println("9. Exit");
            System.out.print("Enter number: ");
            n = reader.nextInt();

            switch (n) {
                case 1:
                    manage.addCDArr();
                    break;
                case 2:
                    manage.searchCDTitle();
                    break;
                case 3:
                    manage.searchCDCollection();
                    break;
                case 4:
                    manage.searchCDType();
                    break;
                case 5:
                    manage.deleteCD();
                    break;
                case 6:
                    manage.editCD();
                    break;
                case 7:
                    manage.displayCD();
                    break;
                case 8:
                    manage.sortByYear();
                    break;
                case 9:
                    break;
                default:
                    throw new AssertionError();
            }

        }
    }
}

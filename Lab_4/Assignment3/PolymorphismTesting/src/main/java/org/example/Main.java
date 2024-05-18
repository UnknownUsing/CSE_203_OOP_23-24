package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ManageStudent ms = new ManageStudent();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n != 8){
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Add a new college student");
            System.out.println("2. Add a new university student");
            System.out.println("3. Remove a student from the list with the student code entered from the keyboard.");
            System.out.println("4. Print student list.");
            System.out.println("5. Print the list of students eligible for graduation and indicate the number of eligible students.");
            System.out.println("6. Sort the student list ascending by Student type (College, university) and student code");
            System.out.println("7. Find student list by student's full name (Contains)");
            System.out.println("8.Exit");
            System.out.print("Input number 1-8: ");
            n = sc.nextInt();
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            switch (n){
                case 1: {
                    ms.addCStudent();
                    break;
                }
                case 2: {
                    ms.addUniStudent();
                    break;
                }
                case 3: {
                    ms.removeStudent();
                    break;
                }
                case 4: {
                    ms.outputStudentList();
                    break;
                }
                case 5: {
                    ms.gradStudentOutput();
                    break;
                }
                case 6: {
                    ms.sortArr();
                    break;
                }
                case 7:{
                    ms.search();
                    break;
                }
                case 8: break;
                default:
                    System.out.println("Option does not exist");
            }
        }
    }
}
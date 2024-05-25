package org.example;

import java.util.Scanner;

public abstract class UniversityStaff {
    public static Scanner sc = new Scanner(System.in);
    private String fullname;
    private String dateOfBirth;
    private String idNumber;

    public UniversityStaff() {
    }

    public UniversityStaff(String fullname, String dateOfBirth, String idNumber) {
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
    }

    public void staffInput(){
        System.out.println("---------------------------------------------------");
        System.out.print("Full name:");
        fullname = sc.next();
        System.out.println("Date of birth: ");
        dateOfBirth = sc.next();
        System.out.println("Id number: ");
        idNumber = sc.next();
    }

    @Override
    public String toString() {
        return "-------------------------------"+ "\n" +
                "Full name: " + fullname + '\n' +
                "Date of birth" + dateOfBirth + '\n' +
                "Id Number" + idNumber + '\n';
    }
    public abstract double getSalary();
}

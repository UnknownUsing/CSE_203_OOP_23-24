package org.example;

import java.io.Serializable;
import java.util.Scanner;

public abstract class UniversityStaff implements Serializable {
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

    public String getIdNumber() {
        return idNumber;
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

    public void staffEdit(){
        System.out.println("--------------------------------------------------");
        System.out.print("Full name:");
        fullname = sc.next();
        System.out.print("Date of birth:");
        dateOfBirth = sc.next();
    }

    @Override
    public String toString() {
        return "-------------------------------"+ "\n" +
                "Full name: " + fullname + '\n' +
                "Date of birth" + dateOfBirth + '\n' +
                "Id Number" + idNumber + '\n';
    }

    public abstract void editInfo();
    public abstract double getSalary();
    public abstract int getType();
}

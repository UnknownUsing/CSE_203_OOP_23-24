package org.example;

import java.util.Scanner;

public abstract class Student {
    private String studentNumber;
    private String studentName;
    private int totalCredit;
    private double avgGrade;
    public Student() {
    }

    public Student(String studentNumber, String studentName, int totalCredit, double avgGrade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.totalCredit = totalCredit;
        this.avgGrade = avgGrade;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void inputStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentNumber = sc.next();
        System.out.print("Enter student Name: ");
        studentName = sc.next();
        System.out.print("Enter total credit: ");
        totalCredit = sc.nextInt();
        System.out.print("Enter average grade: ");
        avgGrade = sc.nextDouble();
    }

    public abstract int getType();

    @Override
    public String toString() {
        return
                "---------------------------------------------"+"\n"+
                "Student Number: " + studentNumber + "\n"+
                "Student Name: " + studentName + "\n" +
                "Total Credit: " + totalCredit + "\n" +
                "Average Grade: " + avgGrade + "\n";
    }

    public abstract boolean gradCheck();
}

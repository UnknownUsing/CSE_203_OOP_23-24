package org.example;

import java.io.Serializable;
import java.util.Scanner;

public class UniversityStudent extends Student implements Serializable {
    private String thesisName;
    private double thesisGrade;

    public UniversityStudent() {
    }
    @Override
    public int getType() {
        return 0;
    }
    public UniversityStudent(String studentNumber, String studentName, int totalCredit, double avgGrade, String thesisName, double thesisGrade) {
        super(studentNumber, studentName, totalCredit, avgGrade);
        this.thesisName = thesisName;
        this.thesisGrade = thesisGrade;
    }

    public void inputUniStudent(){
        Scanner sc = new Scanner(System.in);
        super.inputStudent();
        System.out.print("Enter thesis name: ");
        thesisName = sc.next();
        System.out.print("Enter thesis grade: ");
        thesisGrade = sc.nextDouble();
        System.out.println("-----------------------------------------");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Thesis Name: " + thesisName + "\n" +
                "Thesis Grade: " + thesisGrade + "\n";
    }
    @Override
    public boolean gradCheck(){
        return super.getTotalCredit() > 150 && super.getAvgGrade() >= 5 && thesisGrade >= 5;
    }
}

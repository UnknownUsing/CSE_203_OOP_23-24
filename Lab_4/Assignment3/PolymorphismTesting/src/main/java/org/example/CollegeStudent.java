package org.example;

import java.util.Scanner;

public class CollegeStudent extends Student{
    private double gradExamScore;

    @Override
    public int getType() {
        return 1;
    }

    public CollegeStudent() {
    }
    public CollegeStudent(String studentNumber, String studentName, int totalCredit, double avgGrade, double gradExamScore) {
        super(studentNumber, studentName, totalCredit, avgGrade);
        this.gradExamScore = gradExamScore;
    }

    public void inputCStudent(){
        Scanner sc = new Scanner(System.in);
        super.inputStudent();
        System.out.print("Enter graduation exam score: ");
        gradExamScore = sc.nextDouble();
        System.out.println("-----------------------------------------");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Graduation Exam Score: " + gradExamScore +"\n";
    }
    @Override
    public boolean gradCheck(){
        return super.getTotalCredit() > 100 && super.getAvgGrade() >= 5 && gradExamScore >= 5;
    }


}

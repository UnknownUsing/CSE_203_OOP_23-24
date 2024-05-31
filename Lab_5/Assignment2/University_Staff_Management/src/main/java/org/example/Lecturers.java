package org.example;

import java.util.ArrayList;
public class Lecturers extends UniversityStaff{
    private String academicRank;
    private String academicDegree;
    private int yearsOfExperience;
    private int numOfSubject;
    private double lectureSalary;
    private ArrayList<String> subjectList = new ArrayList<>();
    private final int type = 1;

    public Lecturers() {
    }

    public Lecturers(String fullname, String dateOfBirth, String idNumber, String academicRank, String academicDegree, int yearsOfExperience, ArrayList<String> subjectList) {
        super(fullname, dateOfBirth, idNumber);
        this.academicRank = academicRank;
        this.academicDegree = academicDegree;
        this.yearsOfExperience = yearsOfExperience;
        this.subjectList = subjectList;
    }

    public void inputLecture(){
        super.staffInput();
        System.out.print("Academic rank: ");
        academicRank = sc.next();
        System.out.print("Academic degree: ");
        academicDegree = sc.next();
        System.out.print("Year of experience: ");
        yearsOfExperience = sc.nextInt();
        System.out.print("Number of subject teach: ");
        numOfSubject = sc.nextInt();
        for (int i = 0; i < numOfSubject; i++){
            subjectList.add(sc.next());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Academic Rank: " + academicRank + '\n' +
                "Academic Degree: " + academicDegree + '\n' +
                "Years Of Experience: " + yearsOfExperience + "\n" +
                "Subject List: " + subjectList;
    }

    @Override
    public void editInfo() {
        super.staffEdit();
        inputLecture();
    }

    @Override
    public double getSalary(){
        lectureSalary = (numOfSubject * yearsOfExperience * 0.12) * 20000;
        return lectureSalary;
    }

    @Override
    public int getType() {
        return type;
    }
}

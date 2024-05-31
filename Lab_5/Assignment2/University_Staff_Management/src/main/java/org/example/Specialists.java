package org.example;

import java.io.Serializable;
import java.util.ArrayList;

public class Specialists extends UniversityStaff implements Serializable {
    private int yearsOfWorkExp;
    private ArrayList<String> educationalProjects = new ArrayList<>();
    private double specialistSalary;
    private final int type = 4;
    public Specialists() {
    }

    @Override
    public void editInfo() {
        super.staffEdit();
        inputSpecialists();
    }

    public Specialists(String fullname, String dateOfBirth, String idNumber, int yearsOfWorkExp, ArrayList<String> educationalProjects) {
        super(fullname, dateOfBirth, idNumber);
        this.yearsOfWorkExp = yearsOfWorkExp;
        this.educationalProjects = educationalProjects;
    }

    public void inputSpecialists(){
        super.staffInput();
        System.out.print("Years of experience: ");
        yearsOfWorkExp = sc.nextInt();
        System.out.print("Number of educational projects: ");
        int numOfProjects = sc.nextInt();
        for(int i = 0; i < numOfProjects; i++){
            System.out.print("Enter project name: ");
            educationalProjects.add(sc.next());
        }
    }

    @Override
    public double getSalary() {
        int countT = 0;
        for (String project:educationalProjects) {
            if (project.contains("T")){
                countT++;
            }
        }
        specialistSalary = (yearsOfWorkExp*4 + countT)*18000;
        return specialistSalary;
    }
    @Override
    public int getType() {
        return type;
    }


}

package org.example;

import java.io.Serializable;

public class TeachingAssistants extends UniversityStaff implements Serializable {

    private int numOfSubjectAssist;
    private double assistantSalary;
    private final int type = 3;
    public TeachingAssistants() {
    }
    public TeachingAssistants(String fullname, String dateOfBirth, String idNumber, int numOfSubjectAssist) {
        super(fullname, dateOfBirth, idNumber);
        this.numOfSubjectAssist = numOfSubjectAssist;
    }

    public void assistanceInput(){
        super.staffInput();
        System.out.print("Number of subject assist: ");
        numOfSubjectAssist = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Number Of Subject Assist: " + numOfSubjectAssist;
    }

    @Override
    public void editInfo() {
        super.staffEdit();
        assistanceInput();
    }

    @Override
    public double getSalary() {
        assistantSalary = (numOfSubjectAssist * 0.3)*18000;
        return 0;
    }
    @Override
    public int getType() {
        return type;
    }
}

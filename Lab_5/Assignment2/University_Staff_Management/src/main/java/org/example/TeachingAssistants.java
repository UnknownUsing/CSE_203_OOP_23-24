package org.example;

public class TeachingAssistants extends UniversityStaff{

    private int numOfSubjectAssist;
    private double assistantSalary;
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
    public double getSalary() {
        assistantSalary = (numOfSubjectAssist * 0.3)*18000;
        return 0;
    }
}

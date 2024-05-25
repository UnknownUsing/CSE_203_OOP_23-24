package org.example;

import java.util.ArrayList;

public class Resaerchers extends UniversityStaff{
    private int yearsOfResearchExp;
    private ArrayList<String> listOfResearch = new ArrayList<>();

    private double researcherSalary;

    public Resaerchers() {
    }
    public Resaerchers(String fullname, String dateOfBirth, String idNumber, int yearsOfResearchExp, ArrayList<String> listOfResearch) {
        super(fullname, dateOfBirth, idNumber);
        this.yearsOfResearchExp = yearsOfResearchExp;
        this.listOfResearch = listOfResearch;
    }

    public void inputResearcher(){
        super.staffInput();
        System.out.print("Years of research experience: ");
        yearsOfResearchExp = sc.nextInt();
        System.out.print("Number of research: ");
        int numOfResearch = sc.nextInt();
        for(int i = 0; i < numOfResearch; i++){
            System.out.print("Enter research name: ");
            listOfResearch.add(sc.next());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Years Of Research Experience: " + yearsOfResearchExp +
                "List Of Research:" + listOfResearch +
                "Researcher Salary:" + researcherSalary;
    }

    @Override
    public double getSalary() {
        int dCount = 0;
        for (String research: listOfResearch) {
            if (research.contains("D")){
                dCount++;
            }
        }
        researcherSalary = (yearsOfResearchExp * 2 + dCount) * 20000;
        return researcherSalary;

    }
}

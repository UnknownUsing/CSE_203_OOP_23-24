package org.example;

import java.io.*;
import java.util.*;

public class StaffManagement {
    private ArrayList<UniversityStaff> staffArr = new ArrayList<>();
    private ObjectInputStream ois = null;
    private ObjectOutputStream oos = null;
    private BufferedWriter bw = null;
    private FileWriter fw = null;
    private FileOutputStream fos = null;
    private File EIUStaff = new File("EIUStaff.eiu");
    private File TotalSalary = new File("TotalSalary.eiu");
    private File Statistics = new File("Statistics.eiu");
    private File HighestPaidStaff = new File("HighestPaidStaff.eiu");

    public void inputInfo() throws IOException, ClassNotFoundException {
        if (EIUStaff.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(EIUStaff));
            staffArr = (ArrayList<UniversityStaff>) ois.readObject();
            ois.close();
        }
        System.out.println("Enter the number of university staff: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("1. Lectures");
            System.out.println("2. Teaching Assistant");
            System.out.println("3. Researcher");
            System.out.println("4. Specialist");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            switch(option){
                case 1:
                    Lecturers lecturer = new Lecturers();
                    lecturer.inputLecture();
                    staffArr.add(lecturer);
                    break;
                case 2:
                    TeachingAssistants teachingAssistant = new TeachingAssistants();
                    teachingAssistant.assistanceInput();
                    staffArr.add(teachingAssistant);
                    break;
                case 3:
                    Researcher researcher = new Researcher();
                    researcher.inputResearcher();
                    staffArr.add(researcher);
                    break;
                case 4:
                    Specialists specialists = new Specialists();
                    specialists.inputSpecialists();
                    staffArr.add(specialists);
                    break;
                default:
                    System.out.println("Invalid option");
            }
            try {
                oos = new ObjectOutputStream(new FileOutputStream(EIUStaff));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            oos.writeObject(staffArr);
            oos.close();
        }
    }

    public void editInfo() throws IOException, ClassNotFoundException {
        if (EIUStaff.isFile()) {
            boolean found = false;
            ois = new ObjectInputStream(new FileInputStream(EIUStaff));
            staffArr = (ArrayList<UniversityStaff>) ois.readObject();
            ois.close();

            System.out.println("Enter the staff ID number: ");
            Scanner sc = new Scanner(System.in);
            String staffID = sc.next();
            for(UniversityStaff us : staffArr){
                if (us.getIdNumber().equals(staffID)) {
                    found = true;
                    us.editInfo();
                    break;
                }
            }
            if (found){
                oos = new ObjectOutputStream(new FileOutputStream(EIUStaff));
                oos.writeObject(staffArr);
                oos.close();
                System.out.println("Edited Staff ID: " + staffID);
            }else{
                System.out.println("The staff ID " + staffID + " does not exist");
            }
        }else{
            System.out.println("File does not exist");
        }
    }

    public void deleteInfo() throws IOException, ClassNotFoundException {
        if (EIUStaff.isFile()) {
            boolean found = false;
            ois = new ObjectInputStream(new FileInputStream(EIUStaff));
            staffArr = (ArrayList<UniversityStaff>) ois.readObject();
            ois.close();

            System.out.println("Enter the staff ID number: ");
            Scanner sc = new Scanner(System.in);
            String staffID = sc.next();
            for(UniversityStaff us : staffArr){
                if (us.getIdNumber().equals(staffID)) {
                    found = true;
                    staffArr.remove(us);
                    break;
                }
            }
            if (found){
                oos = new ObjectOutputStream(new FileOutputStream(EIUStaff));
                oos.writeObject(staffArr);
                oos.close();
                System.out.println("Deleted the staff ID: " + staffID);
            }else{
                System.out.println("The staff ID " + staffID + " does not exist");
            }
        }else{
            System.out.println("File does not exist");
        }

    }

    public void calcSalaryAll() throws IOException {
        fw = new FileWriter(TotalSalary);
        bw = new BufferedWriter(fw);
        for(UniversityStaff us : staffArr){
            bw.write(Double.toString(us.getSalary()));
            bw.write("\n");
        }
        bw.close();
    }

    public void statisticsSalary() throws IOException{
        fw = new FileWriter(Statistics);
        bw = new BufferedWriter(fw);
        double lSalary = 0;
        double rSalary = 0;
        double taSalary = 0;
        double sSalary = 0;
        for(UniversityStaff us : staffArr){
            switch (us.getType()){
                case 1:
                    lSalary += us.getSalary();
                    break;
                case 2:
                    rSalary += us.getSalary();
                    break;
                case 3:
                    taSalary += us.getSalary();
                    break;
                case 4:
                    sSalary += us.getSalary();
                    break;
                default:
                    break;
            }
        }
        bw.write(Double.toString(lSalary));
        bw.write("\n");
        bw.write(Double.toString(rSalary));
        bw.write("\n");
        bw.write(Double.toString(taSalary));
        bw.write("\n");
        bw.write(Double.toString(sSalary));
        bw.write("\n");
        bw.close();
    }

    public void highestPaidStaff() throws IOException {
        staffArr.sort((s1, s2) -> Double.compare(s2.getSalary(), s1.getSalary()));
        fos = new FileOutputStream(HighestPaidStaff);
        for(int i = 0; i < 3; i++){
            double salary = staffArr.get(i).getSalary();
            fos.write((int) salary);
        }
        fos.close();
    }


}

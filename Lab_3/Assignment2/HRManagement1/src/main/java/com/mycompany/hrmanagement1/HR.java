/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hrmanagement1;
import java.util.*;

/**
 *
 * @author Student
 */
public class HR {

    static private Scanner reader = new Scanner(System.in);

    private ArrayList<FullTimeEmployee> fullTimeArr = new ArrayList<>();
    private ArrayList<PartTimeEmployee> partTimeArr = new ArrayList<>();

    public void addFullTime() {
        System.out.print("Enter Number Of Full time Employees: ");
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            FullTimeEmployee fullem = new FullTimeEmployee();
            fullem.inputFullTimeInfo();
            fullTimeArr.add(fullem);
            System.out.println();
        }
    }
    
    public void addPartTime() {
        System.out.print("Enter Number Of Part time Employees: ");
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            PartTimeEmployee partem = new PartTimeEmployee();
            partem.inputPartTimeInfo();
            partTimeArr.add(partem);
            System.out.println();
        }
    }
    
    public void outAllFullTime(){
        for (FullTimeEmployee fullTimeEmployee : fullTimeArr) {
            fullTimeEmployee.outputFullTimeInfo();
        }
        System.out.println();
    }
    
    public void outAllPartTime(){
        for (PartTimeEmployee partTimeEmployee : partTimeArr) {
            partTimeEmployee.outputPartTimeInfo();
        }
        System.out.println();
    }
    
    public void outAll() {
        for (FullTimeEmployee fullTimeEmployee : fullTimeArr) {
            fullTimeEmployee.outputFullTimeInfo();
        }
        for (PartTimeEmployee partTimeEmployee : partTimeArr) {
            partTimeEmployee.outputPartTimeInfo();
        }
    }
    
    public void searchID(){
        System.out.println("Input ID: ");
        String id = reader.nextLine();
        boolean flag = false;
        for (FullTimeEmployee fullTimeEmployee : fullTimeArr) {
            if (fullTimeEmployee.getEmployeeID().equals(id)) {
                fullTimeEmployee.outputFullTimeInfo();
                flag = true;
                break;
            }
        }
        for (PartTimeEmployee partTimeEmployee : partTimeArr) {
            if (partTimeEmployee.getEmployeeID().equals(id)) {
                partTimeEmployee.outputPartTimeInfo();
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Cannot find Employee.");
        }
    }
    public void deleteID(){
        System.out.println("Input ID: ");
        String id = reader.nextLine();
        boolean flag = false;
        for (FullTimeEmployee fullTimeEmployee : fullTimeArr) {
            if (fullTimeEmployee.getEmployeeID().equals(id)) {
                fullTimeArr.remove(fullTimeEmployee);
                flag = true;
                break;
            }
        }
        for (PartTimeEmployee partTimeEmployee : partTimeArr) {
            if (partTimeEmployee.getEmployeeID().equals(id)) {
                partTimeArr.remove(partTimeEmployee);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Cannot find Employee.");
        }
    }
    
    public void editID(){
        System.out.println("Input ID: ");
        String id = reader.nextLine();
        boolean flag = false;
        for (FullTimeEmployee fullTimeEmployee : fullTimeArr) {
            if (fullTimeEmployee.getEmployeeID().equals(id)) {
                fullTimeEmployee.edit();
                flag = true;
                break;
            }
        }
        for (PartTimeEmployee partTimeEmployee : partTimeArr) {
            if (partTimeEmployee.getEmployeeID().equals(id)) {
                partTimeEmployee.edit();
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Cannot find Employee.");
        }
    }
    
    public void searchPayment(){
        System.out.println("Enter Payment Start: ");
        double paymentStart = reader.nextDouble();
        System.out.println("Enter Payment End: ");
        double paymentEnd = reader.nextDouble();
        boolean flag = false;
        for (FullTimeEmployee fullTimeEmployee : fullTimeArr) {
            if (paymentStart < fullTimeEmployee.getPayment() && fullTimeEmployee.getPayment() < paymentEnd) {
                fullTimeEmployee.outputFullTimeInfo();
                flag = true;
            }
        }
        for (PartTimeEmployee partTimeEmployee : partTimeArr) {
            if (paymentStart < partTimeEmployee.getPayment() && partTimeEmployee.getPayment() < paymentEnd) {
                partTimeEmployee.outputPartTimeInfo();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Cannot find Employee.");
        }
    }
    
    Comparator<FullTimeEmployee> fteSort = ((fte1, fte2) -> {
        if (fte2.getYearOfBirth() - fte1.getYearOfBirth() == 0) {
            return (int) (fte1.getPayment() - fte2.getPayment());
        }else{
            return (int) (fte2.getYearOfBirth() - fte1.getYearOfBirth());
        }
    });
    
     Comparator<PartTimeEmployee> pteSort = ((pte1, pte2) -> {
        if (pte2.getYearOfBirth() - pte1.getYearOfBirth() == 0) {
            return (int) (pte1.getPayment() - pte2.getPayment());
        }else{
            return (int) (pte2.getYearOfBirth() - pte1.getYearOfBirth());
        }
    });
     
    public void sort(){
        Collections.sort(fullTimeArr,fteSort);
        Collections.sort(partTimeArr, pteSort);
    }
    
    
    
    
    
    
    
}

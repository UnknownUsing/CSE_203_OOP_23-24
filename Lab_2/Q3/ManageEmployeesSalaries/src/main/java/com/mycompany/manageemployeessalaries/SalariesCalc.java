/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manageemployeessalaries;

import java.util.*;

/**
 *
 * @author Student
 */
public class SalariesCalc {

    protected ArrayList<Employees> employeeArr = new ArrayList<>();
    static Scanner reader = new Scanner(System.in);

    public void input() {
        System.out.println("Enter number Of Employees: ");
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            Employees employees = new Employees();
            employees.inputInfo();
            employeeArr.add(employees);
        }
    }

    public void output() {
        for (Employees employees : employeeArr) {
            employees.outputInfo();
        }
    }

    public void salaryCalculation() {
        for (Employees employees : employeeArr) {
            employees.salary();
            employees.outputSalary();
        }
    }
    
    Comparator<Employees> em = (Employees o1, Employees o2) -> (int) (o2.getSalary() - o1.getSalary());
    
    public void sortSalaries(){
        Collections.sort(employeeArr, em);
    }
    
    public void highestSalary(){
        employeeArr.get(employeeArr.size()-1).outputSalary();
    }
    
    public void highToLow(){
        for (Employees employees : employeeArr) {
            employees.outputSalary();
        }
    }
    
}

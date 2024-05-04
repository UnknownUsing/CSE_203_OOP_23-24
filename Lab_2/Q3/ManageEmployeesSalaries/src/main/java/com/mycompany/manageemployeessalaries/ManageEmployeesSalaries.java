/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manageemployeessalaries;

/**
 *
 * @author Student
 */
public class ManageEmployeesSalaries {

    public static void main(String[] args) {
        SalariesCalc sa1 = new SalariesCalc();
        sa1.input();
        sa1.output();
        sa1.salaryCalculation();
        sa1.sortSalaries();
        sa1.highestSalary();
        sa1.highToLow();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_1;

import com.mycompany.lab_1.Q1.Q1;
import com.mycompany.lab_1.Q1.Q2;
import com.mycompany.lab_1.Q1.Q3;
import com.mycompany.lab_1.Q1.Q4;
import com.mycompany.lab_1.Q1.Q5;
import com.mycompany.lab_1.Q1.Q6;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lab_1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Question 1
        Q1 question1 = new Q1();
        System.out.print("Input Your Number: ");
        question1.setNumber(reader.nextInt());
        System.out.println("Result: "+question1.sumFirstLast());
        
        //Question 2
        Q2 question2 = new Q2();
        System.out.print("Input First Number: ");
        question2.setFirstNumber(reader.nextInt());
        System.out.print("Input Second Number: ");
        question2.setSecondNumber(reader.nextInt());
        System.out.print("Input Third Number: ");
        question2.setThirdNumber(reader.nextInt());
        System.out.println("Minimum: "+question2.minOfThree());
        
        //Question 3
        Q3 question3 = new Q3();
        question3.setNumber(reader.nextInt());
        question3.hailstoneSequence();
        
        //Question 4
        Q4 question4 = new Q4();
        question4.setLength(reader.nextInt());
        question4.arrayInput();
        System.out.println(question4.evenSum());
        
        //Question 5
        Q5 question5 = new Q5();
        question5.setLength(reader.nextInt());
        question5.Input();
        question5.add();
        question5.remove();
        question5.dupe();
        question5.removeDupe();
        
        //Question 6
        Q6 question6 = new Q6();
        reader.nextLine();
        question6.setInput(reader.nextLine());
        System.out.println(question6.lengthOfString());
        System.out.println(question6.numberOfWord());
        question6.concatenate();
        System.out.println(question6.palindrome());
        
    }
}

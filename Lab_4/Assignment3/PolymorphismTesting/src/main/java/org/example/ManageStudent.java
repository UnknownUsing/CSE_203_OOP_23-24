package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ManageStudent {
    public static Scanner sc = new Scanner(System.in);
    private ArrayList<Student> studentArr = new ArrayList<>();
    public ManageStudent(){
        // TODO document why this constructor is empty
    }

    public void addCStudent(){
        CollegeStudent cs = new CollegeStudent();
        cs.inputCStudent();
        studentArr.add(cs);
    }
    public void addUniStudent(){
        UniversityStudent us = new UniversityStudent();
        us.inputUniStudent();
        studentArr.add(us);
    }

    public void removeStudent(){
        System.out.print("Enter student number: ");
        String studentNumberCheck = sc.next();
        studentArr.removeIf(student -> Objects.equals(student.getStudentNumber(), studentNumberCheck));
    }

    public void outputStudentList(){
        for (Student student: studentArr) {
            System.out.println(student.toString());
        }
    }

    public void gradStudentOutput(){
        int count = 0;
        for (Student student: studentArr) {
            if (student.gradCheck()){
                System.out.println(student.toString());
                count++;
            }
        }
        System.out.println("Number of graduated student: " + count);
    }

    Comparator<Student> sort = (o1, o2) -> {
        if (o1.getType() == o2.getType()) {
            return o1.getStudentNumber().compareTo(o2.getStudentNumber());
        }
        return o1.getType() - o2.getType();
    };

    public void sortArr(){
        studentArr.sort(sort);
    }

    public void search(){
        System.out.print("Enter Student name: ");
        String nameCheck = sc.next();
        for (Student student: studentArr) {
            if (nameCheck.equals(student.getStudentName())){
                System.out.println(student.toString());
                break;
            }
        }
    }
}

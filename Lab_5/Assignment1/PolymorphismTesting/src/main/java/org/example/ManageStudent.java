package org.example;

import java.util.*;
import java.io.*;

public class ManageStudent {
    public static Scanner sc = new Scanner(System.in);
    ObjectOutput oStream = new ObjectOutputStream(new FileOutputStream("D:\\CSE203_GithubFolder_TarotCat\\CSE_203_OOP_23-24\\Lab_5\\Assignment1\\PolymorphismTesting\\src\\main\\resources\\Student.dat"));

    ObjectInput iStream = new ObjectInputStream(new FileInputStream("D:\\CSE203_GithubFolder_TarotCat\\CSE_203_OOP_23-24\\Lab_5\\Assignment1\\PolymorphismTesting\\src\\main\\resources\\Student.dat"));

    private ArrayList<Student> studentArr = new ArrayList<>();
    public ManageStudent() throws IOException {

    }

    public void addCStudent() throws IOException {
        CollegeStudent cs = new CollegeStudent();
        cs.inputCStudent();
        studentArr.add(cs);
        oStream.writeObject(cs);
    }
    public void addUniStudent() throws IOException {
        UniversityStudent us = new UniversityStudent();
        us.inputUniStudent();
        studentArr.add(us);
        oStream.writeObject(us);
    }

    public void removeStudent() throws IOException, ClassNotFoundException {
        boolean found = false;
        System.out.print("Enter student number: ");
        String studentNumberCheck = sc.next();
        for (Student student: studentArr) {
            if (student.getStudentNumber().equals(studentNumberCheck)){
                studentArr.remove(student);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Cannot find data");
        }else{
            oStream.writeObject(studentArr);
            System.out.println("Deleted successful");
            oStream.close();
        }
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

    public void sortArr() throws IOException {
        studentArr.sort(sort);
        oStream.writeObject(studentArr);
    }

    public void search(){
        System.out.print("Enter Student name: ");
        String nameCheck = sc.next();
        for (Student student: studentArr) {
            if (nameCheck.equals(student.getStudentName())){
                System.out.println(student);
                break;
            }
        }
    }

    public void exit() throws IOException {
        oStream.close();
    }
}

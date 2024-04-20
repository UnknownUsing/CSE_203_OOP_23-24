/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_1.Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Q5 {
    private int length;
    private ArrayList arrayIn;
    
    private static Scanner reader = new Scanner(System.in);

    public Q5() {
    }

    public Q5(int length, ArrayList array) {
        this.length = length;
        this.arrayIn = array;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public void Input(){
        this.arrayIn = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            arrayIn.add(reader.nextInt());
        }
    }
    
    public void Output(){
        for (Object object : arrayIn) {
            System.out.println(object);
        }
    }
    
    public String remove(){
        Integer remove = reader.nextInt();
        for (var element : arrayIn) {
            if (element == remove) {
                arrayIn.remove(element);
                return "true";
            }
        }
        return "false";
    }
    
    public void add(){
        Integer add = reader.nextInt();
        Integer pos = reader.nextInt();
        arrayIn.set(pos, add);
        arrayIn.remove(length - 1);
    }
    
    public void dupe(){
        StringBuilder result = new StringBuilder();
        Collections.sort(arrayIn);
        for (int i = 0; i < length; i++) {
            if (i < length - 1 && arrayIn.get(i) == arrayIn.get(i + 1)) {
                result.append(arrayIn.get(i)).append(" ");
                while (i < length - 1 && arrayIn.get(i) == arrayIn.get(i + 1)) {
                    i++;
                }
            }
        }
        System.out.println(result);
    }
    
    public void removeDupe(){
        ArrayList<Object> noDupe = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (!noDupe.contains(arrayIn.get(i))) {
                noDupe.add(arrayIn.get(i));
            }
        }
        for (Object object : noDupe) {
            System.out.print(object+" ");
        }
    }
}

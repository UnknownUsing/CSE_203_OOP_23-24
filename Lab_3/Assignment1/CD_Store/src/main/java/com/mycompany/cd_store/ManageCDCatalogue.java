/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cd_store;

import java.util.*;


/**
 *
 * @author Student
 */
public class ManageCDCatalogue {
    private static Scanner reader = new Scanner(System.in);
    
    private ArrayList<CDInfo> cdArr = new ArrayList<>();
    private int numOfCd;
    
    public ManageCDCatalogue() {
    }
    
    
    
    public void addCDArr(){
        System.out.print("Enter the number of cd you want to enter: ");
        numOfCd = reader.nextInt();
        for (int i = 0; i < numOfCd; i++) {
            CDInfo info = new CDInfo();
            info.addCD();
            cdArr.add(info);
        }
        System.out.println();
    }
    
    public void searchCDTitle(){
        boolean flag = false;
        System.out.print("Enter CD Title: ");
        String cdTitle = reader.nextLine();
        for (CDInfo info : cdArr) {
            if (info.getCdTitle().equals(cdTitle)) {
                info.outputInfoCD();
                System.out.println();
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Cannot find CD.");
            System.out.println();
        }
    }
    
    public void searchCDCollection(){
        boolean flag = false;
        System.out.print("Enter CD Collection: ");
        String cdCollection = reader.nextLine();
        for (CDInfo info : cdArr) {
            if (info.getCdCollection().getCDCollection().equals(cdCollection)) {
                info.outputInfoCD();
                System.out.println();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Cannot find CD Collection.");
            System.out.println();
        }
    }
    
    public void searchCDType(){
        boolean flag = false;
        System.out.print("Enter CD Type: ");
        String cdType = reader.nextLine();
        for (CDInfo info : cdArr) {
            if (info.getCdType().getCdType().equals(cdType)) {
                info.outputInfoCD();
                System.out.println();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Cannot find CD Type.");
            System.out.println();
        }
    }
    
    public void deleteCD(){
        boolean flag = false;
        System.out.print("Enter CD ID: ");
        String cdID = reader.nextLine();
        for (CDInfo info : cdArr) {
            if (info.getCdID().equals(cdID)) {
                cdArr.remove(info);
                flag = true;
                System.out.println();
                break;
            }
        }
        if (!flag) {
            System.out.println("Cannot find CD ID.");
            System.out.println();
        }
    }
    
    public void editCD(){
        boolean flag = true;
        System.out.print("Enter CD ID: ");
        String cdID = reader.nextLine();
        for (CDInfo info : cdArr) {
            if (info.getCdID().equals(cdID)) {
                CDInfo newInfo = new CDInfo();
                newInfo.addCD();
                cdArr.remove(info);
                cdArr.add(newInfo);
                flag = true;
                System.out.println();
                break;
            }
        }
        if (!flag) {
            System.out.println("Cannot find CD ID.");
            System.out.println();
        }
    }
    
    public void displayCD(){
        for (CDInfo info : cdArr) {
            info.outputInfoCD();
        }
        System.out.println();
    }
    
    Comparator<CDInfo> infoSort = (CDInfo i1, CDInfo i2) -> (int) (i1.getCdYearOfRelease()- i2.getCdYearOfRelease());
    
    public void sortByYear(){
        Collections.sort(cdArr,infoSort);
        for (CDInfo info : cdArr) {
            info.outputInfoCD();
        }
        System.out.println();
    }
    
    


}

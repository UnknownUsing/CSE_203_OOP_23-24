/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cd_store;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CDInfo {
    private static Scanner reader = new Scanner(System.in);
    
    private String cdID;
    CDCollection cdCollection = new CDCollection();
    CDType cdType = new CDType();
    private String cdTitle;
    private double cdPrice;
    private int cdYearOfRelease;

    public CDInfo() {
    }

    public CDInfo(String cdID, String cdTitle, double cdPrice, int cdYearOfRelease) {
        this.cdID = cdID;
        this.cdTitle = cdTitle;
        this.cdPrice = cdPrice;
        this.cdYearOfRelease = cdYearOfRelease;
    }

    public String getCdTitle() {
        return cdTitle;
    }

    public CDCollection getCdCollection() {
        return cdCollection;
    }

    public CDType getCdType() {
        return cdType;
    }

    public String getCdID() {
        return cdID;
    }

    public int getCdYearOfRelease() {
        return cdYearOfRelease;
    }
    
    
    
    
    
    public void addCD(){
        System.out.print("Enter CD ID: ");
        cdID = reader.nextLine();

        cdCollection.setCDCollection();
        
        cdType.setCDType();
        
        System.out.print("Enter CD Title: ");
        cdTitle = reader.nextLine();
        
        System.out.print("Enter CD Price: ");
        cdPrice = reader.nextDouble();
        
        System.out.print("Enter CD Year Of Release: ");
        cdYearOfRelease = reader.nextInt();
        reader.nextLine();
    }
    
    public void outputInfoCD(){
        System.out.println("Cd ID: " + cdID);
        System.out.println("Cd Collection: " + cdCollection.getCDCollection());
        System.out.println("Cd Type: " + cdType.getCdType());
        System.out.println("Cd Title: " + cdTitle);
        System.out.println("Cd Price: " + cdPrice);
        System.out.println("Cd Year Of Release: " + cdYearOfRelease);
        
    }
    
    
}

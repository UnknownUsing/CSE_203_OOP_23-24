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
public class CDType {

    private String cdType;
    private int type;

    private static Scanner reader = new Scanner(System.in);

    public CDType() {
    }

    public CDType(String cdType) {
        this.cdType = cdType;
    }

    public String getCdType() {
        return cdType;
    }

    
    public void setCDType() {

        System.out.println("Choose CD type: ");
        System.out.println("1. Audio ");
        System.out.println("2. Video ");

        type = reader.nextInt();

        switch (type) {
            case 1:
                cdType = "Game";
                break;
            case 2:
                cdType = "Movie";
                break;
            default:
                throw new AssertionError();
        }
    }
}

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
public class CDCollection {
    static Scanner reader = new Scanner(System.in);
    private String CDCollection;
    private int type;

    public CDCollection() {
    }

    public CDCollection(String CDCollection) {
        this.CDCollection = CDCollection;
    }

    public String getCDCollection() {
        return CDCollection;
    }
    
    
    
    public void setCDCollection(){
                
        System.out.println("Choose CD collection type: ");
        System.out.println("1. Game ");
        System.out.println("2. Movie ");
        System.out.println("3. Music ");
        
        type = reader.nextInt();
        
        switch (type) {
            case 1:
                CDCollection = "Game";
                break;
            case 2:
                CDCollection = "Movie";
                break;
            case 3:
                CDCollection = "Music";
                break;
            default:
                throw new AssertionError();
        }
        
    }
}

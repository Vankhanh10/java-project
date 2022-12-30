/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baithi;

/**
 *
 * @author nguye
 */
import static java.lang.System.exit;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            ManageTest myManageTest = new ManageTest();        
            myManageTest.addValueRandom();
            while (true) {            
                System.out.println("Menu: ");
                System.out.println("1. Input.");
                System.out.println("2. Display.");
                System.out.println("3. Sort by area.");
                System.out.println("4. Exit.");
                System.out.print("Select: ");
                int chose = myScanner.nextInt();
                myScanner.nextLine();
                switch (chose) {
                    case 1:
                        System.out.println("Input information: ");
                        myManageTest.inputValue();
                        continue;
                    case 2: 
                        System.out.println("Dislay information: ");
                        myManageTest.displayArr();
                        continue;
                    case 3: 
                        myManageTest.sortArr();
                        System.out.println("Dislay information: ");
                        myManageTest.displayArr();
                        continue;
                    case 4: 
                        exit(0);
                    default:
                        throw new AssertionError();
                }
            }
        } catch (AssertionError e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

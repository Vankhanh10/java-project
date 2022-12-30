/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baithi;

/**
 *
 * @author nguye
 */
public class ManageTest {
    Triangle[] arrTriangles = new Triangle[4];
    public ManageTest() {
    }
    
    public  void addValueRandom() {
        arrTriangles[0] = new Triangle(3.4, 2, "Blue", "TriA");
        arrTriangles[1] = new Triangle(5, 3, "Red", "TriB");
        arrTriangles[2] = new Triangle(8, 5, "Pink", "TriC");
    }
    public  void inputValue() {
        for (int i = 0; i < 3; i++) {
            int stt = i+1;
            System.out.println("Input triangle " + stt +": ");
            arrTriangles[i].input();        
        }

    }
    public void displayArr() {
        for (int i = 0; i < 3; i++) {
            arrTriangles[i].display();
            System.out.print(", Area: " + arrTriangles[i].getArea());
            System.out.println(" ");
        }
    }
    public void sortArr() {
        Triangle temTriangle;
        for (int i = 0; i < 2; i++) {
            for (int j = (i + 1); j < 3; j++) {
                if(arrTriangles[i].getArea() < arrTriangles[j].getArea()) {
                    temTriangle = arrTriangles[i];
                    arrTriangles[i] = arrTriangles[j];
                    arrTriangles[j] = temTriangle;
                }
            }
        }
    }
}

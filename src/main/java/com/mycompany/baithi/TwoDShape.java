/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baithi;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class TwoDShape implements InOut, Shape{
    private String color;
    private String shapeName;
    Scanner myScanner = new Scanner(System.in);
    public TwoDShape() {
    }

    public TwoDShape(String color, String shapeName) {
        this.color = color;
        this.shapeName = shapeName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public void input() {
        System.out.print("Input color: ");
        this.color = myScanner.nextLine();
        System.out.print("Input shape name: ");
        this.shapeName = myScanner.nextLine();
    }

    @Override
    public void display() {
        System.out.print("Shape name: " + this.shapeName +
                ",  Color: " + this.color );
    }

    @Override
    public double getArea() {
        return 0;
    }
    @Override
    public double getPrimeter() {
        return 0; 
    }
    
}

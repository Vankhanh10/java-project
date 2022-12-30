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
public class Triangle extends TwoDShape{
    private double based;
    private double height;
    Scanner myScanner1 = new Scanner(System.in);
    public Triangle() {
    }

    public Triangle(double based, double height) {
        this.based = based;
        this.height = height;
    }

    public Triangle(double based, double height, String color, String shapeName) {
        super(color, shapeName);
        this.based = based;
        this.height = height;
    }

    public void setBased(double based) {
        this.based = based;
    }

    public double getBased() {
        return based;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void input() {
        super.input(); 
        System.out.print("Input based: ");
        this.based = myScanner1.nextDouble();
        System.out.print("Input height: ");
        this.height = myScanner1.nextDouble();
    }

    @Override
    public void display() {
        super.display(); 
        System.out.print(", Based: " + this.based + ", Height: " + this.height);
    }

    @Override
    public double getArea() {
        return ((0.5) * this.based * this.height);
    }

    @Override
    public double getPrimeter() {
        return (3 * (this.based));
    }
    
    
    
    
}

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
public class Rectangle extends TwoDShape{
    private double length;
    private double width;
    Scanner myScanner1 = new Scanner(System.in);
    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, String shapeName) {
        super(color, shapeName);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void input() {
        super.input(); 
        System.out.print("Input length: ");
        this.length = myScanner1.nextDouble();
        System.out.print("Input width: ");
        this.width = myScanner1.nextDouble();
    }

    @Override
    public void display() {
        super.display(); 
        System.out.print(", Length: " + this.length + ", Width: " + this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPrimeter() {
        return 2 * (this.length + this.width);
    }
}

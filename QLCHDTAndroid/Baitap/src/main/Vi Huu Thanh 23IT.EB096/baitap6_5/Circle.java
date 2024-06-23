/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap6_5;

public class Circle implements GeometricObject {
protected double radius;
public Circle(double radius) {
	this.radius=radius;
}
@Override
public double getPerimeter() {
	
	return 2*Math.PI*radius;
}
@Override
public double getArea() {
	
	return Math.PI*radius*radius;
}
@Override
public String toString() {
	return "Circle [radius=" + radius + "]";
}

}
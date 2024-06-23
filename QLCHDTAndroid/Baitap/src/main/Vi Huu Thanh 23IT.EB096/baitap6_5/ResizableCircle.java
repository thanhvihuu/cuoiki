/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap6_5;

public class ResizableCircle extends Circle implements Resizable {
public ResizableCircle(double radius) {
	super(radius);
}

@Override
public double resize(int percent) {
	return radius*=percent/100.0;
	
}

@Override
public String toString() {
	return "ResizableCircle [Circle[radius=" + radius + "]";
}
}

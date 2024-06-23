/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap6_5;

public class Test {
public static void main(String[] args) {
	ResizableCircle rs =new ResizableCircle(3);
	System.out.println(rs.getArea());
	rs.resize(10);
	System.out.println(rs.getArea());
}
}

  
package com.mycompany.shapedemo1;

 
public class Circle extends Shape {
    public double radius;
 
public Circle(){
    super();
    this.radius=1.0;
}
public Circle(double radius){
     super();
     this.radius=radius;
}
public Circle(double radius,String color, boolean filled){
     super(color,filled);
     this.radius=radius;
}
 void display() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
        System.out.println("Radius: " + radius);
    }
}

 

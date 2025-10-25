 

package com.mycompany.shapedemo1;

 
public class Shapedemo1 {

    public static void main(String[] args) {
       Circle c = new Circle();
       Circle c1 = new Circle(2.0);
       Circle c2 = new Circle(3.0,"red",false);
        System.out.println("Circle :");
        c.display();
        System.out.println("Circle 1 :");
        c1.display();
        System.out.println("Circle 2 :");
        c2.display();
    }
}

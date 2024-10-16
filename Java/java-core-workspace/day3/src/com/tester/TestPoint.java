package com.tester; 
//import com.developers.*;
import com.developers.geometry.Point2D;

class TestPoint {
  public static void main(String[] args) {
    Point2D p1 = new Point2D(2, 3);
    System.out.println("P1: "+p1);
    Point2D p2 = new Point2D(2, 3);
    System.out.println("P2: " + p2);
    System.out.println(p1.isEqual(p2));//checks content equality - used in practical life
    System.out.println(p1==p2);//check reference equality. - used very less wherever necessary.
    
  } 
}
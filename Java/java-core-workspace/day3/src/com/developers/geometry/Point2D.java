package com.developers.geometry;

public class Point2D {
	double x, y;
	
	//param constr
	public Point2D(double x, double y) {
	  this.x = x;
	  this.y = y;
	}
	
	public String show() {
	  return "x-coord: " + this.x + " y-coord: " + this.y;
	}

	//isEqual method to 
	public boolean isEqual(Point2D p) {
	  System.out.println(this);
	  System.out.println(p);
	  if (this.x == p.x && this.y == p.y) {
	    return true;		
	  }
	  return false;
	}
		

}
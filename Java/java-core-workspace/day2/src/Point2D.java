class Point2D {
	double x, y;
	
	//param constr
	Point2D(double x, double y) {
	  this.x = x;
	  this.y = y;
	}
	
	public String show() {
	  return "x-coord: " + this.x + " y-coord: " + this.y;
	}

	//isEqual method
	boolean isEqual(Point2D p) {
	  if (this.x == p.x && this.y == p.y) {
	    return true;		
	  }
	  return false;
	}
		

}
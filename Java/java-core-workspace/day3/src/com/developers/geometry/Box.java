package com.developers.geometry;
public class Box{
	int l,b,h;
	public Box(int len, int bred, int hei) {
	  l = len;
	  b = bred;
	  h = hei;
	}

	public String show() {
 	  return "L: " + l + " B: " +b +" H: " + h;
	}

}
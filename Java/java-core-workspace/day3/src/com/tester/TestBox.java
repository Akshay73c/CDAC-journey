package com.tester;
import com.developers.geometry.Box;

public class TestBox {
	public static void main(String[] args) {
	  	Box[] boxes = new Box[3];// 1 array object
		System.out.println(boxes.getClass());// [Lcom.cdac.core.Box
//		System.out.println("default array contents");
//		for(Box b : boxes) {
			System.out.println("B: " + b);
		}
//			
		for (int i = 0; i < boxes.length; i++) {
			boxes[i] = new Box(3, 4, 5);
		}
		System.out.println(boxes.getClass());// [Lcom.cdac.core.Box
//		System.out.println("init array contents");
//		for(Box b : boxes)
//			System.out.println(b);


	
	}
}
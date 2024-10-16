package com.app.fruits;

public class Orange extends Fruit {
		
		public Orange(String name, String color, double weight, boolean isFresh) {
			super(name, color, weight, isFresh);
		}
		
		//Override taste
		@Override
		public String taste() {
			return this.toString() + " Taste sour";
		}

		//subclass specific fxnality
		public void juice() {
			System.out.println(this.getName() + " Weight " + this.getWeight() + "\n Extracting juice!");
		}

}

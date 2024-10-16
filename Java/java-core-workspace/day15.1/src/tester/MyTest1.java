package tester;

import java.util.ArrayList;
import java.util.List;

import fruits.Apple;
import fruits.Fruit;
import fruits.Mango;
import fruits.Orange;
import utils.GenericUtils;

public class MyTest1 {

	public static void main(String[] args) {
		
		List<Fruit> list = new ArrayList<Fruit>();
		
		GenericUtils.addFruit(list, new Apple());
		GenericUtils.addFruit(list, new Mango());
		GenericUtils.addFruit(list, new Orange());
		GenericUtils.addFruit(list, new Fruit());
		
		System.out.println(list);
	}

}

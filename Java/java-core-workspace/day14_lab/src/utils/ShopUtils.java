package utils;

import static com.shop.core.Category.BISCUITS;
import static com.shop.core.Category.BREAD;
import static com.shop.core.Category.FRUITS;
import static com.shop.core.Category.OIL;
import static java.time.LocalDate.now;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shop.core.Product;

public interface ShopUtils {
//add a static method to return List of some products'
	static List<Product> populateProductList() {
		// create empty ArrayList
		List<Product> list = new ArrayList<>();// size=0, init capa=10 : up casting
		// int productId, String name, String desc, int quantity, double price, Category
		// productCategory,
		// LocalDate manufactureDate
		list.add(new Product(10, "Brown_Bread", "Healthy Bread", 100, 40, BREAD, now()));
		list.add(new Product(100, "White_Bread", "Tasty Bread", 70, 35, BREAD, parse("2022-05-09")));
		list.add(new Product(50, "Marie", "Healthy Biscuits", 80, 10, BISCUITS, parse("2022-05-01")));
		list.add(new Product(40, "Monaco", "Salty Biscuits", 75, 15, BISCUITS, parse("2022-04-21")));
		list.add(new Product(60, "Sunflowe_Oil", "Healthy Oil", 50, 240, OIL, parse("2022-01-20")));
		list.add(new Product(70, "Gemini_Oil", "Vegetable Oil", 80, 220, OIL, parse("2022-01-30")));
		list.add(new Product(80, "Mango", "Seasonal Fruit", 45, 800, FRUITS, parse("2022-05-06")));
		list.add(new Product(15, "Watermelon", "Great Fruit", 60, 70, FRUITS, parse("2022-05-04")));
		return list;
	}

	// add a static method to return Map of products from populated list of products
	static Map<Integer, Product> populateProductMap(List<Product> productList) {
		Map<Integer, Product> map = new HashMap<>();// size=0, init capa=16 , load factor=.75
//		for (Product p : productList)
//			System.out.println("Put rets " + map.put(p.getProductId(), p));
		// replace external iteration by internal iteration
		// forEach - higher order method(function)
		/*
		 * Any method that can accept a behavior(lambda expression) or can return it
		 */
		productList.forEach(p -> map.put(p.getProductId(), p));
		System.out.println("size of the map " + map.size());
		return map;
	}

}

package tester;

import static utils.ShopUtils.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

import com.shop.core.Product;

public class Test1 {

	public static void main(String[] args) {
		// get the product map from utils
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		// display un sorted products
		productMap.forEach((k, v) -> System.out.println(v));
		// sort these products as per date
		/*
		 * Can't be sorted as per TreeMap - since it involves value based criteria soln
		 * - convert Map -> collection
		 * 
		 */
		ArrayList<Product> productList = new ArrayList<>(productMap.values());
		// higher order method - Collections.sort(List , Comparator)
		// function literal : assigning fun def to a variable
		Comparator<Product> productComp = (p1, p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate());
		Collections.sort(productList, productComp);
		System.out.println("sorted products as per date");
		productList.forEach(p -> System.out.println(p));
	}

}

package functional_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import com.shop.core.Category;
import com.shop.core.Product;

import static utils.ShopUtils.*;

public class Test2 {

	public static void main(String[] args) {
		// accept product category from user
		// display product details(map) of the specified category

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter category");
			Category chosenCategory = 
					Category.valueOf(sc.next().toUpperCase());
			//get map of products
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			productMap.values() //Collection<Product>
			.stream() //Stream<Product>
			.filter(product -> product.getProductCategory()==chosenCategory) //Stream<Product> : filtered 
			.forEach(p -> System.out.println(p));

		}

	}

}

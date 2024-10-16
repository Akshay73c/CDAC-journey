package functional_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import com.shop.core.Category;
import com.shop.core.Product;

import static utils.ShopUtils.*;

public class Test1 {

	public static void main(String[] args) {
		// attach IntStream to int[] n display the same.
		int[] data = { 10, 1, 2, 3, 4, 56, 67, 10 };
		Arrays.stream(data) // IntStream
				.forEach(i -> System.out.print(i + " "));// terminal operation
		System.out.println();
		IntStream.range(10, 50).forEach(i -> System.out.print(i + " "));
		System.out.println();
		IntStream.rangeClosed(10, 50).forEach(i -> System.out.print(i + " "));
		System.out.println();
		IntStream.of(10, 20, 30, 40, 50).forEach(i -> System.out.print(i + " "));
		// display odd nos in the range of 1-100
		System.out.println("odd nos in 1-100");
		IntStream.rangeClosed(1, 100) // IntStream of - 1-100
				.filter(i -> i % 2 != 0) // IntStream of odd ints
				.forEach(i -> System.out.print(i + " "));
		// accept product category from user
		// display product details(list) of the specified category

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter category");
			Category chosenCategory = 
					Category.valueOf(sc.next().toUpperCase());
			//get list of products
			List<Product> productList = populateProductList();
			productList.stream() //Stream<Product>
			.filter(product -> product.getProductCategory()==chosenCategory) //Stream<Product> : filtered 
			.forEach(p -> System.out.println(p));

		}

	}

}

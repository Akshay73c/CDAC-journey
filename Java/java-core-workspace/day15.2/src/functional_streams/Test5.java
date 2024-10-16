package functional_streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import com.shop.core.Category;
import com.shop.core.Product;

import static utils.ShopUtils.*;

public class Test5 {

	public static void main(String[] args) {
		// 4.6 Count no of products between specific price range.

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter date ");
			LocalDate date=LocalDate.parse(sc.next());					
			// get map of products
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("all products - ");
			productMap.forEach((k, v) -> System.out.println(v));
			//Display sum of prices of products manufactured after specified date.

			double sum=productMap.values() //Collectoin<Product>
			.stream() //Stream<Product>
			.filter(p -> p.getManufactureDate().isAfter(date)) //Stream of Filtered products
			//mapper function - mapToDouble
			.mapToDouble(p -> p.getPrice()) //DoubleStream
			.sum();
			System.out.println(sum);
		
		}

	}

}

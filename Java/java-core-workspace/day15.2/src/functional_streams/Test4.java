package functional_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import com.shop.core.Category;
import com.shop.core.Product;

import static utils.ShopUtils.*;

public class Test4 {

	public static void main(String[] args) {
		// 4.6 Count no of products between specific price range.

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter price range ");
			double minPrice = sc.nextDouble();
			double maxPrice = sc.nextDouble();
			// get map of products
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("all products - ");
			productMap.forEach((k, v) -> System.out.println(v));
			long count = productMap.values() // Collection<Product>
					.stream() // Stream<Product>
					.filter(p -> p.getPrice() > minPrice)
					.filter(p -> p.getPrice() < maxPrice).count();
			System.out.println(count);

		}

	}

}

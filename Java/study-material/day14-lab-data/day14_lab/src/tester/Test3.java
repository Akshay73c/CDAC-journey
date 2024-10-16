package tester;
import static utils.ShopUtils.*;

import java.util.List;

import com.shop.core.Category;
import com.shop.core.Product;
public class Test3 {

	public static void main(String[] args) {
		/*
		 * 1.4 Remove all the products from product list , 
		 * from the specified category
		 * Display the list again.
		 * 
		 */
		//get product list
		List<Product> productList = populateProductList();
		System.out.println("Shop - ");
		productList.forEach(p -> System.out.println(p));
		/*
		 * Hint - Use Collection i/f method
		 * public default boolean removeIf(Predicate<? super T> filter)
		 */
		Category selectedCategory=Category.FRUITS;
		productList.removeIf(p -> 
		p.getProductCategory()==selectedCategory);
		System.out.println("Shop after remove ");
		productList.forEach(p -> System.out.println(p));		

	}

}

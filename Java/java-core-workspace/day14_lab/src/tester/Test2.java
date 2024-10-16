package tester;
import java.util.Map;

import com.shop.core.Product;
import static utils.ShopUtils.*;
public class Test2 {

	public static void main(String[] args) {
		// get populated product map from utils
		Map<Integer, Product> products=populateProductMap
				(populateProductList());
		//display all entries from the map - lambda expression
		/*
		 * Map i/f method
		 * public default void
		 * forEach(BiConsumer <? extends K,? extends V> action)
		 * BiConsumer - functional i/f
		 * SAM - public void accept(K key,V Value)
		 * 
		 */
		products.forEach((id,product) -> 
		System.out.println("ID "+id+" Details "+product));

	}

}

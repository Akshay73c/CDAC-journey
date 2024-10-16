package tester;

import static utils.ShopUtils.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * Sort the products from the List , as per price - desc Display the list again.
		 * 
		 */
		// get product list
		List<Product> productList = populateProductList();
		System.out.println("Shop - ");
		productList.forEach(p -> System.out.println(p));
		// sorting - custom ordering
//		Collections.sort(productList, new Comparator<Product>() {
//			@Override
//			public int compare(Product o1, Product o2) {
//				System.out.println("desc price");
//				if (o1.getPrice() < o2.getPrice())
//					return 1;
//				if (o1.getPrice() == o2.getPrice())
//					return 0;
//				return -1;
//			}
//		});
		Collections.sort(productList, (p1,p2) -> 
		{
			if(p1.getPrice() <p2.getPrice())
				return 1;
			if(p1.getPrice() ==p2.getPrice())
				return 0;
			return -1;			
		});
		System.out.println("Sorted Shop products - ");
		productList.forEach(p -> System.out.println(p));

	}

}

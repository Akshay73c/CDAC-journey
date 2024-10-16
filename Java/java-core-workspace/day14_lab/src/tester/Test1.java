package tester;

import static utils.ShopUtils.populateProductList;

import java.util.List;
import java.util.function.Consumer;

import com.shop.core.Product;
//Display all products from the product list.

public class Test1 {

	public static void main(String[] args) {
		List<Product> productList = populateProductList();
		System.out.println("Products using external iteration");
		// for-each loop
		for (Product p : productList)
			System.out.println(p);
		// FP - internal iteration
		/*
		 * Java 8 has added new default method - Iterable<E> public default void
		 * forEach(Consumer<? super T> action) Method of the Consumer i/f - public void
		 * accept(E e)
		 */
		System.out.println("Product list using ano inner class");
		productList.forEach(new Consumer<Product>() {
			@Override
			public void accept(Product t) {
				System.out.println(t);

			}
		});
		System.out.println("using lambda expression");
		productList.forEach(p -> System.out.println(p));
		// Increase prices of all products by 10
		productList.forEach(product -> 
		product.setPrice(product.getPrice()+10));
		System.out.println("list after update price");
		productList.forEach(p -> System.out.println(p));



	}

}

package p3;

import java.util.List;
import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * Display elems of the List
		 */
		List<Integer> list = List.of(10, 20, 30, 40, 50);
		for (int i : list)
			System.out.println(i);// imperative style - where a prog has to specify WHAT n HOW
		/*
		 * Iterable i/f - public default void forEach(Consumer<? super T> action)
		 */
		System.out.println("Using internal iteration - forEach");
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				//action to be performed on all elems 
				System.out.println(t);

			}

		});
		System.out.println("printing the list using lambda expression");
		list.forEach(i  ->  System.out.println(i) );

	}

}

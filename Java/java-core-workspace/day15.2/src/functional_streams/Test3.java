package functional_streams;

import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List.of(10,20,30,40,50)
		.stream()
		.forEach(i -> System.out.print(i+" "));
		System.out.println();
		List.of(10,20,30,40,50)
		.parallelStream()
		.forEach(i -> System.out.print(i+" "));
		System.out.println();

	}

}

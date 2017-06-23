package functionalInterfaces;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {

		Function<String, Integer> func = Integer::valueOf;
		String apply = func.andThen(i -> i.toString()).apply("5");
		
		System.out.println(apply);
		
	}

}

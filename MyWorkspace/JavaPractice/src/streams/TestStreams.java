package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStreams {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("ddd2");
		list.add("aaa2");
		list.add("bbb1");
		list.add("aaa1");
		list.add("bbb3");
		list.add("ccc");
		list.add("bbb2");
		list.add("ddd1");
		
		// filter and forEach
		/*list.stream().filter(s -> s.startsWith("a"))
					   .forEach(s -> System.out.println(s));*/
		// sorted
		/*list.stream().sorted()
					 .forEach(s -> System.out.println(s));*/
		
		//map
		/*list.stream()
			.map(s -> s.toUpperCase())
			.sorted((a,b) -> b.compareTo(a))
			.forEach(s -> System.out.println(s));*/

		//match
		/*boolean anyStartsWithA =
			    	list
			        .stream()
			        .anyMatch((s) -> s.startsWith("a"));

			System.out.println(anyStartsWithA);      // true

			boolean allStartsWithA =
			    	list
			        .stream()
			        .allMatch((s) -> s.startsWith("a"));

			System.out.println(allStartsWithA);      // false

			boolean noneStartsWithZ =
					list
			        .stream()
			        .noneMatch((s) -> s.startsWith("z"));

			System.out.println(noneStartsWithZ);      // true
*/
		//count
		/*long startsWithB =
			    	list
			        .stream()
			        .filter((s) -> s.startsWith("b"))
			        .count();

			System.out.println(startsWithB);    // 3
*/

		//reduce
		
		int a[] = {1,2,3,4,5,6};
		//Arrays.stream(a).reduce((i, j) -> (i+j)).ifPresent(i -> System.out.println(i));
		//System.out.println(Arrays.stream(a).reduce(100, (i, j) -> (i+j)));
		
		 List<Integer> list2 = Arrays.asList(2, 3, 4);
	      //Here result will be 2*2 + 2*3 + 2*4 that is 18. 
	      int res = list2.parallelStream().reduce(2, (s1, s2) -> s1 * s2, (p, q) -> p + q);
	      System.out.println(res);
	      
	      List<String> list1 = Arrays.asList("Mohan", "Sohan", "Ramesh");
	      String result = list1.parallelStream().reduce("-", (s1, s2) -> s1 + s2, (p, q) -> p + q);
	      System.out.println(result);
	}
	

}

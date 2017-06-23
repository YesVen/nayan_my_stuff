package streams;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	public static void main (String a[]) {
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < 10; i++) {
		    map.putIfAbsent(i, "val" + i);
		}
		
		// putIfAbsent and forEach
		/*map.putIfAbsent(22, "as");
		System.out.println(map);
		map.put(22, "val" + 22);
		System.out.println(map);
		
		map.forEach((id, val) -> System.out.println(val));*/
		
		map.compute(2, (i, b) -> b.replace("val", "str"));
		map.forEach((id, val) -> System.out.println(val));
		
	}

}

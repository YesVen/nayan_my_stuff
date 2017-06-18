package stringCodingPractice;

/*
 * count the number of occurrences of each character in a string
 * */
public class StringOccurance {

	public static void main(String[] args) {
		
		findOccurance("nayanmergu,swatimergu");
	}
	
	private static void findOccurance (String str) {
		
		while (!str.isEmpty()) {
			char c = str.charAt(0);
			int count = 0;
			while (str.indexOf(c) != -1) {
				str = str.replaceFirst(""+c, "");
				count++;
			}
			System.out.println("" + c + " --> " + count);
		}
	}

	
	
}

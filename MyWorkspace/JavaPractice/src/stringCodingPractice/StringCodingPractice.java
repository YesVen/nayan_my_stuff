package stringCodingPractice;

public class StringCodingPractice {

	public static void main(String[] args) {
		isAnagram("nayan" , "nayan");
	}

	private static void reverseString (String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i-- ) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
	}
	
	private static void isPalendrome (String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i-- ) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString().equals(str));
	}
	
	private static void isAnagram (String first, String second) {
		
		for (Character charAt : first.toCharArray()) {
			second = second.replaceFirst(charAt.toString(), "");
			if (second.length() == 0) {
				System.out.println(false);
				return;
			}
		}
		
		if (second.length() == 0)
			System.out.println(true);
		else
			System.out.println(false);
	}
	
	private static void getAllCombination(String str) {
		
	}
	
}


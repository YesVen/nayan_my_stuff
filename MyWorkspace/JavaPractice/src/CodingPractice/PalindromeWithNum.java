package CodingPractice;

public class PalindromeWithNum {

	public static void main (String a[]) {
		
		isPalindrome(734545437);
	}
	
	//734545437     734 5 7345
	private static void checkPalindrome (int num) {
		
		int reverseNum = 0;
		int fact = 10;
		
		int last = num % fact;
		reverseNum = last;
		
		 while (true) {
			 
			 last = (num % (fact = fact*10))/(fact/10);
			 reverseNum  = (reverseNum * 10) + last;
			 
			 if (num/fact == 0 ) {
				 break;
			 }
		 }
		 
		 if (num == reverseNum) {
			 System.out.println("Yes It Is!!!");
		 } else {
			 System.out.println("FO");
		 }
		 
		
	}
	
	public static boolean isPalindrome(int x) {
		int revNum = 0;
		int temp = x;
		while (temp != 0) {
			revNum = revNum * 10 + temp % 10;
			temp = temp / 10;
		}
		if (revNum == x) {
			return true;
		}
		return false;
	} 
	
	
}

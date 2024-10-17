
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MAdAm";
		
		
		
		isPalindrome(s);
}

public static String reverse(String s) {
	char word[] = s.toCharArray();
	int left = 0;
	int right = word.length-1;
	for(int i = 0 ; i<word.length; i++) {
		if(left<right) {
			char temp = word[left];
			word[left] = word[right];
			word[right] = temp;
			
			left++;
			right--;
		}
	}
	
	
	return new String(word);
}



public static void isPalindrome(String S) {
	
	if(S.equalsIgnoreCase(reverse(S))) {
	System.out.print("String is palindrome");
}
else {
	System.out.print("String is not  palindrome");
	
}
}
	
}



	



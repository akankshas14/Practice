
public class ReverseWordInString {

	public static void main(String[] args) {

		String s  = "This world is full of selfish People";
		System.out.println(reverseWord(s));
		
		
		
		
		

	}
	
	public static String reverseWord(String S) {
		String word[] = S.split(" ");
		String reverse = "";
//		for(String newWord:word) {
//			word[newWord].
//		}
		for(int i = 0 ; i<word.length ; i++) {
			reverse = " " +word[i]+reverse;
					
					
						}
		System.out.println(reverse);
					
					
				
		
		
		return new String(reverse);
	}

}

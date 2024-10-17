
public class reverseSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This world is full of selfish people";
			System.out.println(reverse(s));
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

}

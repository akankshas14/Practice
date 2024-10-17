import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
				String s1 = "care";
				String s2 = "rAce";
				
			s1 = s1.toLowerCase();
			s2 =	s2.toLowerCase();
				
				if(s1.length()==s2.length()) {
					char[]firstString = s1.toCharArray();
					char[]secondString = s2.toCharArray();
					Arrays.sort(firstString);
					Arrays.sort(secondString);
					
					boolean result = Arrays.equals(firstString, secondString);
					
					if(result) {
						System.out.println(s1 + " and " + s2 + " is anagram");
					}
					else {
						System.out.println(s1 + " and " + s2 + " is  not anagram");
					}
						
				}

	}

}


public class CharacterOccurrence {

	public static void main(String[] args) {
		String s = "Success";
		//String occur = "";
		
		s = s.toLowerCase();
		char[] word = s.toCharArray();
		int count = 0;
		
		
		for(int i = 0 ; i<word.length ; i++) {
		
			for(int j = i+1; j<word.length;j++) {
				if(word[j]==word[i]) {
					
					System.out.println(word[i]);
					
					

				}
				
				
			}
			
			
		}
			
			
	}
	
}

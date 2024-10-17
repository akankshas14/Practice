import java.util.HashSet;

public class DuplicateElementsHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,5,7,9,0,2,7,0};
		IsDuplicate(arr);
		

	}
	
	public static void IsDuplicate(int [] arr) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		HashSet <Integer> duplicate = new HashSet<Integer>();
		
		for(int dup : arr) {
			
		
		if(!hs.add(dup)) {
			duplicate.add(dup);
		}
		}
		
		if(duplicate.isEmpty()) {
			System.out.println("no duplicates found");
			
		}else 
			System.out.println(" duplicates found" + duplicate);
		
	}

}

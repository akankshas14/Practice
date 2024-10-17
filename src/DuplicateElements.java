
public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] a = {10,9,8,0,7,5,7,8,9,};
        
        for(int i =0 ; i<a.length ; i++){
          
            for(int j = i+1; j<a.length ; j++){
                
                if(a[i]==a[j])
                
                {
                    System.out.println("Duplicate number is "+ a[j]);
                   // System.out.println("Duplicate number count "+ count);
                }
            }
        }
    

	}

}

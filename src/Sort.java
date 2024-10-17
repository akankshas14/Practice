
public class Sort {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,1,15,40,50,99,33,59,55,90,0,87,110,119,180,14,8,7};
		sort(a);
		for(int k = 0 ; k<a.length;k++) {
			
			System.out.println(a[k]);
		}
	
	
	}
		public static int[] sort(int [] a) {
		// TODO Auto-generated method stub
		
			
			for(int i = 0 ; i<a.length;i++) {
				int minimum = i;
			
				for(int j = i+1; j<a.length; j++) {
					if(a[j]<a[minimum]) {
						
						minimum = j;
						
					
					}
					
									}
				int temp =a[i];
				a[i] =a[minimum];
				a[minimum] = temp;
			

				
				
			}
			
			
		return a;	
			
	}

}

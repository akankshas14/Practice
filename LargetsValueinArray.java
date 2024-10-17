public class LargetsValueinArray {


    public static void main(String[] args){
        int[] a = {2,7,9,10,0,60, 40};
        int count = 0;
        for(int i = 0; i<a.length; i++){
            int minimum = i;
            for(int j= i+1; j<a.length ;j++){
                if(a[j]<a[minimum]){
                    minimum = j;
                }
            }
            int temp = a[i];
            a[i] = a[minimum];
            a[minimum] = temp;
        }
        for(int k = a.length-1 ; k>0; k--){
           // System.out.println(a[k]);
                count++;
            if(count == 3){
                System.out.println("The third largest number " +a[k] );
                break;
            }

        }
    }
}

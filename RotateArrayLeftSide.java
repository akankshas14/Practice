public class RotateArrayLeftSide {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int n = 4;
        for(int i = 0; i<n; i++){
            int first = arr[0];
            int j ;
            for(j=0; j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }

        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k]);
        }
    }
}

public class RotateArrayRightSide {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10};
        int n = 1;

        for (int i = 0; i < n; i++) {
            int last = arr[arr.length-1];

            int j;
            for ( j = arr.length-1;j>0; j--) {
               arr[j] =arr[j-1];


            }
            arr[j] =last;
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}
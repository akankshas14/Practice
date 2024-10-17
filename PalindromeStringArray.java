public class PalindromeStringArray {
    public static void main(String[] args) {
        String[] s = {"rder", "civic", "india"};
        for (String s1 : s) {

            if (s1.equals(reverse(s1))) {
                System.out.println(s1 + " is palindrome");

            } else {
                System.out.println(s1 + " is not a palindrome");

            }
        }

    }
    public static String  reverse(String s){
        char[] a = s.toCharArray();
        int left = 0 ;
        int right = a.length-1;
        for(int i=0;i<a.length;i++){
            if(left<right){
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }

        }
        return new String(a);
    }

}


public class ArrayOFStrings {

    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        String[] s = {"rder", "refer", "civic", "india"};
        for (String s1 : s) {
            char[] a = s1.toCharArray();
            int left = 0;
            int right = a.length - 1;
            for (int i = 0; i < a.length; i++) {
                if (left < right) {
                    char c = a[left];
                    a[left] = a[right];
                    a[right] = c;
                    left++;
                    right--;
                }

            }
            System.out.println(a);
            for (char c : a) {
                String[] s3 = new String[]{a.toString()};

                for (int j = 0; j < s3.length; j++) {
                    //  for (String s2 : s) {
                    // char[] b1 = s2.toCharArray();
                   // System.out.println("Strings are plaindrome"+ s3[j]);
                    //System.out.println("Strings are plaindrome"+ s[j]);
                    if (s3[j].equalsIgnoreCase(s[j])) {
                        //  if (a[j] == b1[j]) {
                        System.out.println("Strings are plaindrome" );
                    } else {
                        System.out.println("Strings are not plindrome");
                    }
                }

            }
        }
    }
}

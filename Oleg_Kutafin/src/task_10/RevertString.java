package task_10;

/**
 * Created by Kutafin Oleg on 29-08-2017.
 */
public class RevertString {
    public static void main(String[] args){
        String toRevert = "123456";

        System.out.println(reverseByArray(toRevert));

        System.out.println(recursiveReverse(toRevert));
    }

    private static String reverseByArray(String s) {
        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return new String(b);
    }
    private static String recursiveReverse(String s) {
        if ((null == s) || (s.length() <= 1)) {
            return s;
        }
        return recursiveReverse(s.substring(1)) + s.charAt(0);
    }
}

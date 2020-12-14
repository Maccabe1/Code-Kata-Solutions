/*
Problem - Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
 */

public class ReverseString {

    public static String reverseString(String str) {
        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
}

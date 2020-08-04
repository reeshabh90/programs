public class longPalinSubStr {
    public String longestPalindrome(String s) {
        String res = null;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++)  
           for (int j = i+1; j <= s.length(); j++) {
               String t = s.substring(i,j);
               if(isPalindrome(t)){
                   if(t.length()> maxLength){
                       maxLength = t.length();
                       res = t;
                   }
               }
           }                   
           return res;                  
    }

    public static boolean isPalindrome(String str) {
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

}
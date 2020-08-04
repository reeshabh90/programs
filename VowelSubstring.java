import java.util.HashSet;
import java.util.Set;

/**
 * VowelSubstring
 */
public class VowelSubstring {

    static boolean checkVowel(char chr) {
        return (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u');
    }

    static int findSubstring(String str) {
        int count = 0;
        Set<Character> hash = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (checkVowel(str.charAt(j)) == false) {
                    break;
                }
                hash.add(str.charAt(j));
                if (hash.size() == 5) {
                    count++;
                }
            }
            hash.clear();
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
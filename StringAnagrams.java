import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringAnagrams {

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (String q : query) {
            int count = 0;
            for (String dict : dictionary) {
                if(areAnagram(dict.toCharArray(), q.toCharArray())){
                    count++;
                }
            }
            result.add(count);
        }
        return result;

    }

    static boolean areAnagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    public static void main(String[] args) {

    }

}
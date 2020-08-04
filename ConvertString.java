public class ConvertString {

    public static int convert(String s1, String s2, int i1, int i2) {
        if(i1 == s1.length()){
            return s2.length() - i2;
        }
        if(i2 == s2.length()){
            return s1.length() - i1;
        }
        if (s1.charAt(i1) == s2.charAt(i2)) {
            return convert(s1, s2, i1 + 1, i2 + 1);
        }
        int insert = 1 + convert(s1, s2, i1 + 1, i2);
        int delete = 1 + convert(s1, s2, i1, i2 + 1);
        int replace = 1 + convert(s1, s2, i1 + 1, i2 + 1);
        return Min(insert, delete, replace);
        
    }

    public static int Min(int i, int j, int k) {
        int temp = i > j? j : i;
        int result = k > temp? temp: k;
        return result;
    }

    public static void main(String[] args) {

    }
}
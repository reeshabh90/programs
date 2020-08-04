public class LongestSubSeq {
    public static int findSubSeq(String s1, String s2, int i1, int i2) {
        if (i1 == s1.length() || i2 == s2.length())
			return 0;
        int count1 = 0;
        if (s1.charAt(i1) == s2.charAt(i2)) {
            count1 = 1 + findSubSeq(s1.substring(i1 + 1), s2.substring(i2 + 1), i1, i2);
        }
        int count2 = 0 + findSubSeq(s1.substring(i1 + 1), s2.substring(i2), i1, i2);

        int count3 = 0 + findSubSeq(s1.substring(i1), s2.substring(i2 + 1), i1, i2);

        return Math.max(count3, Math.max(count1, count2));
    }

    public static void main(String[] args) {

    }
}
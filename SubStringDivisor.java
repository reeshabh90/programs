
public class SubStringDivisor {

    static int getLength(String s, String t) {
        if (!checkDivisibilityCriteria(s, t)) {
            return -1;
        }
        if (!checkIfDivisible(s, t)) {
            return -1;
        }

        for (int i = 1; i <= t.length(); i++) {
            StringBuilder subStrBuilder = new StringBuilder();
            String subStr = t.substring(0, i);
            while (subStrBuilder.length() < t.length()) {
                subStrBuilder.append(subStr);
            }
            if (subStrBuilder.toString().equals(t))
                return i;
        }
        return -1;
    }

    static boolean checkDivisibilityCriteria(String s, String t) {
        if (s.length() % t.length() > 0) {
            return false;
        } else {
            return true;
        }
    }

    static boolean checkIfDivisible(String s, String t) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i * t.length() < s.length(); i++) {
            sb.append(t);
        }
        if (sb.toString().equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "bcdbcdbcdbcd", t1 = "bcdbcd";
        String s2 = "bcdbcdbcd", t2 = "bcdbcd";
        String s3 = "lrbb", t3 = "lrbb";
        System.out.println(getLength(s1, t1));
        // System.out.println(getLength(s2, t2));
        // System.out.println(getLength(s3, t3));
    }
}
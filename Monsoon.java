import java.util.List;

/**
 * Monsoon
 */
public class Monsoon {

    public static int getUmbrellas(int people, List<Integer> sizes) {
        // Write your code here
        if (sizes.contains(people)) {
            return 1;
        }
        Integer res = -1;
        for (int i = 0; i < sizes.size(); i++) {
            Integer size = sizes.get(i);
            Integer remainder = people % size;
            Integer quotient = people / size;
            if (remainder == 0) {
                res = quotient;
            } else if (sizes.contains(remainder)) {
                res = quotient + 1;
            }
        }
        
        return res;
        
    }

    public static void main(String[] args) {

    }
}
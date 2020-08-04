import java.util.List;

public class BalancedSalessalesArray {

    public static int balancedSum(List<Integer> sales) {
        int salesArr[] = sales.stream().mapToInt(Integer::intValue).toArray();
        int n = salesArr.length;
        int i, j;
        int lSum, rSum;
        for (i = 0; i < n; ++i) {
            lSum = 0;
            for (j = 0; j < i; j++) {
                lSum += salesArr[j];
            }
            rSum = 0;
            for (j = i + 1; j < n; j++) {
                rSum += salesArr[j];
            }
            if (lSum == rSum) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

    }
}
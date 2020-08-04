import java.util.PriorityQueue;

public class MaxOverlapp {

    public static int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        
        for (int i = 0; i < nums.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += sum + j;
            }
        }
        return null;
    }



    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 6, 7, 5, 1 };
        int k = 2;
        int[] res = maxSumOfThreeSubarrays(arr, k);
    }
}
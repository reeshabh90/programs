
public class HouseThief {

    public static int getMaxCount(int[] arr, int n) {

        if (n >= arr.length) {
            return 0;
        }

        int val1 = arr[n] + getMaxCount(arr, n + 2);
        int val2 = getMaxCount(arr, n + 1);
        return Math.max(val1, val2);

    }

    public static int houseCount(int[] arr, int n, int[] dp) {
        if (n >= arr.length) {
            return 0;
        }
        if (dp[n] == 0) {
            int val1 = arr[n] + getMaxCount(arr, n + 2);
            int val2 = getMaxCount(arr, n + 1);
            dp[n] = Math.max(val1, val2);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 1, 30, 8, 2, 4 };
        int[] dp = new int[arr.length];
        houseCount(arr, 0, dp);

    }
}
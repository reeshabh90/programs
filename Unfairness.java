import java.util.Arrays;

public class Unfairness {

    static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - k; i++) {
            int d = arr[i + k -1] - arr[i];
            if (d < res) {
                res = d;
            }
        }
        return res;
    }

    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            int d = Math.abs(arr[i+1] - arr[i]);
            if (d < res) {
                res = d;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 350, 400, 401, 402 };
        int res = maxMin(3, arr);
        System.out.println("res : "+ res);
    }

}
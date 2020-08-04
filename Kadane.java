
public class Kadane {
    private static int maxSum(int[] arr) {

        int maxSum = 0;
        int maxCont = 0;

        for (int i = 0; i < arr.length; i++) {

            maxCont = maxCont + arr[i];

            if (maxCont > maxSum) {
                maxSum = maxCont;
            }
            if (maxCont < 0) {
                maxCont = 0;
            }
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int res = maxSum(a);
        System.out.println(res);
    }
}
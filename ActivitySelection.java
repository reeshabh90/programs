import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    public static void getMaxActivity(int[][] arr) {
        sort2DArray(arr, 1);
        // print2D(arr);

        int i = 0;
        System.out.println("Activity Start Time " + arr[i][0] + " Activity End Time " + arr[i][1]);
        for (int j = 1; j < arr.length; j++) {
            if (arr[j][0] > arr[i][1]) {
                System.out.println("Activity Start Time " + arr[j][0] + " Activity End Time " + arr[j][1]);
                i = j;
            }
        }
    }

    public static void print2D(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static void sort2DArray(int[][] arr, int column) {
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[column] > o2[column]) {
                    return 1;
                } else {
                    return -1;
                }
            }

        });
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 6 }, { 3, 4 }, { 1, 2 }, { 5, 8 }, { 5, 7 }, { 8, 9 } };
        getMaxActivity(arr);
    }
}
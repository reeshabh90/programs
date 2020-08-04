
public class ContagiousArray {

    public static void calMax(Integer[] arr, Integer k) {
        int p = 0;
        int q = k - 1;
        int t = p;
        int max = arr[q];
        while (q <= arr.length - 1) {
            if (arr[p] > max) {
                max = arr[p];
            }
            p++;

            if (p == q && p != arr.length) {
                System.out.println(max + " ");
                q++;
                p = ++t;

                if(q<arr.length){
                    max = arr[q];
                }
            }
        }
    }

}
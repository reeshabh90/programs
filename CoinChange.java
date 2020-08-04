import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class CoinChange {

    public static void getMinChange(int V, int[] arr) {
        int rem = V;
        Map<Integer, Integer> coinMap = new HashMap<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int count = 0;
            while (arr[i] <= rem) {
                System.out.println("Change " + arr[i]);
                count++;
                coinMap.put(arr[i], count);
                rem = rem - arr[i];
            }
        }

        // Iterate over HashMap
        Set set = coinMap.entrySet();
        Iterator iterator = set.iterator();

        // Using a while loop
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

    }

    public static void main(String[] args) {
        int V = 350;
        int[] coin = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
        getMinChange(V, coin);
    }
}
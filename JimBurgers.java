import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JimBurgers {
    static int[] jimOrders(int[][] orders) {
        HashMap<Integer, Integer> orderMap = new HashMap<>();
        int[] res = new int[orders.length];

        for (int row = 0; row < orders.length; row++) {
            int sum = 0;
            for (int col = 0; col < orders[row].length; col++) {
                sum += orders[row][col];
            }
            orderMap.put(row, sum);
        }
        ArrayList<Integer> lst = new ArrayList<>();
        orderMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x -> {
            int k = x.getKey() + 1;
            lst.add(k);
        });
        for (int i = 0; i < lst.size(); i++) {
            res[i] = lst.get(i);
        }        
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = { { 8, 3 }, { 5, 6 }, { 6, 2 }, { 2, 3 }, { 4, 3 } };
        jimOrders(arr);
    }
}
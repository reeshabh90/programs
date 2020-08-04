import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Homework {

    public static int getCount(int[] ingReqdArr, int[] quantityAvailableArr) {
        int count = 0;
        boolean flag = false;

        int min = 0;

        for (int i = 0; i < ingReqdArr.length; i++) {
            int maxCount = quantityAvailableArr[i] / ingReqdArr[i];
            if (min == 0) {
                min = maxCount;
            } else {
                if (maxCount < min) {
                    min = maxCount;
                }
            }
        }

        while (!flag) {
            count++;
            for (int i = 0; i < ingReqdArr.length; i++) {
                if (quantityAvailableArr[i] < ingReqdArr[i]) {
                    flag = true;
                    count--;
                    break;
                }
                quantityAvailableArr[i] = quantityAvailableArr[i] - ingReqdArr[i];
            }

        }
        return count;
    }

    public int findHomeWork(Integer[] arr) {
        int count = 0;
        Integer[] orgArray = arr.clone();
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        Integer[] sortedArray = list.toArray(arr);
        Map<Integer, Integer> orgMap = new HashMap<>();
        for (int i = 0; i < orgArray.length; i++) {
            orgMap.put(orgArray[i], i);
        }

        for (int i = 0; i < orgArray.length; i++) {
            if (orgArray[i] != sortedArray[i]) {
                count++;

                int indSwap = orgMap.get(sortedArray[i]);
                int temp = orgArray[i];
                orgArray[i] = sortedArray[i];
                orgArray[indSwap] = temp;
            }
        }

        return count;
    }

    public Integer[] reverse(Integer[] a) {
        List<Integer> list = Arrays.asList(a);
        Collections.reverse(list);
        return list.toArray(a);
    }

    public static void main(String[] args) {
        Integer[] arr = { 3, 4, 2, 5, 1 };

        Homework hw = new Homework();
        Integer[] orgArr = arr.clone();
        Integer[] reverse = hw.reverse(arr);
        int swap1 = hw.findHomeWork(orgArr);
        int swap2 = hw.findHomeWork(reverse);

        int min = Math.min(swap1, swap2);
        System.out.println(min);
    }
}
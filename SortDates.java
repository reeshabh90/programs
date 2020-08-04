import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 * sortDates
 */
public class SortDates {
    HashMap<Integer, String> unorderedMap = new HashMap<>();

    public List<String> sortDates(List<String> datestring) {
        Collections.sort(datestring, new Comparator<String>() {
            @Override
            public int compare(String object1, String object2) {
                return object1.compareTo(object2);
            }
        });

        return datestring;
    }

    public void sortMonths() {
        unorderedMap.put(1, "Jan");
        unorderedMap.put(2, "Feb");
        unorderedMap.put(3, "Mar");
        unorderedMap.put(4, "Apr");
        unorderedMap.put(5, "May");
        unorderedMap.put(6, "Jun");
        unorderedMap.put(7, "Jul");
        unorderedMap.put(8, "Aug");
        unorderedMap.put(9, "Sep");
        unorderedMap.put(10, "Oct");
        unorderedMap.put(11, "Nov");
        unorderedMap.put(12, "Dec");
    }

    public static void main(String[] args) {
        SortDates sDate = new SortDates();
        List<String> dateString = new ArrayList<String>();
        dateString.add("01 March 2017");
        dateString.add("03 Feb 2017");
        dateString.add("15 Jan 1998");

        List<String> resString = sDate.sortDates(dateString);
        for (String date : resString) {
            System.out.println(date);
        }

    }
}
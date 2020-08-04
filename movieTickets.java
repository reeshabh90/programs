import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class movieTickets {

    public static class Entry {
        private Integer key;
        private Integer value;

        public Entry(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public Integer getKey() {
            return key;
        }

        public void setKey(Integer key) {
            this.key = key;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

    }

    public static void calculateRounds(Queue<Entry> queue) {
        Map<Integer, Integer> roundMap = new HashMap<>();
        while (queue.size() > 0) {
            Entry val = queue.poll();
            if (val.value > 0) {
                if (roundMap.containsKey(val.key)) {
                    Integer round = roundMap.get(val.key);
                    if (queue.size() > 1) {
                        round++;
                        roundMap.put(val.key, round);
                    }

                } else {
                    roundMap.put(val.key, 1);
                }
                queue.add(new Entry(val.key, val.value - 1));
            }
        }

        // Using HashMap forEach
        roundMap.forEach((k, v) -> System.out.println(k + " - " + v));

    }

    public static void main(String[] args) {
        Queue<Entry> queue = new LinkedList<>();
        queue.add(new Entry(1, 9));
        queue.add(new Entry(2, 3));
        queue.add(new Entry(3, 1));
        queue.add(new Entry(4, 3));
        queue.add(new Entry(5, 1));
        queue.add(new Entry(6, 4));
        calculateRounds(queue);
    }

}

package level3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Level3Q19 {

    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (String operation : operations) {
            int value = Integer.parseInt(operation.substring(operation.indexOf(" ") + 1));

            switch (operation.charAt(0)) {
                case 'I':
                minQueue.add(value);
                maxQueue.add(value);
                    break;
                case 'D':
                    if (value > 0) {
                        maxQueue.remove(minQueue.poll());
                    } else {
                        minQueue.remove(maxQueue.poll());
                    }
            }
        }

        return new int[] {maxQueue.isEmpty() ? 0 : maxQueue.poll(), minQueue.isEmpty() ? 0 : minQueue.poll()};
    }
}
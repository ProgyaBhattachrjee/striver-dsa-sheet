package heap;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> taskCounts = new HashMap<>();
        for (char task : tasks) {
            taskCounts.put(task, taskCounts.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(taskCounts.values());

        int cycles = 0;

        while (!maxHeap.isEmpty()) {
            int time = 0;
            java.util.List<Integer> tempList = new java.util.ArrayList<>();

            for (int i = 0; i <= n; i++) {
                if (!maxHeap.isEmpty()) {
                    tempList.add(maxHeap.poll());
                    time++;
                }
            }

            for (int count : tempList) {
                if (--count > 0) {
                    maxHeap.add(count);
                }
            }

            cycles += maxHeap.isEmpty() ? time : n + 1;
        }

        return cycles;
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
      System.out.println(leastInterval(tasks, n));
    }
}


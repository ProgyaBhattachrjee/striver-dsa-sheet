package heap;
import java.util.TreeMap;

public class HandOfStraights {
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int card : hand) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        while (!countMap.isEmpty()) {
            int firstCard = countMap.firstKey();
            for (int i = 0; i < groupSize; i++) {
                int currentCard = firstCard + i;
                if (!countMap.containsKey(currentCard)) {
                    return false;
                }
                int count = countMap.get(currentCard);
                if (count == 1) {
                    countMap.remove(currentCard);
                } else {
                    countMap.put(currentCard, count - 1);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        System.out.println(isNStraightHand(hand, groupSize)); 
    }
}


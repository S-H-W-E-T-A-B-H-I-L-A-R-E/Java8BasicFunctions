package com.java.demo.Java8Codes;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueEleAfterKRemovals {
        public static void main(String[] args) {
            List<Integer> ids = Arrays.asList(1, 1, 1, 3, 2, 2);
            int m = 2;

            List<Integer> remainingIDs = removeAndCountMinimumDistinctIDs(ids, m);
            int count = remainingIDs.size();

            System.out.println("Remaining minimum distinct IDs: " + remainingIDs);
            System.out.println("Count: " + count);
        }

        public static List<Integer> removeAndCountMinimumDistinctIDs(List<Integer> ids, int m) {
            Map<Integer, Long> idCountMap = ids.stream()
                    .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

            List<Integer> remainingIDs = new ArrayList<>();
            while (m > 0) {
                int minCount = Collections.min(idCountMap.values()).intValue();
                for (Map.Entry<Integer, Long> entry : idCountMap.entrySet()) {
                    if (entry.getValue() == minCount) {
                        remainingIDs.add(entry.getKey());
                        m--;
                        if (m == 0) break;
                    }
                }
                idCountMap.values().removeIf(count -> count == minCount);
            }
            //to return count
            // int count = remainingIDs.size();
            //return count
            return remainingIDs;
        }
}

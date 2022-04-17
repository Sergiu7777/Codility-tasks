package com.company.firstunique;

import java.util.*;
import java.util.stream.Collectors;

public class FirstUnique {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4, 3, 1, 1, 2, 7, 6, 6, 5, 4}));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> intermediate = Arrays.stream(A).boxed().collect(Collectors.toList());

        for (Integer i : intermediate) {
            int freq = Collections.frequency(intermediate, i);
            if (freq == 1) return i;
        }
        return -1;
    }
}

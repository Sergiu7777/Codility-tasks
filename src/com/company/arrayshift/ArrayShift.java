package com.company.arrayshift;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayShift {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shiftArray(new int[]{0, 0, 1, 2}, 2)));;
    }

    private static int[] shiftArray(int[] A, int K) {
        List<Integer> arrayList = Arrays.stream(A).boxed().collect(Collectors.toList());
        Collections.rotate(arrayList, K);

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}

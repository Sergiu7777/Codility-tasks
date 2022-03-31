package com.company.binaryzerosequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BinaryZeroSequence {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter decimal number:");

        int n = Integer.parseInt(reader.readLine());

        System.out.println("Decimal number: " + n);
        System.out.println("Binary number: " + Integer.toBinaryString(n));
        System.out.println("Longest zeros streak: " + getLongestZeroStreak(n));
    }

    static int getLongestZeroStreak(int n) {
        String binaryString = Integer.toBinaryString(n);
        String[] arr = binaryString.split("1");

        if (binaryString.startsWith("0")) {
            arr[0] = "";
        }
        if (binaryString.endsWith("0")) {
            arr[arr.length - 1] = "";
        }

        return Arrays.stream(arr).map(String::length).max(Comparator.naturalOrder()).orElse(0);
    }
}

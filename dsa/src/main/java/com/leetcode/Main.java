package com.leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        TwoSum sol = new TwoSum();
        int[] result = sol.twoSum(new int[]{2, 7, 11, 15}, 9);

        System.out.println(Arrays.toString(result)); // prints [0, 1]
    }
}
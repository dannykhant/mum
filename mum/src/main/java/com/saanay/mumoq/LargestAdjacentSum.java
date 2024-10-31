/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class LargestAdjacentSum {

    private static int largestAdjacentSum(int[] a) {
        int largestAdjSum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int AdjSum = a[i] + a[i + 1];
            if (AdjSum > largestAdjSum) {
                largestAdjSum = AdjSum;
            }
        }
        return largestAdjSum;
    }

    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1}));
    }
}

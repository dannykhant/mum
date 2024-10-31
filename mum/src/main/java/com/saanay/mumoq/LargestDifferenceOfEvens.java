/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class LargestDifferenceOfEvens {

    private static int largestDifferenceOfEvens(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int evenCnt = 0;
        for (int e : a) {
            if (e % 2 == 0) {
                if (e < min) {
                    min = e;
                }
                if (e > max) {
                    max = e;
                }
                evenCnt++;
            }
        }
        if (evenCnt < 2) {
            return -1;
        }
        return max - min;
    }

    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }
}

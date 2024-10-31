/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class MinMaxDisjoint {

    private static int isMinMaxDisjoint(int[] a) {
        if(a.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIdx = 0, minIdx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIdx = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIdx = i;
            }
        }
        if (max == min) {
            return 0;
        }
        if (maxIdx - minIdx == 1 || maxIdx - minIdx == -1) {
            return 0;
        }
        int maxCount = 0, minCount = 0;
        for (int e : a) {
            if (e == max) {
                maxCount++;
            }
            if (e == min) {
                minCount++;
            }
        }
        if (maxCount > 1 || minCount > 1) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));
    }
}

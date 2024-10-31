/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Packed {

    private static int isPacked(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int count = 1;  // consecutive count
        int curr = a[0]; // current number
        for (int i = 1; i < a.length; i++) {
            if (curr < 0) {
                return 0;
            }
            if (curr == a[i]) {
                count++;
            } else {
                // check the consecutive count
                if (curr != count) {
                    return 0;
                }
                // check the total count
                int totalCount = 0; // total count of current number
                for (int j = 0; j < a.length; j++) {
                    if (curr == a[j]) {
                        totalCount++;
                    }
                }
                // check the total count
                if (totalCount != curr) {
                    return 0;
                }
                curr = a[i];
                count = 1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPacked(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{2, 3, 2, 3, 3}));
        System.out.println(isPacked(new int[]{2, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{2, 2, 1}));
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2}));
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println(isPacked(new int[]{1, 2, 1}));
        System.out.println(isPacked(new int[]{2, 1, 1}));
        System.out.println(isPacked(new int[]{-3, -3, -3}));
        System.out.println(isPacked(new int[]{0, 2, 2}));
        System.out.println(isPacked(new int[]{2, 1, 2}));
    }
}

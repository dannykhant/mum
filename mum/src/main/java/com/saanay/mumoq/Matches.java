/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Matches {

    private static int matches(int[] a, int[] p) {
        int idx = 0;
        for (int e : p) {
            int absE = e < 0 ? 0 - e : e;
            int i = idx;
            for (; i < absE + idx; i++) {
                if ((e > 0 && a[i] < 0) || (e < 0 && a[i] > 0)) {
                    return 0;
                }
            }
            idx = i;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, -3, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{8}));
    }
}

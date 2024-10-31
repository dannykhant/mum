/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

import java.util.Arrays;

/**
 *
 * @author danny
 */
public class IntegerBasedRounding {

    private static void doIntegerBasedRounding(int[] a, int n) {
        if (n > 0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 0) {
                    int base = (a[i] / n) * n;
                    a[i] = Math.abs(a[i] - base) < Math.abs(a[i] - base - n) ? base : base + n;
                }

            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 2);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 3);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, -3);
        doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5}, 3);
        doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5}, 4);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 5);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 100);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class SumSafe {

    private static int isSumSafe(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int e : a) {
            sum += e;
        }
        for (int e : a) {
            if (e == sum) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSumSafe(new int[]{5, -5, 0}));
        System.out.println(isSumSafe(new int[]{5, -2, 1}));
        System.out.println(isSumSafe(new int[]{}));
    }
}

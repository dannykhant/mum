/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class SystematicallyIncreasing {

    private static int isSystematicallyIncreasing(int[] a) {
        int serieN = 1;
        int idx = 0;
        while (idx < a.length) {
            for (int i = 1; i <= serieN; i++) {
                if (a[idx] != i) {
                    return 0;
                }
                idx++;
            }
            serieN++;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[]{1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));
    }
}

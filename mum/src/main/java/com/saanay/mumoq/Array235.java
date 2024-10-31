/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Array235 {

    private static int is235Array(int[] a) {
        int dividedBy2 = 0;
        int dividedBy3 = 0;
        int dividedBy5 = 0;
        int other = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                dividedBy2++;
            }
            if (a[i] % 3 == 0) {
                dividedBy3++;
            }
            if (a[i] % 5 == 0) {
                dividedBy5++;
            }
            if (a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0) {
                other++;
            }
        }
        return dividedBy2 + dividedBy3 + dividedBy5 + other == a.length ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32}));
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(is235Array(new int[]{7, 11, 77, 49}));
        System.out.println(is235Array(new int[]{2}));
        System.out.println(is235Array(new int[]{}));
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
    }
}

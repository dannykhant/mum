/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class NUnique {

    private static int isNUnique(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > n) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    count++;
                }
            }
        }
        if (count != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 6));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 10));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 11));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 8));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 4));
        System.out.println(isNUnique(new int[]{}, 6));
    }
}

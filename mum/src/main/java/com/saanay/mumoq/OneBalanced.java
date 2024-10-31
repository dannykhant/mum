/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class OneBalanced {

    private static int isOneBalanced(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int beginOneCount = 0;
        int endOneCount = 0;
        int nonOneCount = 0;
        int i = 0, j = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                beginOneCount++;
            } else {
                break;
            }
        }
        for (j = a.length - 1; j >= 0; j--) {
            if (a[j] == 1) {
                endOneCount++;
            } else {
                break;
            }
        }
        for (int k = i; k <= j; k++) {
            if (a[k] != 1) {
                nonOneCount++;
            } else {
                break;
            }
        }
//        System.out.println(beginOneCount + " " + endOneCount + " " + nonOneCount);
        if (beginOneCount + endOneCount == nonOneCount) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));
        System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
        System.out.println(isOneBalanced(new int[]{}));
        System.out.println(isOneBalanced(new int[]{3, 4, 1, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 3, 4}));
        System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));
    }
}

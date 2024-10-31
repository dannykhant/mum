/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Array121 {

    private static int is121Array(int[] a) {
        int leading1Count = 0;
        int ending1Count = 0;
        int middle2Count = 0;
        int i, j;
        for (i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                leading1Count++;
            } else {
                break;
            }
        }
        for (j = a.length - 1; j >= 0; j--) {
            if (a[j] == 1) {
                ending1Count++;
            } else {
                break;
            }
        }
        for (int k = i; k <= j; k++) {
            if (a[k] == 2) {
                middle2Count++;
            } else {
                return 0;
            }
        }
        if (leading1Count == ending1Count && leading1Count > 0 & ending1Count > 0 && middle2Count > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }
}

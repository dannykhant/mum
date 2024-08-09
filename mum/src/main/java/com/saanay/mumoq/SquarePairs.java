/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class SquarePairs {

    private static int isPerfectSquare(int n) {
        int i = 1;
        while (i * i <= n) {
            if (i * i == n) {
                return 1;
            }
            i++;
        }
        return 0;
    }

    private static int[] sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }

    private static int countSquarePairs(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        a = sortArray(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (isPerfectSquare(a[i] + a[j]) == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7}));
        System.out.println(countSquarePairs(new int[]{9}));
    }

}

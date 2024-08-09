/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class MadhavArray {

    private static int isMadhavArray(int[] a) {
        if (!isValidLength(a.length)) {
            return 0;
        }
        int inc = 2; //nth start for sum
        for (int i = 1; i < a.length;) {
            int sum = 0;
            for (int j = i; j < i + inc; j++) {
                sum += a[j];
            }
            if (sum != a[0]) {
                return 0;
            }
            i += inc; //next start point
            inc++; //next nth
        }
        return 1;
    }

    private static boolean isValidLength(int length) {
        int n = 1;
        while (n < length) {
            if (length == n * (n + 1) / 2) {
                return true;
            }
            n++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, - 1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
    }
}

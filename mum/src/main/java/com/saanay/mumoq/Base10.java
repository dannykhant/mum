/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Base10 {

    private static int pow(int n, int pow) {
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result *= n;
        }
        return result;
    }

    private static int isLegalNumber(int[] a, int base) {
        for (int e : a) {
            if (e >= base) {
                return 0;
            }
        }
        return 1;
    }

    private static int convertToBase10(int[] a, int base) {
        if (isLegalNumber(a, base) == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * pow(base, a.length - 1 - i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[]{1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[]{1, 1, 2}, 3));
        System.out.println(convertToBase10(new int[]{3, 2, 5}, 8));
        System.out.println(convertToBase10(new int[]{3, 7, 1}, 6));
    }
}

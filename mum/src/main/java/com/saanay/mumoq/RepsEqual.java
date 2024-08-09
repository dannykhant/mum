/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class RepsEqual {

    private static int pow(int n, int times) {
        int tmp = 1;
        for (int i = 0; i < times; i++) {
            tmp *= n;
        }
        return tmp;
    }

    private static int repsEqual(int[] a, int n) {
        int idx = 0;
        int result = 0;
        while (a[idx] == 0) {
            idx++;
        }
        for (int i = idx; i < a.length; i++) {
            result += a[i] * pow(10, a.length - 1 - i);
        }

        if (n != result) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(repsEqual(new int[]{2, 3, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{9, 3, 1, 1, 2}, 32053));
        System.out.println(repsEqual(new int[]{0, 3, 2, 0, 5, 3}, 32053));
    }
}

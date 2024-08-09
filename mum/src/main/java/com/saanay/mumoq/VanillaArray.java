/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class VanillaArray {

    private static int isVanilla(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int d = a[0] < 0 ? 0 - (a[0] % 10) : a[0] % 10;
        for (int e : a) {
            int absE = e < 0 ? 0 - e : e;
            while (absE > 0) {
                if (d != absE % 10) {
                    return 0;
                }
                absE /= 10;
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isVanilla(new int[]{1}));
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[]{9, 999, 99999, -9999}));
        System.out.println(isVanilla(new int[]{}));
    }
}

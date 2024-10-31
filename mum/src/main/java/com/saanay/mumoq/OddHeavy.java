/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class OddHeavy {

    private static int isOddHeavy(int[] a) {
        int minOdd = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
        int oddCount = 0;
        for (int e : a) {
            if (e % 2 == 0) {
                if (e > maxEven) {
                    maxEven = e;
                }
            } else {
                if (e < minOdd) {
                    minOdd = e;
                    oddCount++;
                }
            }
        }
        return minOdd > maxEven & oddCount > 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 8}));
        System.out.println(isOddHeavy(new int[]{1}));
        System.out.println(isOddHeavy(new int[]{2}));
        System.out.println(isOddHeavy(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11}));
        System.out.println(isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
    }
}

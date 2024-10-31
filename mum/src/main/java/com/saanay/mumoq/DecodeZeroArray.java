/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class DecodeZeroArray {

    private static int decodeArray(int[] a) {
        int zeroCnt = 0;
        int zeroDigits = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zeroCnt++;
            } else {
                zeroDigits = zeroDigits * 10 + zeroCnt;
                zeroCnt = 0;
            }
        }
        return a[0] >= 0 ? zeroDigits : 0 - zeroDigits;
    }

    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{1}));
        System.out.println(decodeArray(new int[]{0, 1}));
        System.out.println(decodeArray(new int[]{-1, 0, 1}));
        System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decodeArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
    }
}

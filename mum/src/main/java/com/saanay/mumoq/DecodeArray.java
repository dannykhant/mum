/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class DecodeArray {

    private static int decodeArray(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int val = Math.abs(a[i] - a[i + 1]);
            result = result * 10 + val;
        }
        return a[0] < 0 ? 0 - result : result;
    }

    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));
    }
}

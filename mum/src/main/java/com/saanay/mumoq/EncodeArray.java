/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author danny
 */
public class EncodeArray {

    private static int[] encodeArray(int n) {
        var arrL = new ArrayList<Integer>();
        if (n < 0) {
            arrL.add(-1);
            n = 0 - n;
        }
        if (n == 0) {
            arrL.add(1);
        }
        while (n != 0) {
            int digit = n % 10;
            for (int i = 0; i < digit; i++) {
                arrL.add(0);
            }
            arrL.add(1);
            n /= 10;
        }

        int[] arr = new int[arrL.size()];
        for (int i = 0; i < arrL.size(); i++) {
            arr[i] = arrL.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeArray(0)));
        System.out.println(Arrays.toString(encodeArray(1)));
        System.out.println(Arrays.toString(encodeArray(-1)));
        System.out.println(Arrays.toString(encodeArray(100001)));
        System.out.println(Arrays.toString(encodeArray(999)));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

import java.util.ArrayList;
import java.lang.Integer;
import java.util.Arrays;

/**
 *
 * @author danny
 */
public class EncodeNumber {

    private static int[] encodeNumber(int n) {
        if (n <= 1) {
            return null;
        }
        var aList = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0 && isPrime(i)) {
                aList.add(i);
                n /= i;
            }
        }
        var result = new int[aList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = aList.get(i);
        }
        return result;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
    }
}

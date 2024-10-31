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
public class FilterArray {

    private static int[] filterArray(int[] a, int n) {
        int count = 0;
        var tempArr = new ArrayList<Integer>();
        while (n != 0) {
            if (n % 2 == 1) {
                tempArr.add(count);
            }
            count++;
            n /= 2;
        }
        var resultArr = new int[tempArr.size()];
        for (int i = 0; i < resultArr.length; i++) {
            if (tempArr.get(i) >= a.length) {
                return null;
            }
            resultArr[i] = a[tempArr.get(i)];
        }
        return resultArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 0)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 1)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 2)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 4)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9, 5}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{0, 9, 12, 18, -6}, 11)));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class ZeroPlentiful {

    private static int isZeroPlentiful(int[] a) {
        int zeroCount = 0, zSeqCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zeroCount++;
            } else {
                if (zeroCount >= 4) {
                    zSeqCount++;
                } else if (zeroCount >= 1 && zeroCount <= 3) {
                    zSeqCount = 0;
                    break;
                }
                zeroCount = 0;
            }
        }
        if (zeroCount >= 4) {
            zSeqCount++;
        }
        return zSeqCount;
    }

    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 3, 4}));
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{0}));
        System.out.println(isZeroPlentiful(new int[]{}));
    }
}

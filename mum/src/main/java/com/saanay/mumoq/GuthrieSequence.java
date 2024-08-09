/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class GuthrieSequence {

    private static int isGuthrieSequence(int[] a) {
        if (a[a.length - 1] != 1) {
            return 0;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i + 1] != a[i] / 2) {
                    return 0;
                }
            } else {
                if (a[i + 1] != a[i] * 3 + 1) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 17, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2}));
    }

}

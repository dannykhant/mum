/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Mercurial {

    private static int isMercurial(int[] a) {
        int leadOne = 0;
        int tailOne = a.length - 1;

        for (; leadOne < a.length; leadOne++) {
            if (a[leadOne] == 1) {
                break;
            }
        }

        for (; tailOne >= 0; tailOne--) {
            if (a[tailOne] == 1) {
                break;
            }
        }

        for (int i = leadOne; i < tailOne; i++) {
            if (a[i] == 3) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));
        System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}));
        System.out.println(isMercurial(new int[]{2, 3, 1, 1, 18}));
        System.out.println(isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
        System.out.println(isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isMercurial(new int[]{1}));
        System.out.println(isMercurial(new int[]{}));
    }
}

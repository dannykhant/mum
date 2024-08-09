/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class StantonMeasure {

    private static int stantonMeasure(int[] a) {
        int countOf1 = 0;
        int measure = 0;
        for (int e : a) {
            if (e == 1) {
                countOf1++;
            }
        }
        for (int e : a) {
            if (e == countOf1) {
                measure++;
            }
        }
        return measure;
    }

    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[]{1}));
        System.out.println(stantonMeasure(new int[]{0}));
        System.out.println(stantonMeasure(new int[]{3, 1, 1, 4}));
        System.out.println(stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
        System.out.println(stantonMeasure(new int[]{}));
    }
}

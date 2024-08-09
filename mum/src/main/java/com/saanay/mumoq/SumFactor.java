/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class SumFactor {

    private static int sumFactor(int[] a) {
        int sumOfArr = 0;
        for (int e : a) {
            sumOfArr += e;
        }
        int count = 0;
        for (int e : a) {
            if (e == sumOfArr) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(sumFactor(new int[]{3, 0, 2, -5, 0}));
        System.out.println(sumFactor(new int[]{9, -3, -3, -1, -1}));
        System.out.println(sumFactor(new int[]{1}));
        System.out.println(sumFactor(new int[]{0, 0, 0}));
    }

}

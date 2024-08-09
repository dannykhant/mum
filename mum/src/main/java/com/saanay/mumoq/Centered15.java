/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Centered15 {

    private static int isCentered15(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length - i; j++) {
                sum += a[j];
            }
            if (sum == 15) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println(isCentered15(new int[]{1, 1, 8, 3, 1, 19}));
        System.out.println(isCentered15(new int[]{9, 15, 6}));
        System.out.println(isCentered15(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println(isCentered15(new int[]{1, 1, 15, -1, -1}));
    }
}

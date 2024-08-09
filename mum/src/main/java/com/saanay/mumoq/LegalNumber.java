/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class LegalNumber {

    private static int isLegalNumber(int[] a, int base) {
        for (int e : a) {
            if (e >= base) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isLegalNumber(new int[]{3, 2, 1}, 4));
        System.out.println(isLegalNumber(new int[]{3, 7, 1}, 6));

    }
}

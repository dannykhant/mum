/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class DigitIncreasing {

    private static int isDigitIncreasing(int n) {

        for (int i = 1; i <= 9; i++) {
            int digit = 0;
            int sumDigit = 0;
            while (sumDigit < n) {
                digit = digit * 10 + i;
                sumDigit += digit;
            }
            if (sumDigit == n) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
    }
}

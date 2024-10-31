/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class FullnessQuotient {

    private static int fullnessQuotient(int n) {
        /**
         * Divide the given number with the base 2-9 and see
         */
        if (n < 0) {
            return -1;
        }
        int count = 0;
        for (int i = 2; i < 10; i++) {
            int tmp = n;
            while (tmp != 0) {
                if (tmp % i == 0) {
                    break;
                }
                tmp /= i;
            }
            if (tmp == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));
    }
}

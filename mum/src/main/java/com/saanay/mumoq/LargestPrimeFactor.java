/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class LargestPrimeFactor {

    private static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0;
        }
        int factor = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && n % i == 0) {
                factor = i;
            }
        }
        return factor;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }
}

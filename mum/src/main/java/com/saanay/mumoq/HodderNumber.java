/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class HodderNumber {

    private static int isHodder(int n) {
        if (!isPrime(n)) {
            return 0;
        }
        int i = 1;
        while (i <= n) {
            i *= 2;
            if (i - 1 == n) {
                return 1;
            }
        }
        return 0;
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
        System.out.println(isHodder(128));
        System.out.println(isHodder(4));
        System.out.println(isHodder(7));
        System.out.println(isHodder(31));
    }
}

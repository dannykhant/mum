/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Smallest {

    private static int smallest(int n) {
        int step = 1;
        while (true) {
            int countDigit2 = 0;
            for (int i = 1; i <= n; i++) {
                int multiples = step * i;
                if (hasDigit2(multiples)) {
                    countDigit2++;;
                } else {
                    break;
                }
            }
            if (countDigit2 == n) {
                return step;
            }
            step++;
        }
    }

    private static boolean hasDigit2(int n) {
        while (n > 0) {
            if (n % 10 == 2) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }
}

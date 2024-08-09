/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class PrimeCount {

    static int primeCount(int start, int end) {
        if (start == 1 || end == 1) {
            return 0;
        }
        if (start > end) {
            return 0;
        }
        if (start < 0) {
            start = 2;
        }
        int count = 0;
        for (; start <= end; start++) {
            boolean isPrime = true;
            for (int i = 2; i <= start / 2; i++) {
                if (start % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("count" + primeCount(10, 30));
        System.out.println("count" + primeCount(11, 29));
        System.out.println("count" + primeCount(20, 22));
        System.out.println("count" + primeCount(1, 1));
        System.out.println("count" + primeCount(5, 5));
        System.out.println("count" + primeCount(6, 2));
        System.out.println("count" + primeCount(-10, 6));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class PorcupineNumber {

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEndWith9(int n) {
        if (n % 10 == 9) {
            return true;
        }
        return false;
    }

    private static int findPorcupineNumber(int n) {

        while (true) {
            if (isPrime(++n)) {
                if (isEndWith9(n)) {
                    int tmp = n;
                    while (true) {
                        if (isPrime(++tmp)) {
                            if (isEndWith9(tmp)) {
                                return n;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(139));
    }
}

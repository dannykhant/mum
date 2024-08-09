/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class Isolated {

    private static int isIsolated(long n) {
        if (n > 2097151 || n < 1) {
            return -1;
        }
        long square = n * n;
        long cube = n * n * n;
        while (square > 0) {
            long lastSq = square % 10;
            long tmpCu = cube;
            while (tmpCu > 0) {
                if (lastSq == tmpCu % 10) {
                    return 0;
                }
                tmpCu /= 10;
            }
            square /= 10;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isIsolated(1));
        System.out.println(isIsolated(2));
        System.out.println(isIsolated(3));
        System.out.println(isIsolated(4));
        System.out.println(isIsolated(5));
        System.out.println(isIsolated(6));
        System.out.println(isIsolated(7));
        System.out.println(isIsolated(8));
        System.out.println(isIsolated(9));
    }
}

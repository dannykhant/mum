/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Solve10 {

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        n *= factorial(n - 1);
        return n;
    }

    private static int[] solve10() {
        int f10 = factorial(10);
        int[] arr = new int[2];
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int fTmp = factorial(i) + factorial(j);
                if (f10 == fTmp) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
                //System.out.println(f10 + " " + i + " " + j + " " + fTmp);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        for (int e : solve10()) {
            System.out.println(e);
        }
    }
}

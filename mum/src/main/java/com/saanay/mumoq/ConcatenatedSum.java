/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class ConcatenatedSum {

    private static int checkConcatenatedSum(int n, int catlen) {
        int sum = 0;
        int num = n;
        while (num != 0) {
            int digit = num % 10;
            int catnum = 0;
            for (int i = 0; i < catlen; i++) {
                catnum = catnum * 10 + digit;
            }
            sum += catnum;
            num /= 10;
        }
        return sum == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }
}

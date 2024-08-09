/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class PerfectNumber {

    private static int getPerfectNumber(int pos) {
        /*
        1. Feeder: Starts with 2 and continue until found a perfect number.
        2. Generator: If sum of all factors is equal to the given number,
        it is a perfect number.
        3. Counter: Everytime found a perfect number, store (n)th found.
         */
        int count = 0;
        int num = 1;
        while (count != pos) {
            ++num;
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (num == sum) {
                count++;
            }
        }
        return count == pos ? num : -1;
    }

    private static int henry(int i, int j) {
        int sum = getPerfectNumber(i) + getPerfectNumber(j);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(henry(1, 3));
    }
}

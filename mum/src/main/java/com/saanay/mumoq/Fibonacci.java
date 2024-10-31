/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Fibonacci {

    private static int isFibonacci(int n) {
        int first = 1;
        int second = 1;
        int other = 0;
        while (other <= n) {
            other = first + second;
            first = second;
            second = other;
        }
        return first == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(27));
        System.out.println(isFibonacci(34));
        System.out.println(isFibonacci(35));
    }
}

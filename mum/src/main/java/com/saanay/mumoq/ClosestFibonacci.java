/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

import java.util.Arrays;

/**
 *
 * @author danny
 */
public class ClosestFibonacci {

    private static int closestFibonacci(int n) {
        int first = 1;
        int second = 1;
        int other = 0;
        while (other < n) {
            other = first + second;
            first = second;
            second = other;
        }
        return first;
    }

    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
    }
}

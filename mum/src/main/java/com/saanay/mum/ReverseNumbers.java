/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mum;

/**
 *
 * @author danny
 */
public class ReverseNumbers {

    private static void reverse(int num) {
        // 12345 -> 54321
        int result = 0;
        while (num > 0) {
            result *= 10;
            result += num % 10;
            num = num / 10;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        reverse(12345678);
    }

}

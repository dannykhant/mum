/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mum;

import java.util.Scanner;

/**
 *
 * @author danny
 */
public class Factorial {

    private static int getFactorial(int num) {
        int result = 1;
        for (; num > 0; num--) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number + "! = " + getFactorial(number));
    }
}

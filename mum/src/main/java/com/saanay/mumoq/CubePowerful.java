/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class CubePowerful {

    private static int isCubePowerful(int n) {
        if (n <= 0) {
            return 0;
        }
        int totalSum = 0;
        int inputNum = n;
        while (inputNum != 0) {
            totalSum += power(inputNum % 10, 3);
            inputNum = inputNum / 10;
        }
        return totalSum == n ? 1 : 0;
    }

    private static int power(int n, int pow) {
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(81));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Triangular {

    private static int isTriangular(int n) {
        int temp = 0;
        for (int i = 1; temp < n; i++) {
            temp += i;
        }
        if (temp == n) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isTriangular(1));
        System.out.println(isTriangular(2));
        System.out.println(isTriangular(3));
        System.out.println(isTriangular(4));
        System.out.println(isTriangular(5));
        System.out.println(isTriangular(6));
    }
}

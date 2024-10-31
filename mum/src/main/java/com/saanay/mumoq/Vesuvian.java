/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class Vesuvian {

    private static int isVesuvian(int n) {
        int count = 0;
        for (int i = 1; i * i < n; i++) {
            for (int j = 1; j * j < n; j++) {
                if (((i * i) + (j * j)) == n) {
                    count++;
                    break;

                }
                if (count == 2) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));
        System.out.println(isVesuvian(87));
        System.out.println(isVesuvian(100));
    }
}

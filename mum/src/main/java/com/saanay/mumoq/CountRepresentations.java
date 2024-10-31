/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class CountRepresentations {

    private static int countRepresentations(int numRupees) {
        int count = 0;
        for (int rupee20 = 0; rupee20 <= numRupees / 20; rupee20++) {
            System.out.println(rupee20);
            for (int rupee10 = 0; rupee10 <= (numRupees - rupee20 * 20) / 10; rupee10++) {
                System.out.println(rupee20 + " " + rupee10);
                for (int rupee5 = 0; rupee5 <= ((numRupees - rupee20 * 20) - rupee10 * 10) / 5; rupee5++) {
                    System.out.println(rupee20 + " " + rupee10 + " " + rupee5);
                    for (int rupee2 = 0; rupee2 <= (((numRupees - rupee20 * 20) - rupee10 * 10) - rupee5 * 5) / 2; rupee2++) {
                        System.out.println(rupee20 + " " + rupee10 + " " + rupee5 + " " + rupee2);
                        for (int rupee1 = 0; rupee1 <= (((numRupees - rupee20 * 20) - rupee10 * 10) - rupee5 * 5) - rupee2 * 2; rupee1++) {
                            if(rupee20 * 20 + rupee10 * 10 + rupee5 * 5 + rupee2 * 2 + rupee1 == numRupees) {
                                count++;
                                System.out.println(rupee20 + " " + rupee10 + " " + rupee5 + " " + rupee2 + " " + rupee1);
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countRepresentations(12));
    }
}

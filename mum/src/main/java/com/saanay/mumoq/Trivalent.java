/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

import java.util.HashSet;

/**
 *
 * @author danny
 */
public class Trivalent {

    private static int isTrivalent(int[] a) {
        var uniqueA = new HashSet<Integer>();
        for (int e : a) {
            uniqueA.add(e);
        }
        if (uniqueA.size() == 3) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[]{}));
        System.out.println(isTrivalent(new int[]{2147483647, -1, -1, -2147483648}));
    }
}

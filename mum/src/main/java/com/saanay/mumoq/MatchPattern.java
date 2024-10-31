/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

/**
 *
 * @author danny
 */
public class MatchPattern {

    private static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
        // len is the number of elements in the array a, patternLen is the number of elements in the pattern.
        int i = 0; // index into a
        int k = 0; // index into pattern
        int matches = 0; // how many times current pattern character has been matched so far
        for (i = 0; i < len; i++) {
            if (a[i] == pattern[k]) {
                matches++; // current pattern character was matched
            } else if (matches == 0 || k == patternLen - 1) {
                return 0;
            } else {
                k++;
                if (a[i] != pattern[k]) {
                    return 0;
                }
            }
        }
        if (i == len && k == patternLen - 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(matchPattern(new int[]{1, 1, 1, 1, 1}, 4, new int[]{1}, 1));
        System.out.println(matchPattern(new int[]{1}, 1, new int[]{1}, 1));
        System.out.println(matchPattern(new int[]{1, 1, 2, 2, 2, 2}, 6, new int[]{1, 2}, 2));
        System.out.println(matchPattern(new int[]{1, 2, 3}, 3, new int[]{1, 2}, 2));
        System.out.println(matchPattern(new int[]{1, 2}, 2, new int[]{1, 2, 3}, 3));
        System.out.println(matchPattern(new int[]{1, 1, 2, 2, 2, 2, 3}, 7, new int[]{1, 3}, 2));
        System.out.println(matchPattern(new int[]{1, 1, 1, 1}, 4, new int[]{1, 2}, 3));
        System.out.println(matchPattern(new int[]{1, 1, 1, 1, 2, 2, 3, 3}, 8, new int[]{1, 2}, 2));
        System.out.println(matchPattern(new int[]{1, 1, 10, 4, 4, 3}, 6, new int[]{1, 4, 3}, 3));
    }
}

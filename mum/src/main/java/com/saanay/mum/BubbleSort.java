/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mum;

/**
 *
 * @author danny
 */
public class BubbleSort {

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 3, 11, 2, 8, 5};
        sort(array);
    }
}

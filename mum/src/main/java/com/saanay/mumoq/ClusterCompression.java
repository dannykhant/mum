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
public class ClusterCompression {

    private static int[] clusterCompression(int[] a) {
        if (a.length == 0) {
            return a;
        }
        int numClusters = 1;
        for (int i = 0; i < a.length - 1; i++) { //get the length
            if (a[i] != a[i + 1]) {
                numClusters++;
            }
        }
        int[] result = new int[numClusters];
        result[0] = a[0];
        int idx = 1;
        for (int i = 1; i < a.length - 1; i++) { //add value to arr
            if (a[i - 1] != a[i]) {
                result[idx] = a[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{18})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{-5, -5, -5, -5, -5})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})));
    }
}

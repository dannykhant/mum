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
public class ComputeHMS {

    private static int[] computeHMS(int seconds) {
        int[] time = new int[3];
        time[0] = seconds / 3600;
        time[1] = (seconds % 3600) / 60;
        time[2] = (seconds % 3600) % 60;
        return time;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
    }
}

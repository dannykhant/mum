/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author danny
 */
public class Inertial {
    
    private static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int tmp;
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }
    
    private static int isInertial(int[] a) {
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.print(" :");
        
        int[] arr = bubbleSort(a);
        
        var evenAl = new ArrayList<Integer>();
        var oddAl = new ArrayList<Integer>();
        
        for (int e : arr) {
            if (e % 2 == 0) {
                evenAl.add(e);
            } else {
                oddAl.add(e);
            }
        }
        
        var evenSet = new HashSet<Integer>(evenAl);
        evenAl.clear();
        evenAl.addAll(evenSet);
        var oddSet = new HashSet<Integer>(oddAl);
        oddAl.clear();
        oddAl.addAll(oddSet);
        
        System.out.print(evenAl + " " + oddAl + " ");
        
        if (evenAl.isEmpty() || oddAl.isEmpty()) {
            return 0;
        }
        
        if (evenAl.size() == 1 && evenAl.get(0) < oddAl.get(oddAl.size() - 1)) {
            return 0;
        }
        
        if (evenAl.size() > 1 && evenAl.get(evenAl.size()-2) > oddAl.get(0)) {
            return 0;
        }
        
        return 1;
    }
    
    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(isInertial(a));
        int[] b = {2};
        System.out.println(isInertial(b));
        int[] c = {1, 2, 3, 4};
        System.out.println(isInertial(c));
        int[] d = {1, 1, 1, 1, 1, 1, 2};
        System.out.println(isInertial(d));
        int[] e = {2, 12, 4, 6, 8, 11};
        System.out.println(isInertial(e));
        int[] f = {2, 12, 12, 4, 6, 8, 11};
        System.out.println(isInertial(f));
        int[] j = {-2, -4, -6, -8, -11};
        System.out.println(isInertial(j));
        int[] k = {2, 3, 5, 7};
        System.out.println(isInertial(k));
        int[] l = {2, 4, 6, 8, 10};
        System.out.println(isInertial(l));
    }
    
}

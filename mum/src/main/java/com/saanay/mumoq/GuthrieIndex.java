/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saanay.mumoq;

import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class GuthrieIndex {
    private static int guthrieIndex(int n) {
        if(n == 1) {
            return 0;
        }
        var arrList = new ArrayList();
        while(n != 1) {
            if(n %2 == 0) {
                n = n/2;
            }
            else {
                n = n*3 + 1;
            }
            arrList.add(n);
        }
        return arrList.size();
    }
    public static void main(String[] args) {
        System.out.println(guthrieIndex(1));
        System.out.println(guthrieIndex(2));
        System.out.println(guthrieIndex(3));
        System.out.println(guthrieIndex(4));
        System.out.println(guthrieIndex(42));
    }
    
}

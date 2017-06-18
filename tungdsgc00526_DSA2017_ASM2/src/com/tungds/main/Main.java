/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tungds.main;

/**
 *
 * @author TungDS
 */
public class Main {
    
    public static void main(String[] agrs){
        
        String[] arrString = new String[]{
            "2280",
            "1015",
            "3895",
            "9001",
            "9002",
            "5267",
            "4016",
            "1120",
            "8907"
        };
        sort(arrString,4);
        
        for (int i = 0; i < arrString.length; i++) {
            System.out.println(arrString[i]);
        }
        
    }
    
    public static void sort(String[] a, int W)
    {
      // Sort a[] on leading W characters.
      int N = a.length;
      int R = 256;
      String[] aux = new String[N];
      for (int d = W-1; d >= 0; d--)
      { // Sort by key-indexed counting on dth char.
         int[] count = new int[R+1];     // Compute frequency counts.
         for (int i = 0; i < N; i++)
             count[a[i].charAt(d) + 1]++;
         for (int r = 0; r < R; r++)     // Transform counts to indices.
            count[r+1] += count[r];
         for (int i = 0; i < N; i++)     // Distribute.
            aux[count[a[i].charAt(d)]++] = a[i];
         for (int i = 0; i < N; i++)     // Copy back.
            a[i] = aux[i];
        }
    }

}

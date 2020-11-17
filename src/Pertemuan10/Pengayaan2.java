/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Pengayaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int a = sc.nextInt();
        int[] bil = new int[a];
        int i;
        for (i = 0; i < bil.length; i++) {
            System.out.printf("Array ke %d: ",i);
            bil [i] = sc.nextInt();
        }
        int b;
        for (i = 0; i < bil.length; i++) {
            for (int j = 1; j < (bil.length-i); j++) {
                if (bil[j-1] > bil[j]){
                    b = bil[j-1];
                    bil[j-1] = bil[j];
                    bil[j] = b;
                }
            }
        }
        System.out.print("Hasil Pengurutan: ");
        for (i = 0; i < bil.length; i++) {
            System.out.print(bil[i]+" ");
        }
    }
}

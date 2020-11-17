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
public class Pengayaan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int a = sc.nextInt();
        int[] bil = new int[a];
        for (int i = 0; i < bil.length; i++) {
            System.out.printf("Array ke %d: ", i);
            bil[i] = sc.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();
        System.out.println("Key ada di posisi index ke: ");
        for (int i = 0; i < bil.length; i++) {
            if (key == bil[i]) {
                System.out.println("--> " + i);
            }
        }
    }
}

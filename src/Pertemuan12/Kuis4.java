/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan12;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Kuis4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();
        int[][] a = new int[baris][kolom];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("Masukkan isi aray ke-[%d],[%d]: ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriks A");
        for (int[] a1 : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf(" %4d ", a1[j]);
            }
            System.out.println();
        }
        System.out.println("Matriks A Transpose");
        for (int i = 0; i < a[0].length; i++) {
            for (int[] aW : a) {
                System.out.printf(" %4d ", aW[i]);
            }
            System.out.println();
        }
    }
}

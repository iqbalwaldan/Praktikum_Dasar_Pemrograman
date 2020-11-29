/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan11;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int b = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int k = sc.nextInt();
        int[][] array = new int[b][k];
        int v = 0, x, y = 0, z;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("Masukkan nilai array Ke-[%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        x = array[0][0];
        for (int[] array1 : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (array1[j] < x) {
                    x = array1[j];
                }
            }
        }
        System.out.println("Menu");
        System.out.println("A . Nilai Minimum");
        System.out.println("B . Nilai Minimum dan Jumlahnya");
        System.out.println("C . Kondisi Array");
        System.out.print("Masukkan pilihan menu dengan abjad A/B/C: ");
        sc.nextLine();
        char pilihan = sc.nextLine().charAt(0);
        if (pilihan == 'a' || pilihan == 'A') {
            System.out.printf("Bilangan terkecil adalah %d\n", x);
        } else if (pilihan == 'b' || pilihan == 'B') {
            System.out.printf("Bilangan terkecil adalah %d\n", x);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (array[i][j] == x) {
                        System.out.printf("Bilangan %d berada pada array ke-[%d][%d]\n", x, i, j);
                        y++;
                    }
                }
            }
            System.out.printf("Jumlah bilangan %d adalah %d \n", x, y);
        } else if (pilihan == 'c' || pilihan == 'C') {
            System.out.print("Masukkan nilai yang akan dicek kondisinya: ");
            z = sc.nextInt();
            for (int[] array1 : array) {
                for (int j = 0; j < array[0].length; j++) {
                    if (array1[j] == z) {
                        v++;
                    }
                }
            }
            if (v == 0) {
                System.out.println("TIDAK ADA");
            } else {
                System.out.println("ADA");
            }
        } else {
            System.out.println("Pilihan yang anda masukkan salah");
        }
    }
}

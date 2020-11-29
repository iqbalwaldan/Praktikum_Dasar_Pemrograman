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
public class Kuis3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();
        int[][] data = new int[baris][kolom];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.printf("Masukkan isi aray ke-[%d],[%d]: ", i, j);
                data[i][j] = sc.nextInt();
            }
        }
        int max = data[0][0];
        int min = max;
        for (int[] data1 : data) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.printf(" %4d ", data1[j]);
                if (data1[j] > max) {
                    max = data1[j];
                }
                if (data1[j] < min) {
                    min = data1[j];
                }
            }
            System.out.println();
        }
        System.out.println("Menu:");
        System.out.println("1. Nilai MIN");
        System.out.println("2. Nilai MAX");
        System.out.print("Silahkan pilih satu menu (input angka 1/2): ");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Nilai MIN dari isi array diatas adalah " + min);
                break;
            case 2:
                System.out.println("Nilai MAX dari isi array diatas adalah " + max);
                break;
            default:
                System.out.println("Pilihan yang anda masukkan tidak tersedia");
        }
    }
}

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
public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[3][5];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.printf("Masukkan nilai array Ke-[%d][%d]: ", i, j);
                data[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < data[0].length; i++) {
            int x = data[0][i];
            for (int j = 0; j < data.length; j++) {
                if (data[j][i] > x) {
                    x = data[j][i];
                }
            }
            System.out.printf("Nilai terbesar kolom-%d = %d\n", i, x);
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            int x = data[i][0];
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] > x) {
                    x = data[i][j];
                }
            }
            System.out.printf("Nilai terbesar baris-%d = %d\n", i, x);
        }
    }
}

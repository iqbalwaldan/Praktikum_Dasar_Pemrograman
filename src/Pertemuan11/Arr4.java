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
public class Arr4 {

    public static void main(String[] args) {
        //jumlah baris dan kolom dinamis menggunakan input keyboard
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int m = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int n = sc.nextInt();
        System.out.println("===================================================");
        int[][] nilai = new int[m][n];
        // input nilai atau data pada array dari keyboard dengan nested loop
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Masukkan angka array pada baris ke-" + i + ", kolom ke-" + j + " : ");
                nilai[i][j] = sc.nextInt();
            }
        }
        System.out.println("===================================================");
        //mencetak isi array dengan nested loop
        System.out.println("Isi array nilai adalah : ");
        int a = 0;
        do {
            int b = 0;
            do {
                System.out.print(nilai[a][b] + " ");
                b++;
            } while (b < n);
            System.out.println();
            a++;
        } while (a < m);
        //mencari nilai genap dan indeks
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((nilai[i][j] % 2 == 1) && (nilai[i][j] > 7)) {
                    System.out.println("angka ganjil : " + nilai[i][j] + " Pada indeks[" + i + "][" + j + "]");
                }
            }
        }
    }
}

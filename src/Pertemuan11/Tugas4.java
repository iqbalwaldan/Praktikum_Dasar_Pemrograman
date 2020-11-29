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
public class Tugas4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang baris tempat duduk: ");
        int n = sc.nextInt();
        System.out.print("Masukkan panjang kolom tempat duduk: ");
        int m = sc.nextInt();
        String[][] matriks1 = new String[n][m];
        int[][] matriks2 = new int[n][m];
        sc.nextLine();
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks1[0].length; j++) {
                System.out.printf("Masukkan nama siswa baris: [%d] kolom: [%d]: ", i, j);
                matriks1[i][j] = sc.nextLine();
            }
        }
        for (int i = 0; i < matriks2.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                System.out.printf("Masukkan nilai siswa baris: [%d] kolom: [%d]: ", i, j);
                matriks2[i][j] = sc.nextInt();
            }
        }
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < matriks2[0].length; i++) {
            int nilai = matriks2[0][i];
            for (int j = 0; j < matriks2[0].length; j++) {
                if (nilai == matriks2[0][j]) {
                    x++;
                }
            }
            if (x > y) {
                y = x;
                z = i;
            }
            x = 0;
        }
        System.out.println("Nilai yang paling sering muncul pada baris depan yaitu: " + matriks2[0][z]);
        int nilai = matriks2[0][z];
        for (int j = 0; j < matriks2[0].length; j++) {
            if (matriks2[0][j] == nilai) {
                System.out.printf("Atas nama %s\n", matriks1[0][j]);
            }
        }
        x = matriks2[0][0];
        y = x;
        for (int i = 0; i < matriks2.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                if (x > matriks2[i][j]) {
                    x = matriks2[i][j];
                }
                if (y < matriks2[i][j]) {
                    y = matriks2[i][j];
                }
            }
        }
        System.out.println("Nilai tertinggi diraih oleh siswa:");
        for (int i = 0; i < matriks2.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                if (y == matriks2[i][j]) {
                    System.out.printf("%s dengan nilai: %d\n", matriks1[i][j], y);
                }
            }
        }
        System.out.println("Nilai terendah diraih oleh siswa:");
        for (int i = 0; i < matriks2.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                if (x == matriks2[i][j]) {
                    System.out.printf("%s dengan nilai: %d\n", matriks1[i][j], x);
                }
            }
        }
    }
}

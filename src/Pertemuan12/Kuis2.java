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
public class Kuis2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[][] = new int[4][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.printf("Masukkan isi aray ke-[%d],[%d]: ", i, j);
                array1[i][j] = sc.nextInt();
            }
        }
        for (int[] array11 : array1) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.printf(" %2d ", array11[j]);
            }
            System.out.println();
        }
        int jumlah = 0;
        System.out.println(" --+ --+ --+ --+ --+ ");
        for (int i = 0; i < array1[0].length; i++) {
            for (int[] array11 : array1) {
                jumlah += array11[i];
            }
            System.out.printf(" %2d ", jumlah);
            jumlah = 0;
        }
        System.out.println();
    }
}

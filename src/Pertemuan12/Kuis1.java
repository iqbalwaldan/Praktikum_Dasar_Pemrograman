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
public class Kuis1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[][] = new int[3][4];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.printf("Masukkan isi aray ke-[%d],[%d]: ", i, j);
                data[i][j] = sc.nextInt();
            }
        }
        int max = data[0][0];
        for (int[] dataW : data) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.printf(" %4d ", dataW[j]);
                if (dataW[j] > max) {
                    max = dataW[j];
                }
            }
            System.out.println();
        }
        System.out.println("Nilai MAX dari isi array diatas adalah " + max);
    }
}

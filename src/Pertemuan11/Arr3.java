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
public class Arr3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Maukkan jumlah baris: ");
        int i = input.nextInt();
        System.out.print("Maukkan jumlah kolom: ");
        int j = input.nextInt();
        int[][] nilai = new int[i][j];
        i = 0;
        do {
            j = 0;
            while (j < nilai[0].length) {
                System.out.print("Masukkan nilai ke-[" + i + "][" + j + "] ");
                nilai[i][j] = input.nextInt();
                j++;
            }
            System.out.println("--------------------------");
            i++;
        } while (i < nilai.length);

        for (int array1D[] : nilai) {
            for (int x : array1D) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

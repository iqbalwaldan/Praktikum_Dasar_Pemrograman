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
public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angka = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Masukkan angka ke-%d: ", i);
            angka[i] = sc.nextInt();
        }
        int j = angka.length - 1;
        int x = 0;
        while (j >= 0) {
            System.out.printf("Ouput angka ke-%d: %d\n", x, +angka[j]);
            j--;
            x++;
        }
    }
}

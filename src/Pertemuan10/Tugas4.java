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
public class Tugas4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Array: ");
        int a = sc.nextInt();
        int[] number = new int[a];
        int i = 0;
        while (i < number.length) {
            System.out.printf("Masukkan Array ke-%d: ", i);
            number[i] = sc.nextInt();
            i++;
        }
        for (i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.printf("Angka Genap: %d\n", number[i]);
            }
        }
        for (i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1) {
                System.out.printf("Angka Ganjil: %d\n", number[i]);
            }
        }
    }
}

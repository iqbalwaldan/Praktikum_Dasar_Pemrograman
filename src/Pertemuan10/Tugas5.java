/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10;

/**
 *
 * @author iqbal
 */
public class Tugas5 {

    public static void main(String[] args) {
        int[] angka = new int[8];
        int a = 1;
        int i = 0;
        do {
            angka[i] = a;
            a *= 3;
            i++;
        } while (i < angka.length);
        a = 0;
        for (i = 0; i < angka.length; i++) {
            a += angka[i];
            System.out.printf("%d ", angka[i]);
        }
        System.out.printf("\nHasil penjumlahan = %d\n", a);
    }
}

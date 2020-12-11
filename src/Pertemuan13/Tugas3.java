/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Tugas3 {

    static Scanner sc = new Scanner(System.in);

    static float input(int[] a) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Masukkan nilai mahasiswa ke-%d: ", (i + 1));
            a[i] = sc.nextInt();
            t += a[i];
        }
        float x = rata2(a, t);
        return x;
    }

    static float rata2(int a2[], int total) {
        int rata = total / a2.length;
        return rata;
    }

    public static void main(String[] args) {
        int[] b = new int[10];
        System.out.println("rata rata nilai mahasiswa: " + input(b));
    }
}

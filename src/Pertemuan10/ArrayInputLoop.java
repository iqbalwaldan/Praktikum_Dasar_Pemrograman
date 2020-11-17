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
public class ArrayInputLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiUAS = new int[6];
        for (int i = 0; i < nilaiUAS.length; i++) {
            System.out.print("Masukkan nilai UAS MHS ke-" + i + ": ");
            nilaiUAS[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiUAS.length; i++) {
            if (nilaiUAS[i] > 70) {
                System.out.println("Nilai Mahasiswa ke-" + i + " lulus!");
            } else {
                System.out.println("Nilai Mahasiswa ke-" + i + " tidak lulus!");
            }
        }
    }
}

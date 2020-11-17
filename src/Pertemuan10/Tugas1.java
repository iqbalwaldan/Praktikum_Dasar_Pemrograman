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
public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka (1-12): ");
        int a = sc.nextInt();
        String[] b = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        if (a < 1 || a > 12) {
            System.out.println("Angka yang anda masukkan salah");
        } else {
            System.out.println(b[--a]);
        }
    }
}

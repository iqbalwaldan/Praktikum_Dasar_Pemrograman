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
public class Prak6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();
        L = hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah: " + L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah: " + vol);
    }

    static int hitungLuas(int pjg, int lb) {
        int luas = pjg * lb;
        return luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Pertama {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        float rupiah,dollar,euro;
        dollar = 14000F;
        euro = 17000F;
        System.out.println("*** Konversi Matauang Rupiah ke US Dollar dan Euro***");
        System.out.println("-----------------------------------------------------");
        System.out.print("Masukkan Nilai Rupiah : ");
        rupiah = angka.nextFloat();
        dollar = rupiah/dollar;
        System.out.printf("Nilai Dollar = $%f\n",dollar);
        euro = rupiah/euro;
        System.out.printf("Nilai Euro = \u20AC%f\n",euro);
    }
}

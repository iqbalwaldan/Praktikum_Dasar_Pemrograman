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
public class Ketiga {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int a,b;
        b=0;
        while(true){
            System.out.print("Masukkan Angka yang akan di julahkan : ");
            a = angka.nextInt();
            b = b + a;
            if (a==20) break;
        }
        System.out.printf("Total penjumlahan = %d\n",b);
    }
}

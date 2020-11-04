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
public class Kedua {
    public static void main(String[] args) {
        Scanner angka = new Scanner (System.in);
        int gaji,jam,jamLebih,gajiA,gajiB,gajiC;
        gajiA=5000;
        gajiB=7500;
        gajiC=gajiA-2500;
        System.out.println("*** Program Penghitungan Gaji Karyawan ***");
        System.out.println("------------------------------------------");
        System.out.print("Masukkan Jam Kerja Karyawan Perminggu : ");
        jam = angka.nextInt();
        if (jam > 60){
            jamLebih = jam - 60;
            gaji = 60*gajiA;
            gaji += jamLebih * gajiB;
            System.out.printf("Total Gaji Karyawan adalah : Rp%d\n",gaji);
        } else if (jam >= 50){
            gaji = jam * gajiA;
            System.out.printf("Total Gaji Karyawan adalah : Rp%d\n",gaji);
        } else {
            gaji = jam * gajiC;
            System.out.printf("Total Gaji Karyawan adalah : Rp%d\n",gaji);
        }
    }
}

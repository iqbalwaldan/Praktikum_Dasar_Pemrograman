/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Tugas4 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Scanner tulisan = new Scanner(System.in);
        int umur,p1,p2,pP,jT,bH;
        System.out.print("Masukkan umur: ");
        umur = angka.nextInt();
        if (umur >= 18){           
            System.out.print("Sudah bekerja (0 = belum, 1 = sudah)? ");
            p1 = angka.nextInt();
            if (p1==1){
                System.out.print("Masukkan pendapatan perbulan: ");
                pP = angka.nextInt();
                System.out.print("Mauskkan jumlah tanggungan: ");
                jT = angka.nextInt();
                bH = pP/jT;
                if (bH < 300000){
                    System.out.println("Penduduk miskin");
                } else {
                    System.out.println("Bukan penduduk miskin");
                }
            } else if (p1==0){
                System.out.println("Penduduk miskin");
            }
        } else {
            System.out.print("Masih Sekolah (0 = tidak, 1 = iya)? ");
            p2 = angka.nextInt();
            if (p2 == 1){
                System.out.println("Bukan penduduk miskin");
            } else if (p2 == 0){
                System.out.println("Penduduk miskin");
            }
        }
    }
}

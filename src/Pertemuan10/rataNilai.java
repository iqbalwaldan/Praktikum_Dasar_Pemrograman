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
public class rataNilai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int a = sc.nextInt();
        int[] nilaiMHS = new int[a];
        int totalLulus = 0, totalTidakLulus = 0;
        double rataL,rataTL;
        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.print("masukkan nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMHS[i] = sc.nextInt();
        }
        int l=0,tL=0;
        for (int i = 0; i < nilaiMHS.length; i++) {
            if (nilaiMHS[i] > 70){
                totalLulus += nilaiMHS[i];
                l++;
            } else {
                totalTidakLulus += nilaiMHS[i];
                tL++;
            }
        }
        rataL = totalLulus / l;
        rataTL = totalTidakLulus / tL;
        System.out.println("nilai rata-rata yang lulus = " + rataL);
        System.out.println("nilai rata-rata yang tidak lulus = " + rataTL);
    }
}

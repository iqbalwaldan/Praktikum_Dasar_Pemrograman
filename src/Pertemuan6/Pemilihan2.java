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
public class Pemilihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai ujian (0 - 100): ");
        nilai = sc.nextInt();
        if (nilai >= 0 || nilai <=100){
            if (nilai >= 90 && nilai <= 100){
                System.out.println("Nilai A, EXCELLENT!");
            } else if (nilai >= 80 && nilai <= 89){
                System.out.println("Nilai B, pertahankan prestasi Anda!");
            } else if (nilai >= 60 && nilai <= 79){
                System.out.println("Nilai C, tingkatkan prestasi Anda!");
            } else if (nilai >= 50 && nilai <=59){
                System.out.println("Nilai D, tingkatkan belajar Anda!");
            } else {
                System.out.println("Nilai E, Anda tidak lulus!");
            }
        } else if (nilai < 0){
            System.out.println("Nilai yang Anda masukkan kurang dari 0");
        } else if (nilai > 100){
            System.out.println("Nilai yang Anda masukkan lebih dari 100");
        }
    }
}

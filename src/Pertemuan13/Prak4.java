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
public class Prak4 {

    static int Kali(int C, int D) {
        int H;
        H = (C + 10) % (D + 19);
        return H;
    }

    static int Kurang(int A, int B) {
        int X;
        A = A + 7;
        B = B + 4;
        X = Kali(A, B);
        return X;
    }

    static void cekLur(int e, int f) {
        if (e >= 0 && f >= 0) {
            int z = Kurang(e, f);
            System.out.println("Hasil akhir adalah " + z);
        } else {
            System.out.println("Nilai 1 atau 2 kurang dari 0");
        }
    }

    public static void main(String[] args) {
        int nilai1, nilai2;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai 2: ");
        nilai2 = input.nextInt();
        cekLur(nilai1, nilai2);
    }
}

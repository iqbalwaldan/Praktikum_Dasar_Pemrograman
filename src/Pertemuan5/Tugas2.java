/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int umur;
	System.out.print("Masukkan umur Anda: ");
	umur = input.nextInt();
	// Menggunakan Operator Pemilihan if..else..
	if (umur >= 17){
            System.out.println("Boleh berkendara");
	}
	else {
            System.out.println("Tidak boleh berkendara");
	}
    }
}

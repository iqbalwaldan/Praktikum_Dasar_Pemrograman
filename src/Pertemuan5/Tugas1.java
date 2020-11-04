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
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int bil1, bil2;
	System.out.print("Masukkan bilangan pertama: ");
	bil1 = input.nextInt();
	System.out.print("Masukkan bilangan kedua: ");
	bil2 = input.nextInt();
	// Menggunakan Operasi Pemilihan if..else if..
	if (bil1 > bil2){
		System.out.println("Bilangan paling besar adalah: " + bil1);
	}
	else if (bil2 > bil1){
		System.out.println("Bilangan paling besar adalah: " + bil2);
	}
    }
}

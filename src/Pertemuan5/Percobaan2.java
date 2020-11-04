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
public class Percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int nilai1,nilai2,hasil;
	System.out.print("Masukkan Bilangan Pertama: ");
	nilai1=input.nextInt();
	System.out.print("Masukkan Bilangan Kedua: ");
	nilai2=input.nextInt();
	hasil=(nilai1+nilai2)/2;
	// Menggunakan Operator Perulangan if..
	if (hasil>=100){
		hasil-=5;
	}
	System.out.println("Hasil Nilai Akhir adalah " + hasil);
    }
}

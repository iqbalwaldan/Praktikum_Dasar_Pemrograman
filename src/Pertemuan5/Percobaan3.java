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
public class Percobaan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int umur;
	System.out.print("Masukkan umur anda: ");
	umur=input.nextInt();
	// Menggunakan Operator Perulangan if..else if..else..
	if (umur>60){
		System.out.println("Lansia");
	}
	else if (umur>45){
		System.out.println("Tua");
	}
	else if (umur>17){
		System.out.println("Dewasa");
	}
	else if (umur>5){
		System.out.println("Anak-anak");
	}
	else if (umur>0){
		System.out.println("Balita");
	}
	else{
		System.out.println("Maaf umur yang anda masukkan salah");
	}
    }
}

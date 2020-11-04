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
public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	Float nUAS, nUTS, nKuis, nTugas, nAkhir;
	String hasil;
	System.out.print("Masukkan nilai UAS\t: ");
	nUAS = input.nextFloat();
	System.out.print("Masukkan nilai UTS\t: ");
	nUTS = input.nextFloat();
	System.out.print("Masukkan nilai kuis\t: ");
	nKuis = input.nextFloat();
	System.out.print("Masukkan nilai tugas\t: ");
	nTugas = input.nextFloat();
	nAkhir = (nUAS*0.4F)+(nUTS*0.3F)+(nKuis*0.1F)+(nTugas*0.2F);
	// Menggunakan Operator Pemilihan Ternary
	hasil = (nAkhir >= 65F) ? "Selamat Anda LULUS" :"Maaf Anda REMIDI";
	System.out.println(hasil);
    }
}

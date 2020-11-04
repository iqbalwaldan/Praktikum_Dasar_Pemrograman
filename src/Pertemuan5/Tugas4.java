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
public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int hA, hB, hC, jA, jB, jC, tA, tB, tC, tABC;
	float d, tS;
	// Input
	System.out.println("Masukkan Harga barang A");
	hA = input.nextInt();
	System.out.println("Masukkan Jumlah barang A");
	jA = input.nextInt();
	System.out.println("Masukkan Harga barang B");
	hB = input.nextInt();
	System.out.println("Masukkan Jumlah barang B");
	jB = input.nextInt();
	System.out.println("Masukkan Harga barang C");
	hC = input.nextInt();
	System.out.println("Masukkan Jumlah barang C");
	jC = input.nextInt();
	// Proses
	tA    = hA*jA;
	tB    = hB*jB;
	tC    = hC*jC;
	tABC  = tA+tB+tC;
	float tABCF = tABC;
	// Menggunakan Operator Pemilihan if..if else..
	if (tABCF > 1000000F){
            d=tABCF*0.1F;
	}
	else if (tABCF > 500000F){
            d=tABCF*0.05F;
	}
	else if (tABCF > 200000F){
            d=tABCF*0.02F;
	}
	else{
            d=0F;
	}
	tS = tABC - d;
	// Output
	System.out.println("------------------------------------------------------------------------------------------");
	System.out.println("\t\t\t\t\tStruk Nota");
	System.out.println("------------------------------------------------------------------------------------------");
	System.out.println("Nama Barang\t|\tHarga\t\t|\tJumlah\t\t|\tTotal");
	System.out.println("barang A\t|\t"+hA+"\t\t|\t"+jA+"\t\t|\t"+tA);
	System.out.println("barang B\t|\t"+hB+"\t\t|\t"+jB+"\t\t|\t"+tB);
	System.out.println("barang C\t|\t"+hC+"\t\t|\t"+jC+"\t\t|\t"+tC);
	System.out.println("\tTotal\t\t\t\t\t\t\t:\t"+tABC);
	System.out.println("\tDiskon\t\t\t\t\t\t\t:\t"+d);
	System.out.println("\tTotal Bayar\t\t\t\t\t\t:\t"+tS);
    }
}

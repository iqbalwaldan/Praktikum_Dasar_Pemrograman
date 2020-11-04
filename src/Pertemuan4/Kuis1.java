/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Kuis1 {
    public static void main(String[] args) {
        int tanggalSekarang, bulanSekarang, tahunSekarang;
	tanggalSekarang = 4;
	bulanSekarang = 11;
	tahunSekarang = 2020;
	System.out.println("===================Program tanggal lahir===================");
	System.out.println(String.format("\nTanggal sekarang\t:%d-%d-%d\n",tanggalSekarang,bulanSekarang,tahunSekarang));
	int tanggalLahir, bulanLahir, tahunLahir;
	Scanner sc = new Scanner(System.in);
	System.out.print("Masukkan tangal lahir\t:");
	tanggalLahir = sc.nextInt();
	System.out.print("Masukkan bulan lahir\t:");
	bulanLahir = sc.nextInt();
	System.out.print("Masukkan tahun lahir\t:");
	tahunLahir = sc.nextInt();
	int totalHariSekarang, totalHariLahir, totalUsia, usiaDalamTahun,usiaDalamBulan,usiaDalamHari;
	totalHariSekarang = (tahunSekarang * 12 * 31) + ((bulanSekarang - 1) * 31) + tanggalSekarang;
	totalHariLahir = (tahunLahir * 12 * 31) + ((bulanLahir - 1) * 31) + tanggalLahir;
	totalUsia = totalHariSekarang - totalHariLahir;
	usiaDalamTahun = totalUsia / (12 * 31);
	usiaDalamBulan = totalUsia % (12 * 31) / 31;
	usiaDalamHari = totalUsia % (12 * 31) - (usiaDalamBulan * 31);
	System.out.println(String.format("\n\nAnda lahir pada tanggal\t: %d-%d-%d",tanggalLahir,bulanLahir,tahunLahir));
	System.out.println(String.format("\nJadi usia Anda sekarang Adalah %d tahun %d bulan %d hari",usiaDalamTahun,usiaDalamBulan,usiaDalamHari));
	System.out.println("-----------------------------------------------------------");
    }
}

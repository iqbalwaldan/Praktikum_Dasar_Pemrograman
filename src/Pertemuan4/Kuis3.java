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
public class Kuis3 {
    public static void main(String[] args) {
        int jamSekarang, menitSekarang, detikSekarang;
	jamSekarang = 14;
	menitSekarang = 50;
	detikSekarang = 30;
	System.out.println("===================Program jam kuliah===================");
	System.out.println(String.format("Jam sekarang adalah %d:%d:%d",jamSekarang,menitSekarang,detikSekarang));
	int jamKuliah, menitKuliah, detikKuliah;
	Scanner sc = new Scanner(System.in);
	System.out.print("Masukkan jam kuliah\t:");
	jamKuliah = sc.nextInt();
	System.out.print("Masukkan menit kuliah\t:");
	menitKuliah = sc.nextInt();
	System.out.print("Masukkan detik kuliah\t:");
	detikKuliah = sc.nextInt();
	int totalWaktuSekarang, totalWaktuKuliah, totalSelisihWaktu;
	totalWaktuSekarang = (jamSekarang * 3600) + (menitSekarang * 60) + detikSekarang;
	totalWaktuKuliah = (jamKuliah * 3600) + (menitKuliah * 60) + detikKuliah;
	totalSelisihWaktu = totalWaktuKuliah - totalWaktuSekarang;
	int selisihJam, sisaJam, selisihMenit, sisaMenit, selisihDetik;
	selisihJam = totalSelisihWaktu / 3600;
	sisaJam = totalSelisihWaktu - (selisihJam * 3600);
	selisihMenit = sisaJam / 60;
	sisaMenit = sisaJam - (selisihMenit * 60);
	System.out.println(String.format("\n\nKuliah Anda dimulai\t:%d:%d:%d",jamKuliah,menitKuliah,detikKuliah));
	System.out.println("\nJadi sisa waktu menuju perkuliahan Anda Adalah " + selisihJam + " jam " + selisihMenit + " menit " + sisaMenit + " detik ");
	System.out.println("-----------------------------------------------------------");
    }
}

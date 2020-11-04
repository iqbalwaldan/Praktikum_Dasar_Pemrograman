/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author iqbal
 */
public class ContohVariabel {
    public static void main(String[] args) {
        String hobySaya = "Bermain petak umpet";
	boolean apakahPandai = true;
	char jenisKelamin = 'L';
	byte umurSayaSekarang = 20;
	double ipk =3.24, tinggi = 1.78;
	System.out.println(hobySaya);
	System.out.println("Apakah pandai? " + apakahPandai);
	System.out.println("Jenis kelamin: " + jenisKelamin);
	System.out.println("Umurku saat ini: "+ umurSayaSekarang);
	System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}

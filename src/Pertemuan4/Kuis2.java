/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author iqbal
 */
public class Kuis2 {
    public static void main(String[] args) {
        float kecepatanMobil, waktuTempuh, jarakTempuh;
	kecepatanMobil = 70F;
	System.out.println(String.format("Kecepatan mobil yang dikendarai Pak Ryan " + kecepatanMobil + " km/jam"));
	waktuTempuh = 2F;
	System.out.println(String.format("Waktu yang ditempuh Pak Ryan selama " + waktuTempuh + " jam"));
	jarakTempuh = kecepatanMobil * waktuTempuh;
	System.out.println(String.format("Jadi jarak yang ditempuh Pak Ryan ke lokasi kerja adalah %s km",jarakTempuh));
    }
}

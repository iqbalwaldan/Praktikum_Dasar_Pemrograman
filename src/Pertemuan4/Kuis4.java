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
public class Kuis4 {
    public static void main(String[] args) {
        float jarakTempuh, waktuTempuh,kecepatanBus ;
	jarakTempuh = 150F;
	System.out.println(String.format("Jarak yang ditempuh bus pariwisata " + jarakTempuh + " km"));
	waktuTempuh = 2F;
	System.out.println(String.format("Waktu yang ditempuh bus pariwisata selama " + waktuTempuh + " jam"));
	kecepatanBus = jarakTempuh / waktuTempuh;
	System.out.println(String.format("Jadi kecepatan bus pariwisata adalah %s km/jam",kecepatanBus));
    }
}

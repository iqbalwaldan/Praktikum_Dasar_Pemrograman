/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13;

/**
 *
 * @author iqbal
 */
class Greeting {

    static void beriSalam() {
        System.out.println("Halo! Selamat Pagi");
    }

    static void beriUcapan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        beriSalam();
        String salam = "Selamat datang di program Java";
        beriUcapan(salam);
    }
}

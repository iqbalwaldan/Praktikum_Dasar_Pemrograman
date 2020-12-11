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
public class Tugas2 {

    static float phi = 3.14F;

    static float kelilingLingkaran(int jari2) {
        float keliling = 2 * phi * jari2;
        return keliling;
    }

    static float luasLingkaran(int jari2) {
        float luas = phi * jari2 * jari2;
        return luas;
    }

    public static void main(String[] args) {
        int r = 100;
        System.out.println("keliling lingkaran: " + kelilingLingkaran(r));
        System.out.println("luas lingkaran: " + luasLingkaran(r));
    }
}

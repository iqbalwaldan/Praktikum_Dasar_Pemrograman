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
public class Prak5 {

    static void Tampil(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter: " + a.length);
        for (int i : a) {
            System.out.println(i + " ");
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");
    }
}

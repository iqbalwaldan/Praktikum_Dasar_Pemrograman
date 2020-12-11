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
class Persegi {

    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        int luasan = luasPersegi(5);
        System.out.println("Luas Persegi dengan sisi = " + luasan);
    }
}

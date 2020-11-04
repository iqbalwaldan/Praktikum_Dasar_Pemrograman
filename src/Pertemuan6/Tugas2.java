/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        System.out.print("Masukkan sisi pertama: ");
        a = sc.nextFloat();
        System.out.print("Masukkan sisi kedua: ");
        b = sc.nextFloat();
        System.out.print("Masukkan sisi ketiga: ");
        c = sc.nextFloat();
        if (a == b && b == c && a == c) {
            System.out.println("Ini adalah segitiga sama sisi");
        } else if (a == b && a != c && b != c) {
            System.out.println("Ini adalah segitiga sama kaki");
        } else if (a != b && a == c && b != c) {
            System.out.println("Ini adalah segitiga sama kaki");
        } else if (a != b && a != c && b == c) {
            System.out.println("Ini adalah segitiga sama kaki");
        } else if (a != b && b != c && a != c) {
            System.out.println("Ini adalah segitiga sembarang");
        }
    }
}

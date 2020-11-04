/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Segitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int alas, tinggi;
	float luas;
	System.out.print("Masukkan alas\t: ");
	alas = sc.nextInt();
	System.out.print("Masukkan tinggi\t: ");
	tinggi = sc.nextInt();
	luas = alas * tinggi / 2;
	System.out.println("Luas segitiga\t: " + luas);
    }
}

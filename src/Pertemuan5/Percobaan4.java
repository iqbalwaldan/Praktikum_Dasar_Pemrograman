/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Percobaan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner cs = new Scanner(System.in);
	double angka1, angka2, hasil;
	char operator;
	System.out.print("Masukkan angka pertama: ");
	angka1 = sc.nextDouble();
	System.out.print("Masukkan operator (+ - * /): ");
	operator = cs.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
	angka2 = sc.nextDouble();
	// Menggunakan Operator Pemilihan Switch Case
        switch(operator){
		case '+':
		hasil = angka1 + angka2;
		System.out.println(angka1 + " + " + angka2 + " = " + hasil);
		break;
		case '-':
		hasil = angka1 - angka2;
		System.out.println(angka1 + " - " + angka2 + " = " + hasil);
		break;
		case '*':
		hasil = angka1 * angka2;
		System.out.println(angka1 + " * " + angka2 + " = " + hasil);
		break;
		case '/':
		hasil = angka1 / angka2;
		System.out.println(angka1 + " / " + angka2 + " = " + hasil);
		break;

		default:
		System.out.println("Operator yang Anda masukkan salah");
	}
    }
}

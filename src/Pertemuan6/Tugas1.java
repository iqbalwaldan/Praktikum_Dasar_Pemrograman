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
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
	double angka1, angka2, hasil;
	String operator;
	System.out.print("Masukkan bilangan pertama: ");
	angka1 = sc.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = sa.nextLine();
	System.out.print("Masukkan bilangan kedua: ");
	angka2 = sc.nextDouble();
	// Menggunakan Operator Pemilihan Switch Case
	switch(operator){
		case "+":
		hasil = angka1 + angka2;
		System.out.println(angka1 + " + " + angka2 + " = " + hasil);
		break;
		case "-":
		hasil = angka1 - angka2;
		System.out.println(angka1 + " - " + angka2 + " = " + hasil);
		break;
		case "*":
		hasil = angka1 * angka2;
		System.out.println(angka1 + " * " + angka2 + " = " + hasil);
		break;
		case "/":
		hasil = angka1 / angka2;
		System.out.println(angka1 + " / " + angka2 + " = " + hasil);
		break;

		default:
		System.out.println("Operator yang Anda masukkan salah");
	}
    }
}

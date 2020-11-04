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
public class Pemilihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int bil;
	System.out.print("Masukkan Sebuah Bilangan: ");
	bil=input.nextInt();
        // Mengguanakan Operator Perulangan Ternary
	String output=(bil%2==0)?"Bilangan Genap":"Bilangan Ganjil";
	System.out.println(output);
    }
}

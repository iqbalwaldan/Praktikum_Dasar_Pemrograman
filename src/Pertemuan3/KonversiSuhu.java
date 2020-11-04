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
public class KonversiSuhu {
    public static void main(String[] args) {
        float suhu, celcius, reaumur, fahrenheit, kelvin;
	Scanner sc = new Scanner(System.in);
	System.out.print("Masukkan suhu\t\t: ");
	suhu = sc.nextFloat();
	celcius = suhu;
	reaumur = 4F/5F * celcius;
	fahrenheit = (9F/5F * celcius) + 32;
	kelvin = celcius + 273;
	System.out.println("Suhu dalam celcius\t: " + celcius);
	System.out.println("Suhu dalam reaumur\t: " + reaumur);
	System.out.println("Suhu dalam fahrenheit\t: " + fahrenheit);
	System.out.println("Suhu dalam kelvin\t: " + kelvin);
    }
}

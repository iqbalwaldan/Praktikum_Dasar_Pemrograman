    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Percobaan1DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, fac, i;
        System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
        System.out.print("Masukkan bilangan: ");
        
        angka = input.nextInt();
        fac = 1;
        i = 1;
        do
        {
            fac = fac*i;
            i++;
        }
        while (i<=angka);
        System.out.printf("Nilai faktorial bilangan tersebut adalah: %d \n",fac);
    }
}

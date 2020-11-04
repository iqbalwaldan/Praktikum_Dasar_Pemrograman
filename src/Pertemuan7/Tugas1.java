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
public class Tugas1 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int a,i,x,y;
        System.out.print("Masukkan angka : ");
        a = angka.nextInt();
        x = 5;
        y = 1;
        for (i = 1; i <= a; i++){
            if (i == x) {
                x = 5 * ++y;
                continue;
            }
            System.out.println(i);
        }
    }
}

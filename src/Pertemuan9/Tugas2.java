/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();
        for (int b = 1; b<=n; b++ ) {
            int c = n;
            while (c>=b){
                System.out.print("*");
                c--;
            }
            System.out.println();
        }
    }
}

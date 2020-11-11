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
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();
        int b = 1;
        while (b<=n) {
            for (int c = n; c>b; c--){
                System.out.print(" ");
            }
            for (int d = 1; d<=n; d++){
                System.out.print(d);
                if(d == b)break;
            }
            System.out.println();
            b++;
        }
    }
}

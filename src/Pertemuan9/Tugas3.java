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
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();
        int x=n-2;
        int a = 1;
        do {
            int b = 1;
            if (a==1||a==n){
                while(b<=n){
                    System.out.print(n);
                    System.out.print(" ");
                    b++;
                }
            }else {
                int c = 1;
                while(c<=n){
                    if (c==1||c==n){
                        System.out.print(n);
                        System.out.print(" ");
                    }else {
                        System.out.print("  ");
                    }
                    c++;
                }
            }
            System.out.println();
            a++;
        } while (a<=n);
    }
}

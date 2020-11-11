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
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n) {
            int j = 0;
            while(j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

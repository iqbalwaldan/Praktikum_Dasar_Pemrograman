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
public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.print("*");
        }
    }
}

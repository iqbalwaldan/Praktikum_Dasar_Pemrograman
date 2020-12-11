/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Tugas1 {

    static int Max3(int bil1, int bil2, int bil3) {
        int x = bil1;
        if (x < bil2) {
            x = bil2;
        }
        if (x < bil3) {
            x = bil3;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan ke 1: ");
        int a = sc.nextInt();
        System.out.print("Masukkan bilangan ke 2: ");
        int b = sc.nextInt();
        System.out.print("Masukkan bilangan ke 3: ");
        int c = sc.nextInt();
        System.out.println("Nilai max: " + Max3(a, b, c));
    }
}

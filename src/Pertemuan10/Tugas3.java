/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Array: ");
        int a = sc.nextInt();
        int[] number = new int[a];
        int i = 0;
        while (i < number.length) {
            System.out.printf("Masukkan Array ke-%d: ",i);
            number[i] = sc.nextInt();
            i++;
        }
        int z = number[0];
        int c =0;
        while (c < number.length){
            if (number[c] > z){
                z = number[c];
            }
           c++;
        }
        System.out.printf("Bilangan terbesar: %d\n",z);
    }
}

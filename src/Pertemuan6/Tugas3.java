/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Tugas3 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Scanner tulisan = new Scanner(System.in);
        String nM;
        int h, bP, t, p;
        bP = 0;
        t = 0;
        System.out.print("Masukkan nama makanan: ");
        nM = tulisan.nextLine();
        System.out.print("Masukkan harga makanan: ");
        h = angka.nextInt();
        System.out.print("Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? ");
        p = angka.nextInt();
        if (h<100000 && p==0){
            bP += 20000;
            t += (h+bP);
        } else if (h<100000 && p==1){
            bP += (20000+25000);
            t += (h+bP);
        } else if (h >= 100000 && p==0){
            bP += 30000;
            t += (h+bP);
        } else if (h >= 100000 && p==1){
            bP += (30000+25000);
            t += (h+bP);
        }
        System.out.println("STRUK PEMBELIAN");
        System.out.println(nM+"\t\t\tRp "+h);
        System.out.println("Biaya pengiriman\tRp "+bP);
        System.out.println("TOTAL\t\t\tRp "+t);
    }   
}

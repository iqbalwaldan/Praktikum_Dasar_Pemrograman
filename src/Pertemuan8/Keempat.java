/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Keempat {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int a;
        
        do{
            System.out.println("Slilahkan pilih: ");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-While");
            System.out.println("5. for\n");
            System.out.println("Pilih satu:");
            a=angka.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Pemilihann if:");
                    System.out.println("If temasuk pemilihan");
                    break;
                case 2:
                    System.out.println("Pemilihann switch:");
                    System.out.println("Switch temasuk pemilihan");
                    break;
                case 3:
                    System.out.println("Pemilihann while:");
                    System.out.println("While termasuk perulangan");
                    break;
                case 4:
                    System.out.println("Pemilihann do-while:");
                    System.out.println("Do-while termasuk perulangan");
                    break;
                case 5:
                    System.out.println("Pemilihann for:");
                    System.out.println("For termasuk perulangan");
                    break;
                default:
                    break;
            }
        } while (false);
    }
}

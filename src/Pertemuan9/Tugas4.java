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
public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();
        int a = 1;
        do{
            if(a%2==1){
                for (int b = 1; b<=n; b++){
                    System.out.print(b);
                }
            } else{
                for (int b = n; b>=1; b--){
                    System.out.print(b);
                }
            }
            System.out.println();
            a++;
        }while (a<=n);
    }
}

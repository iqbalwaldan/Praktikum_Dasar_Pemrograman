 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Tugas2 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int n,b,j,l,x,y;
        System.out.println("Menghitung Jumlah Bilangan dari N Bilangan");
        System.out.println("__________________________________________");
        System.out.print("Masukkan range bilangan = ");
        n = angka.nextInt();
        b = n / 2;
        x=0;
        y=0;
        System.out.printf("Banyaknya bilangan genap dari 1 sampai %d adalah %d\n",n,b);
        for (l = 1; l <= n; l++){
            if ((l%2)==1) continue;
            y+=l;
            x++;
            System.out.printf("Bilangan genap ke-%d adalah %d\n",x,l);
        }
        System.out.printf("Jumlah bilangan genap dari 1 sampai %d = %d\n",n,y);
        y = y/b;
        System.out.printf("Rata-rata bilangan genap dari 1 sampai %d = %d\n",n,y);
    }
}

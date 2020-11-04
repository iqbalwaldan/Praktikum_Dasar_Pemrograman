/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

/**
 *
 * @author iqbal
 */
public class Tugas3 {
    public static void main(String[] args) {
        int a,b,c,d;
        a = 1;
        b = 0;
        int i = 1;
        do {
            c = a + b;
            System.out.printf("%d + %d = %d\n",b,a,c);
            b = a;
            a = c;
            i++;
        } while(i<=10);
    }
}

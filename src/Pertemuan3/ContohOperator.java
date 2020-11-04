/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author iqbal
 */
public class ContohOperator {
    public static void main(String[] args) {
        int x = 10;
	System.out.println("x++ = " + x++);
	System.out.println("Setelah evaluasi, x = " + x);
	System.out.println("++x = " + ++x);
	System.out.println("Setelah evaluasi, x = " + x);
	int y = 12;
	System.out.println(x > y || y == x && y <= x);
	int z = x ^ y;
	System.out.println("Hasil x ^ y adalah " + z);
	z %= 2;
	System.out.println("Hasil akhir " + z);
    }
}

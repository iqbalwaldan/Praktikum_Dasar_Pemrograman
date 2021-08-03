/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class NewClass {

    public static void main(String[] args) {
        int awal = 0;
        int akhir = 10;
        int bil;
        for (int i = awal; i <= akhir; i++) {
            bil = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bil++;
                } else {

                }
            }
            if (bil == 2) {
                System.out.print(i + " ");
            }
        }
    }
}

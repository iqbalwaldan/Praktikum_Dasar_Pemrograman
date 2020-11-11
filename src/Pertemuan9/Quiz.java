/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9;

import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author iqbal
 */
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu ='y';
        System.out.println("SELAMAT DATANG DI GAME TEBAK ANGKA!!!");
        System.out.println("-------------------------------------");
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tembak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                if (answer < number){
                    System.out.printf("%d < answer\n",answer);
                }else if(answer > number){
                    System.out.printf("%d > answer\n",answer);
                }else System.out.println("Selamat jawaban Anda benar!!!");
            } while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while (menu=='y' || menu=='Y');
    }
}

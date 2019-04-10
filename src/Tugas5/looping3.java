/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author comesaid
 */
public class looping3 {

    public static void main(String[] args) {
                            
        // Menampilkan angka dari angka 0-100           
        System.out.println("Menampilkan angka dari angka 0-100");

        for (int j = 0;j <= 100; j++) {
            System.out.println("j = " + j);
        }
         
        // Menampilkan angka dari angka 100-0
        System.out.println("\n");
        System.out.println("Menampilkan angka dari angka 100-0");

        for (int k = 100; k <= 100 && k >= 0; k--) {
            System.out.println("k = " + k);
        }
        
        // Menampilkan Bilangan ganjil dari angka 0-100
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan ganjil dari angka 0-100");

        for (int l = 0; l <= 100; l++) {
            if (l % 2 == 1) {
                System.out.println("l = " + l);
            }
        }
       
        // Menampilkan Bilangan genap dari angka 0-100
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan genap dari angka 0-100");

        for (int m = 0; m <= 100; m++) {
            if (m % 2 == 0) {
                System.out.println("m = " + m);
            }
        }

        // Menampilkan Bilangan kelipatan 5 dari angka 0-100
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan kelipatan 5 dari angka 0-100");
        for (int n = 0; n <= 100; n = n + 5) {
            System.out.println("n = " + n);
        }
        
        // Menampilkan Bilangan pangkat 2 dari 0-100
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan pangkat 2 dari 0-100");
        for (int i = 0;i <= 10; i++){
            int bilanganPangkat2;
            bilanganPangkat2 = (int) Math.pow(i, 2);
            System.out.println("i : " + bilanganPangkat2);
        }

    }
}

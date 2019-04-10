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
public class looping2 {

    public static void main(String[] args) {

        
        // Menampilkan angka dari angka 0-100
        int j = 0;
        System.out.println("Menampilkan angka dari angka 0-100");
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 100);
        
        
        // Menampilkan angka dari angka 100-0
        int k = 100;
        System.out.println("\n");
        System.out.println("Menampilkan angka dari angka 100-0");
        do {
            System.out.println("k = " + k);
            k--;
        } while (k >= 0);

        // Menampilkan Bilangan ganjil dari angka 0-100    
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan ganjil dari angka 0-100");
        int l = 0;
        do {
            if (l % 2 == 1) {
                System.out.println("l = " + l);
            }
            l++;
        } while (l <= 100);

        // Menampilkan Bilangan genap dari angka 0-100
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan genap dari angka 0-100");
        int m = 0;
        do {
            if (m % 2 == 0) {
                System.out.println("m = " + m);
            }
            m++;
        } while (m <= 100);
        
        // Menampilkan Bilangan kelipatan 5 dari angka 0-100
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan kelipatan 5 dari angka 0-100");
        int n = 0;
        do {
            System.out.println("n = " + n);
            n = n + 5;
        } while (n <= 100);
        
        // Menampilkan Bilangan pangkat 2 dari 0-100
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan pangkat 2 dari 0-100");
        int i = 0;
         do{
            int bilanganPangkat2;
            bilanganPangkat2 = (int) Math.pow(i, 2);
            System.out.println("i : " + bilanganPangkat2);
            i++;
        }while (i <= 10);

    }
}

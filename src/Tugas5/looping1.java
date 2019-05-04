/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author saidalbaqi
 */
public class looping1 {

    public static void main(String[] args) {
        
        // Menampilkan angka dari angka 0-100
        int j = 0;
        System.out.println("Menampilkan angka dari angka 0-100");
        while (j <= 100) {
            System.out.println("j = " + j);
            j++;
        }

        // Menampilkan angka dari angka 100-0    
        System.out.println("\n");
        System.out.println("Menampilkan angka dari angka 100-0");
        int k = 100;
        while (k >= 0) {
            System.out.println("k = " + k);
            k--;            
        }
                
        // Menampilkan Bilangan ganjil dari angka 0-100
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan ganjil dari angka 0-100");
        int l = 0;

        while (l <= 100) {
            if (l % 2 == 1) {
                System.out.println("l = " + l);
            }
            l++;
        }
        
        
        //Menampilkan Bilangan genap dari angka 0-100
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan genap dari angka 0-100");
        int m = 0;

        while (m <= 100) {
            if (m % 2 == 0) {
                System.out.println("m = " + m);
            }
            m++;
        }
        
        //Menampilkan Bilangan kelipatan 5 dari angka 0-100
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan kelipatan 5 dari angka 0-100");
        int n = 0;
        while (n <= 100) {
            System.out.println("n = " + n);
            n=n+5;
        }
        
        //Menampilkan Bilangan pangkat 2 dari 0-100
        System.out.println("\n");
        System.out.println("Menampilkan Bilangan pangkat 2 dari 0-100");
        int i = 0;
        while (i <= 10) {
            int bilanganPangkat2;
            bilanganPangkat2 = (int) Math.pow(i, 2);
            System.out.println("i : " + bilanganPangkat2);
            i++;
        }

    }

}

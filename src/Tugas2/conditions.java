/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author come.said
 */
public class conditions {
    public static void main(String[] args) {
        // Program konversi nilai angka menjadi huruf
        
        // Membuat variable dan memasukkan nilainya
        int nilaiAngka = 90;
        
        // merubah nilainya
        if(nilaiAngka < 0 || nilaiAngka > 100) {
            System.out.println("Nilai yang anda masukkan salah");
        }else{
            if(nilaiAngka >= 91 && nilaiAngka <= 100 ){
                System.out.println("Konversi nilainya yaitu : A" );
            }else if (nilaiAngka >= 86 && nilaiAngka <= 90 ){
                 System.out.println("Konversi nilainya yaitu : A-" );
            }else if (nilaiAngka >= 81 && nilaiAngka <= 85  ){
                 System.out.println("Konversi nilainya yaitu : B+" );
            }else if (nilaiAngka >= 76 && nilaiAngka <= 80  ){
                 System.out.println("Konversi nilainya yaitu : B" );
            }else if (nilaiAngka >= 71 && nilaiAngka <= 75  ){
                 System.out.println("Konversi nilainya yaitu : B-" );
            }else if (nilaiAngka >= 66 && nilaiAngka <= 70  ){
                 System.out.println("Konversi nilainya yaitu : C+" );
            }else if (nilaiAngka >= 61 && nilaiAngka <= 65  ){
                 System.out.println("Konversi nilainya yaitu : C" );
            }else if (nilaiAngka >= 56 && nilaiAngka <= 60  ){
                 System.out.println("Konversi nilainya yaitu : C-" );
            }else if (nilaiAngka >= 51 && nilaiAngka <= 55  ){
                 System.out.println("Konversi nilainya yaitu : D" );
            }else{
                System.out.println("Konversi Nilainya yaitu E");                
            }
        }
        
    }
}
